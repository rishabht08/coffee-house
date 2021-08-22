package com.example.coffeehouse.controllers;

import java.util.List;

import com.example.coffeehouse.dto.Branch;
import com.example.coffeehouse.dto.MenuRequest;
import com.example.coffeehouse.model.Shop;
import com.example.coffeehouse.model.ShopMenu;
import com.example.coffeehouse.repositories.MenuRepo;
import com.example.coffeehouse.repositories.ShopRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    @Autowired
    private ShopRepo shopRepo;

    @Autowired
    private MenuRepo menuRepo;

    @GetMapping("/get-menu/{name}")
    public Shop getMenu(@PathVariable("name") String name) {
        Shop shop = shopRepo.findByName(name);
        return shop;
    }


    @PostMapping("/add-shop")
    public Shop addMenu(@RequestBody Branch branch){
        Shop savedShop = shopRepo.save(branch.getShop());
        return savedShop;
    }


    @PostMapping("/add-menu")
    public ShopMenu addMenu(@RequestBody MenuRequest request) {
        int shopId = request.getShopId();
        Shop shop = shopRepo.getById(shopId);
        ShopMenu sm = new ShopMenu(request.getDescription() , request.getPrice() , shop);
        return menuRepo.save(sm);
    } 
   

    @GetMapping("/get-all")
    public List<Shop> getAllShops() {
        return shopRepo.findAll();
    }

    
}
