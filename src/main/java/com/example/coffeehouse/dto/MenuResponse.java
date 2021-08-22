package com.example.coffeehouse.dto;

import java.util.List;

import com.example.coffeehouse.model.Shop;
import com.example.coffeehouse.model.ShopMenu;


public class MenuResponse {
    private Shop shop;
    private List<ShopMenu> shopMenu;

    
    public MenuResponse() {
    }

    public MenuResponse(Shop shop, List<ShopMenu> shopMenu) {
        this.shop = shop;
        this.shopMenu = shopMenu;
    }


    public Shop getShop() {
        return shop;
    }
    public void setShop(Shop shop) {
        this.shop = shop;
    }
    public List<ShopMenu> getShopMenu() {
        return shopMenu;
    }
    public void setShopMenu(List<ShopMenu> shopMenu) {
        this.shopMenu = shopMenu;
    }

    @Override
    public String toString() {
        return "MenuResponse [shop=" + shop + ", shopMenu=" + shopMenu + "]";
    }

    
    
}
