package com.possible.orderitem.controller;

import com.possible.orderitem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

//    {"totalItemsBought":number}

    @GetMapping("/{username}/items/total")
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Map<String, Integer> totalItemsBought(@PathVariable String username){
        int totalItemsBought = userService.getNumberOfItemsBought(username);
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put(username, totalItemsBought);
        return itemMap;
    }

   /* @GetMapping("/{username}/items/total")
    public ResponseEntity<Map<String, Integer>> totalItemsBought(@PathVariable String username){
        int totalItemsBought = userService.getNumberOfItemsBought(username);
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put(username, totalItemsBought);
        return new ResponseEntity<>(itemMap, HttpStatus.OK);
    }*/

}
