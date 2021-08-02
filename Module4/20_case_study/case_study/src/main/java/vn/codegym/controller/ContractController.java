package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.*;
import vn.codegym.service.ContractService;
import vn.codegym.service.CustomerService;
import vn.codegym.service.EmployeeService;
import vn.codegym.service.ServiceService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    ContractService contractService;

    @Autowired
    CustomerService customerService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ServiceService serviceService;

    @ModelAttribute("listCustomer")
    public List<Customer> customerList(){
        return customerService.findAll();
    }
    @ModelAttribute("listEmployee")
    public List<Employee> employeeList(){
        return employeeService.findAll();
    }
    @ModelAttribute("listService")
    public List<Service> serviceList(){
        return serviceService.findAll();
    }
    @GetMapping("/list")
    public String showListContract(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<Contract> contracts = contractService.findAll(pageable);
        model.addAttribute("contracts", contracts);
        return "contract/list";
    }

    @GetMapping("/create")
    public String showFormCreateContract(Model model) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("customer", new Customer());
        model.addAttribute("employee", new Employee());
        model.addAttribute("service", new Service());
        return "contract/create";
    }

    @PostMapping("/save")
    public String saveCreatedContract(@Valid @ModelAttribute Contract contract, BindingResult bindingResult, Model model) {
        if (contractService.existById(contract.getId())) {
            model.addAttribute("contract", contract);
            model.addAttribute("error", "Mã HĐ đã tồn tại!");
            return "contract/create";
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("contract", contract);
            return "contract/create";
        }
        contractService.save(contract);
        return "redirect:/contract/list";
    }

    @GetMapping("/view/{id}")
    public String showFormViewContract(@PathVariable int id, Model model) {
        Contract contract = contractService.findById(id);
        model.addAttribute("contract", contract);
        return "/contract/view";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdateContract(@PathVariable int id, Model model) {
        Contract contract = contractService.findById(id);
        model.addAttribute("contract", contract);
        return "/contract/edit";
    }

    @PostMapping("/update")
    public String updateContract(@Valid @ModelAttribute Contract contract, BindingResult bindingResult,
                                 Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("contract", contract);
            return "contract/edit";
        }
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("messageUpdate", "Đã update thành công!");
        return "redirect:/contract/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteContract(@PathVariable int id, RedirectAttributes redirectAttributes){
        contractService.delete(id);
        redirectAttributes.addFlashAttribute("messageDelete","Successfully delete!!!");
        return "redirect:/contract/list";
    }
}
