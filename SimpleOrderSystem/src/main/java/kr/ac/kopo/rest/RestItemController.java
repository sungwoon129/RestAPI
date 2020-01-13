package kr.ac.kopo.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import kr.ac.kopo.model.Item;
import kr.ac.kopo.service.ItemService;

@RestController
public class RestItemController {
	private ItemService itemService;
	
	@Inject
	public RestItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@RequestMapping(value="/item/list",method=RequestMethod.GET)
	public ResponseEntity<List<Item>> allItemList() {
		final List<Item> itemList = itemService.findAllItem();
		
		if(itemList.isEmpty()) {
			return new ResponseEntity<List<Item>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Item>>(itemList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/item/{itemId}",method=RequestMethod.GET)
	public ResponseEntity<Item> getItem(@PathVariable("itemId") final int itemId,UriComponentsBuilder ucBuilder) {
		final Item fetchedItem = itemService.findById(itemId);
		if(fetchedItem == null) {
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}
			
		return new ResponseEntity<Item>(fetchedItem,HttpStatus.OK);
	}
}
