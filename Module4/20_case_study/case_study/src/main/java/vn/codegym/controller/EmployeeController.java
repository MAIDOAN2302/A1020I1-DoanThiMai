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
import vn.codegym.service.department.DepartmentService;
import vn.codegym.service.educaitionDegree.EducationDegreeService;
import vn.codegym.service.employee.EmployeeService;
import vn.codegym.service.position.PositionService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    PositionService positionService;

    @Autowired
    EducationDegreeService educationDegreeService;

    @Autowired
    DepartmentService departmentService;


    @ModelAttribute("listPosition")
    public List<Position> positionList() {
        return positionService.findAll();
    }
    @ModelAttribute("listEducationDegree")
    public List<EducationDegree> educationDegreeList() {
        return educationDegreeService.findAll();
    }
    @ModelAttribute("listDepartment")
    public List<Department> departmentList() {
        return departmentService.findAll();
    }

    @GetMapping("/list")
    public String showListEmployee(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<Employee> employees = employeeService.findAll(pageable);
        model.addAttribute("employees", employees);
        return "employee/list";
    }

    @GetMapping("/create")
    public String showFormCreateEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("position", new Position());
        model.addAttribute("educationDegree", new EducationDegree());
        model.addAttribute("department", new Department());
        return "employee/create";
    }

    @PostMapping("/save")
    public String saveCreatedEmployee(@Valid @ModelAttribute Employee employee, BindingResult bindingResult, Model model) {
        if (employeeService.existById(employee.getId())) {
            model.addAttribute("employee", employee);
            model.addAttribute("error", "Mã nhân viên đã tồn tại!");
            return "employee/create";
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("employee", employee);
            return "employee/create";
        }
        employeeService.save(employee);
        return "redirect:/employee/list";
    }

    @GetMapping("/view/{id}")
    public String showFormViewEmployee(@PathVariable int id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "/employee/view";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdateEmployee(@PathVariable int id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "/employee/edit";
    }

    @PostMapping("/update")
    public String updateEmployee(@Valid @ModelAttribute Employee employee, BindingResult bindingResult,
                                 Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("employee", employee);
            return "employee/edit";
        }
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("messageUpdate", "Đã update thành công!");
        return "redirect:/employee/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id, RedirectAttributes redirectAttributes){
        employeeService.delete(id);
        redirectAttributes.addFlashAttribute("messageDelete","Successfully delete!!!");
        return "redirect:/employee/list";
    }
}
