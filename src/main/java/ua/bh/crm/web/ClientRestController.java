package ua.bh.crm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.bh.crm.entity.Client;
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
    public String findAll(Model model, Pageable pageable) {
        //model.addAttribute("clients", clientService.findAll(pageable));
        return "clients";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") long id, Model model) {
        model.addAttribute("client", clientService.findById(id));
        return "client";
    }

    @PostMapping
    public String create(Client client) {
        Client newClient = clientService.create(client);
        return "redirect:/clients/" + newClient.getId();
    }
}
