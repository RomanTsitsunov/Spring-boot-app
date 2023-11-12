package com.example.lab5.controllers;

import com.example.lab5.models.Owners;
import com.example.lab5.models.Pets;
import com.example.lab5.services.OwnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/owners")
public class OwnersController {
    private final OwnersService ownersService;

    @Autowired
    public OwnersController(OwnersService ownersService) {
        this.ownersService = ownersService;
    }

    @GetMapping()
    public String showAll(Model model) {
        model.addAttribute("owners", ownersService.getAll());
        return "owners/show";
    }

    @GetMapping("/new")
    public String newOwner(@ModelAttribute("owners") Owners owners) {
        return "owners/new";
    }

    @PostMapping()
    public String add(@ModelAttribute("owners") Owners owners) {
        ownersService.save(owners);
        return "redirect:/owners";
    }
}