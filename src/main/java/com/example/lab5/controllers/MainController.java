package com.example.lab5.controllers;

import com.example.lab5.models.Pets;
import com.example.lab5.services.OwnersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
public class MainController {
    @GetMapping()
    public String mainPage() {
        return "main";
    }
}
