package codegym.controller;

import codegym.repository.MailRepository;
import codegym.model.MailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MailController {
    @GetMapping("/setting")
    public String setting(Model model){
        model.addAttribute("setting", new MailSetting());
        model.addAttribute("language", MailRepository.languageList);
        model.addAttribute("pageSize", MailRepository.pageSizeList);
        return "setting";
    }

    @PostMapping("/setting")
    public String getCurrentSetting(){
        return "showSetting";
    }

    @PostMapping("/showSetting")
    public ModelAndView showSetting(@ModelAttribute("setting") MailSetting setting, RedirectAttributes redirectAttributes){
        return new ModelAndView("showSetting", "setting", setting);
    }

}
