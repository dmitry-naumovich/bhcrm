package ua.bh.crm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.bh.crm.service.IClientService;

@Controller
@RequestMapping(value = "/clients")
public class ClientRestController {

    private IClientService clientService;

    @Autowired
    public ClientRestController(IClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("clients", "they are here");
        return "clients";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") long id, Model model) {
        return "client";
    }


}
