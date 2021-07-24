package com.codegym.gio_hang.controller;

import com.codegym.gio_hang.model.Item;
import com.codegym.gio_hang.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.*;

@Controller
@SessionAttributes("cart")
public class CartController {
    @Autowired
    ItemService itemService;

    @ModelAttribute("cart")
    public Map<Integer, Item> setUpCart(){
        return new LinkedHashMap<>();
    }

    @GetMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("items",itemService.findAll());
        return "index";
    }

    @GetMapping("/addCart")
    public String addCart(@ModelAttribute("cart") Map<Integer, Item> cart, @RequestParam int id,
                          @RequestParam int quantity){
        if (cart.containsKey(id)){
            Item item1 = cart.get(id);
            item1.setQuantity(item1.getQuantity()+1);
            cart.put(id,item1);
        }else {
            Item item = itemService.findById(id);
            if (item != null){
                item.setQuantity(1);
                cart.put(id,item);
            }
        }
        return "redirect:/";
    }
    @GetMapping("/cart")
    public String showCart(@ModelAttribute("cart") Map<Integer, Item> cart, Model model, @RequestParam(defaultValue = "0") int id){
        int amount = 0;
        Set<Integer> keySet = cart.keySet();
        List<Item> items = new ArrayList<>();
        for (Integer key : keySet){
            items.add(cart.get(key));
            amount += cart.get(key).getQuantity()*cart.get(key).getPrice();
        }
        model.addAttribute("items", items);
        model.addAttribute("amount", amount);
        return "cart";
    }

    @GetMapping(value = "/updateCart")
    public String updateCart(@ModelAttribute("cart") Map<Integer, Item> cart, @RequestParam int id, @RequestParam int quantity){
        if (cart.containsKey(id)){
            Item item = cart.get(id);
            item.setQuantity(quantity);
            cart.put(id,item);
        }
        return "redirect:/cart";
    }

    @GetMapping("/delete")
    public String deleteCart(@ModelAttribute("cart") Map<Integer, Item> cart, @RequestParam(defaultValue = "0") int id){
        if (id == 0){
            cart.clear();
        } else {
            if (cart.containsKey(id)){
                cart.remove(id);
            }
        }
        return "redirect:/cart";
    }


    @GetMapping("/view")
    public String viewItem(@RequestParam int id, Model model){
        model.addAttribute("item", itemService.findById(id));
        return "view";
    }
}
