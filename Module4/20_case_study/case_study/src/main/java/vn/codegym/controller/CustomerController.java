package vn.codegym.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Customer;
import vn.codegym.model.CustomerType;
import vn.codegym.service.CustomerService;
import vn.codegym.service.CustomerTypeService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @ModelAttribute("listCustomerType")
    public List<CustomerType> typeList() {
        return customerTypeService.findAll();
    }

    @GetMapping("/list")
    public String showListCustomer(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<Customer> customers = customerService.findAll(pageable);
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showFormCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType", new CustomerType());
        return "customer/create";
    }

    @PostMapping("/save")
    public String saveCreatedCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, Model model) {
        if (customerService.existById(customer.getId())) {
            model.addAttribute("customer", customer);
            model.addAttribute("error", "Mã khách hàng đã tồn tại!");
            return "customer/create";
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("customer", customer);
            return "customer/create";
        }
        customerService.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/view/{id}")
    public String showFormViewCustomer(@PathVariable String id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "/customer/view";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdateCustomer(@PathVariable String id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "/customer/edit";
    }

    @PostMapping("/update")
    public String updateCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult,
                                 Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("customer", customer);
            return "customer/edit";
        }
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("messageUpdate", "Đã update thành công!");
        return "redirect:/customer/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable String id, RedirectAttributes redirectAttributes){
        customerService.delete(id);
        redirectAttributes.addFlashAttribute("messageDelete","Successfully delete!!!");
        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String searchCustomer(@Valid @RequestParam String key, int page,Model model){
        Pageable pageable = PageRequest.of(page, 3);
        Page<Customer> pageCustomer = customerService.findAllByNameContaining(key,pageable);
        model.addAttribute("customers", pageCustomer);
        return "customer/list";
    }
}
