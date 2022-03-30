package com.possible.orderitem.service;

import com.possible.orderitem.model.Item;
import com.possible.orderitem.model.User;
import com.possible.orderitem.repository.ItemRepository;
import com.possible.orderitem.repository.UserRepository;
import com.sun.tools.internal.ws.wsdl.framework.NoSuchEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrdersService{

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Item> itemsBought(String username) {

        User user = userRepository.findUserByUsername(username).orElseThrow(() -> new NoSuchEntityException("User does not exist"));
        return itemRepository.findItemByUser(user);
    }
}
