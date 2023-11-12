package com.example.lab5.controllers;

import com.example.lab5.models.Owners;
import com.example.lab5.models.Veterinars;
import com.example.lab5.services.OwnersService;
import com.example.lab5.services.VeterinarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/veterinars")
public class VeterinarsController {
    private final VeterinarsService veterinarsService;

    @Autowired
    public VeterinarsController(VeterinarsService veterinarsService) {
        this.veterinarsService = veterinarsService;
    }

    @GetMapping()
    public String showAll(Model model) {
        model.addAttribute("veterinars", veterinarsService.getAll());
        return "veterinars/show";
    }

    @GetMapping("/new")
    public String newVeterinar(@ModelAttribute("veterinars") Veterinars veterinars) {
        return "veterinars/new";
    }

    @PostMapping()
    public String add(@ModelAttribute("veterinars") Veterinars veterinars) {
        veterinarsService.save(veterinars);
        return "redirect:/veterinars";
    }
}
