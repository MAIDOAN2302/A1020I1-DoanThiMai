package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Customer;
import vn.codegym.model.Province;
import vn.codegym.service.CustomerService;
import vn.codegym.service.ProvinceService;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    ProvinceService provinceService;

    @ModelAttribute("province")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping(value = {"/list", "/"})
    public String listCustomers(Model model){
        List<Customer> theCustomers = customerService.getCustomers();
        model.addAttribute("customers",theCustomers);
        return "customer/list-customer";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer/create";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customers") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/list";
    }
    @GetMapping("/update")
    public String showFormEdit(@RequestParam("id") int id, Model model){
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer);
        return "customer/edit";
    }
    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String showFormDelete(@RequestParam("id") int id){
        customerService.deleteCustomerById(id);
        return "redirect:/";
    }
}
