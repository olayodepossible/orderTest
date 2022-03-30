package com.possible.orderitem.repository;

import com.possible.orderitem.model.Item;
import com.possible.orderitem.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findItemByUser(User user);
}
