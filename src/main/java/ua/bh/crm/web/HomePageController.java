package ua.bh.crm.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController implements ErrorController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "hahahahah");
        return "home";
    }

    @GetMapping("/error")
    public String error() {
        return "/error";
    }

    @Override
    public String getErrorPath() {
        return "forward:/error";
    }
}
