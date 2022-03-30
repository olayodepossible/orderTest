package com.possible.orderitem.service;

import com.possible.orderitem.model.Item;

import java.util.List;

public interface OrdersService {

    List<Item> itemsBought(String username);
}
