package com.example.lab5.controllers;

import com.example.lab5.models.SicknessHistory;
import com.example.lab5.models.Veterinars;
import com.example.lab5.services.SicknessHistoryService;
import com.example.lab5.services.VeterinarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sicknessHistories")
public class SicknessHistoryController {
    private final SicknessHistoryService sicknessHistoryService;

    @Autowired
    public SicknessHistoryController(SicknessHistoryService sicknessHistoryService) {
        this.sicknessHistoryService = sicknessHistoryService;
    }

    @GetMapping()
    public String showAll(Model model) {
        model.addAttribute("sicknessHistories", sicknessHistoryService.getAll());
        return "sicknessHistories/show";
    }

    @GetMapping("/new")
    public String newSicknessHistory(@ModelAttribute("sicknessHistories") SicknessHistory sicknessHistories) {
        return "sicknessHistories/new";
    }

    @PostMapping()
    public String add(@ModelAttribute("sicknessHistories") SicknessHistory sicknessHistories) {
        sicknessHistoryService.save(sicknessHistories);
        return "redirect:/sicknessHistories";
    }
}
