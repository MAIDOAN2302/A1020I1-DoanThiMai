package dictionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String dictionary() {
        return "index";
    }

    @RequestMapping(value = "/translate", method = RequestMethod.GET)
    public String translator(@RequestParam String english, Model model) {
        String vietnamese = null;
        switch (english){
            case "hello":
                vietnamese = "xin chào";
                break;
            case "book":
                vietnamese = "sách";
                break;
            case "student":
                vietnamese = "học sinh";
                break;
            case "teacher":
                vietnamese = "giáo viên";
                break;
            default:
                vietnamese = "Word you want search can not find!";
                break;
        }

        model.addAttribute("english",english);
        model.addAttribute("vietnamese",vietnamese);

        return "translate";
    }
}
