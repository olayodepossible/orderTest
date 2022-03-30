package com.possible.orderitem.service;

import com.possible.orderitem.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private OrdersService ordersService;

    public int getNumberOfItemsBought(String username){
        return ordersService.itemsBought(username).stream().mapToInt(Item::getQuantity).sum();
    }

}
