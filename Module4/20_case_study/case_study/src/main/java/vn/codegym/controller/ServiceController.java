package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.*;
import vn.codegym.service.RentTypeService;
import vn.codegym.service.ServiceService;
import vn.codegym.service.ServiceTypeService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @Autowired
    RentTypeService rentTypeService;

    @Autowired
    ServiceTypeService serviceTypeService;

    @ModelAttribute("listRentType")
    public List<RentType> rentTypeList(){
        return rentTypeService.findAll();
    }

    @ModelAttribute("listServiceType")
    public List<ServiceType> serviceTypeList(){
        return serviceTypeService.findAll();
    }

    @GetMapping("/list")
    public String showListCustomer(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<Service> services = serviceService.findAll(pageable);
        model.addAttribute("services", services);
        return "service/list";
    }

    @GetMapping("/create")
    public String showFormCreateService(Model model) {
        model.addAttribute("service", new Service());
        model.addAttribute("rentType", new RentType());
        model.addAttribute("serviceType", new ServiceType());
        return "service/create";
    }

    @PostMapping("/save")
    public String saveCreatedCustomer(@Valid @ModelAttribute Service service, BindingResult bindingResult, Model model) {
        if (serviceService.existById(service.getId())) {
            model.addAttribute("service", service);
            model.addAttribute("error", "Mã DV đã tồn tại!");
            return "service/create";
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("service", service);
            return "service/create";
        }
        serviceService.save(service);
        return "redirect:/service/list";
    }
}
