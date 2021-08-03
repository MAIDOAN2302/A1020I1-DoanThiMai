package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping({"","/customer"})
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = {"","/list"})
    public ModelAndView customerList(@PageableDefault(value = 2) Pageable pageable){
        return new ModelAndView("/customer/list", "customerList", customerService.findAll(pageable));
    }


    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "/customer/create";
    }

    @PostMapping(value = "/create")
    public String createCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("successMsg", "Create customer: "+customer.getName() +" success!");
        return "redirect:/";

    }
    @GetMapping(value = "/edit/{id}")
    public String showEditPage(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/customer/edit";
    }

    @PostMapping(value = "/edit")
    public String editCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.update(customer);
        redirectAttributes.addFlashAttribute("successMsg", "Update customer: "+customer.getName() +" success!");
        return "redirect:/";
    }

    @GetMapping("/search")
    public ModelAndView searchByText(@RequestParam String inputSearch, @PageableDefault(value = 10) Pageable pageable){
        return new ModelAndView("/customer/list", "customerList", customerService.findByInputText(inputSearch, pageable));
    }
}
