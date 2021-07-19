package com.codegym.gio_hang.service;

import com.codegym.gio_hang.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ItemService {
    List<Item> findAll();
    Item findById(int id);
}
