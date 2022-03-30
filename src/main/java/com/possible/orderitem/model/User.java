package com.possible.orderitem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private Integer id;
    private String username;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Item> items = new ArrayList<>();
}
