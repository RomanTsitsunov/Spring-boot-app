package com.example.lab5.controllers;

import com.example.lab5.models.Owners;
import com.example.lab5.services.OwnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ReactController {
    private final OwnersService ownersService;

    @Autowired
    public ReactController(OwnersService ownersService) {
        this.ownersService = ownersService;
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello React from Spring";
    }
    @GetMapping("owner")
    public List<Owners> owner() {
        List<Owners> owner = ownersService.getAll();
        owner.forEach(o -> o.setPets(null));
        System.out.println(owner.get(0).getName());
        /*
        ObjectMapper om = new ObjectMapper();
        //ObjectMapper ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = null;
        try {
            json = om.writeValueAsString(owner);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
         */
        return owner;
    }
}
