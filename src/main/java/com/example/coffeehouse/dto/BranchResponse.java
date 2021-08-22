package com.example.coffeehouse.dto;

import java.util.List;

import com.example.coffeehouse.model.ShopMenu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BranchResponse {

    private String name;
    private List<ShopMenu> menu;
    public BranchResponse(String name , List<ShopMenu> menu) {
        this.name = name;
        this.menu = menu;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<ShopMenu> getMenu() {
        return menu;
    }
    public void setMenu(List<ShopMenu> menu) {
        this.menu = menu;
    }
}
