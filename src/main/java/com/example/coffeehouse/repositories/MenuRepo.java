package com.example.coffeehouse.repositories;

import java.util.List;

import com.example.coffeehouse.model.Shop;
import com.example.coffeehouse.model.ShopMenu;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<ShopMenu , Integer> {
    
    List<ShopMenu> findByShop(Shop shop);
}
