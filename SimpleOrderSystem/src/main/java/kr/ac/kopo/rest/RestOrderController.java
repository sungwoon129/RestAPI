package kr.ac.kopo.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import kr.ac.kopo.model.Order;
import kr.ac.kopo.service.OrderService;

@RestController

public class RestOrderController {

	private final OrderService service;

	@Inject
	public RestOrderController(OrderService service) {

		this.service = service;
	}

	@RequestMapping(value = "/order/list", method = RequestMethod.GET)
	public ResponseEntity<List<Order>> getList() {

		final List<Order> allOrders = service.getList();

		if (allOrders.isEmpty()) {
			return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Order>>(allOrders, HttpStatus.OK);
	}

	@RequestMapping(value = "/order", produces = "text/json; charset=utf-8", method = RequestMethod.POST)
	public ResponseEntity<Void> addOrder(@RequestBody Order order, UriComponentsBuilder ucBuilder) {

		service.addOrder(order);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/orderHistory").buildAndExpand().toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.OK);
	}

	@RequestMapping(value = "/order/{orderId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteOrder(@PathVariable("orderId") final int orderId) {
		Boolean deleteResult = service.deleteOrder(orderId);

		if (deleteResult == null || !deleteResult) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	@RequestMapping(value = "/isExistId", method = RequestMethod.GET)
	public int isExist(String username) {

		return service.isExist(username);
	}

}
