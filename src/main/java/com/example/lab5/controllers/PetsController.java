package com.example.lab5.controllers;

import com.example.lab5.models.Owners;
import com.example.lab5.models.Pets;
import com.example.lab5.services.OwnersService;
import com.example.lab5.services.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pets")
public class PetsController {
    private final PetsService petsService;

    @Autowired
    public PetsController(PetsService petsService) {
        this.petsService = petsService;
    }

    @GetMapping()
    public String showAll(Model model) {
        model.addAttribute("pets", petsService.getAll());
        return "pets/show";
    }

    @GetMapping("/new")
    public String newPet(@ModelAttribute("pets") Pets pets) {
        return "pets/new";
    }

    @PostMapping()
    public String add(@RequestParam("name") String name,
                      @RequestParam("idVeterinar") int idVeterinar,
                      @RequestParam("idSick") int idSick) {
        petsService.save(name, idVeterinar, idSick);
        return "redirect:/pets";
    }
}
