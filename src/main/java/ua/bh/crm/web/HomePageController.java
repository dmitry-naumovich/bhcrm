package ua.bh.crm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/home"})
public class HomePageController {

    @RequestMapping
    public String home(Model model) {
        model.addAttribute("message", "hahahahah");
        return "home";
    }
}
