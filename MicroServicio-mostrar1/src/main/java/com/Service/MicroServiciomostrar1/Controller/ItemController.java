package com.Service.MicroServiciomostrar1.Controller;

import com.Service.MicroServiciomostrar1.Models.Item;
import com.Service.MicroServiciomostrar1.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/listar")
    public List<Item> findAll(){
        return itemService.finAll();
    }

    @GetMapping("/listar/{id}")
    public Item findById(@PathVariable Long id){
        return itemService.findById(id);
    }
}
