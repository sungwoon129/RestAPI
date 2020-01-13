package kr.ac.kopo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.ItemDao;
import kr.ac.kopo.model.Item;

@Service
public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	
	@Inject
	public ItemServiceImpl(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	@Override  
	public List<Item> findAllItem() {
		return itemDao.findAllItem();
	}
	@Override
	public Item findById(int itemId) {
		return itemDao.findById(itemId);
	}

}
