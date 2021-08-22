package com.example.coffeehouse.repositories;

import com.example.coffeehouse.model.Shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepo extends JpaRepository<Shop , Integer>{

    public Shop findByName(String name);
    
    
}