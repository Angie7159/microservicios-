package com.Service.MicroServiciomostrar1.Service;

import com.Service.MicroServiciomostrar1.Models.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    public List<Item> finAll();
    public Item findById(Long id);
}
