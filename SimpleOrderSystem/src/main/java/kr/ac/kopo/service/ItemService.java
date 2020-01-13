package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.model.Item;

public interface ItemService {

	List<Item> findAllItem();

	Item findById(int itemId);

}
