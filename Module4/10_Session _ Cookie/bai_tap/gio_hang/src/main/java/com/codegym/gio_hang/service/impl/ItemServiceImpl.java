package com.codegym.gio_hang.service.impl;

import com.codegym.gio_hang.model.Item;
import com.codegym.gio_hang.repository.ItemRepository;
import com.codegym.gio_hang.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findById(int id) {
        return itemRepository.findById(id).orElse(null);
    }
}
