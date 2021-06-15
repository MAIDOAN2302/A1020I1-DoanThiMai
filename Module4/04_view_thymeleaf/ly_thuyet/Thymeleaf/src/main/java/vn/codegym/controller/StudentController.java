package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Student;
import vn.codegym.service.StudentService;
import vn.codegym.service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"student",""}, name = "studentController")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/edit/{id:[0-2]}", name = "showEditPage")
    public String showEditPage(@PathVariable("id") int studentId, ModelMap modelMap) {
        modelMap.addAttribute("student", studentService.finById(studentId));
        return "edit";
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView showStudentList() {
        return new ModelAndView("list", "studentList",
                studentService.findAll());
    }

    @GetMapping(value = "/create")
    public String showCreatePage(Model model){
        model.addAttribute("student", new Student());

        List<String> languageList = new ArrayList<>();
        languageList.add("JAVA");
        languageList.add("C#");
        languageList.add("PHP");

        model.addAttribute("languageList", languageList);

        return "create";
    }

    @PostMapping(value = "/create")
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("successMsg", "create student: "
                + student.getName() + " OK");
//        redirectAttributes.addFlashAttribute("successMsg", 1000);
        studentService.save(student);
        return "redirect:/student/list";
//        return "list";

    }
}
