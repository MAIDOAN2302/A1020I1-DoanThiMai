package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.ClassRoom;
import vn.codegym.model.Course;
import vn.codegym.model.Student;
import vn.codegym.service.ClassRoomService;
import vn.codegym.service.CourseService;
import vn.codegym.service.StudentService;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping(value = {"student", ""}, name = "studentController")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    ClassRoomService classRoomService;

    @Autowired
    CourseService courseService;

    @GetMapping(value = "/edit/{id}")
    public String showEditPage(@PathVariable("id") int studentId, ModelMap modelMap) {
        modelMap.addAttribute("student", studentService.finById(studentId));
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String editStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes) {
        studentService.update(student);
        redirectAttributes.addFlashAttribute("successMsg", "Update student: "
                + student.getName() + " OK");

        return "redirect:/student/list";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
        Student student = studentService.finById(id);
        if (student != null) {
            redirectAttributes.addFlashAttribute("successMsg", "Delete student: "
                    + student.getName() + " OK");

            studentService.remove(student);

        } else {
            redirectAttributes.addFlashAttribute("successMsg", "Student not found!");
        }

        return "redirect:/student/list";
    }
//
//    @GetMapping(value = "/search")
//    public ModelAndView searchStudent(@RequestParam("kq") String kq) {
//        return new ModelAndView("list", "studentList",
//                studentService.searchByName(kq));
//    }


    @GetMapping(value = "/search")
    public ModelAndView searchStudent(@RequestParam("kq") String kq,
//                                      @RequestParam("gender") int gender,
                                      @PageableDefault(value = 2) Pageable pageable) {
        return new ModelAndView("list", "studentList",
                studentService.searchByName(kq, pageable));
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView showStudentList(@PageableDefault(value = 2) Pageable pageable) {
        return new ModelAndView("list", "studentList",
                studentService.findAll(pageable));
    }

    @GetMapping(value = "/create")
    public String showCreatePage(Model model) {
        List<ClassRoom> classRoomList = classRoomService.findAll();
        List<Course> courseList = courseService.findAll();

        model.addAttribute("student", new Student());
        model.addAttribute("classRoomList", classRoomList);
        model.addAttribute("courseList", courseList);

        return "create";
    }

    @PostMapping(value = "/create")
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("successMsg", "create student: "
                + student.getName() + " OK");
        System.out.println(student);

        student.getAccount().setDateCreate(new Date(System.currentTimeMillis()));
        studentService.save(student);
        return "redirect:/student/list";
//        return "list";
    }

}
