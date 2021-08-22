package com.example.coffeehouse.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String name;

    @Column(length = 255)
    private String shopImage;


    @OneToMany(targetEntity= ShopMenu.class , mappedBy = "shop" ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ShopMenu> menu = new ArrayList<>();

    public Shop() {}

    public Shop(String name , String shopImage) {
        this.name = name;
        this.shopImage = shopImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    public List<ShopMenu> getMenu() {
        return menu;
    }

    public void setMenu(List<ShopMenu> menu) {
        this.menu = menu;
    }



    @Override
    public String toString() {
        return "Shop [id=" + id + ", name=" + name + "]";
    }

    

    
}
