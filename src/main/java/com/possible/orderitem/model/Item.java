package com.possible.orderitem.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "items")
public class Item {

    @Id
    private Long id;
    private String itemName;
    private String category;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
