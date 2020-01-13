package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.model.Item;

public interface ItemDao {

	List<Item> findAllItem();

	Item findById(int itemId);

}
