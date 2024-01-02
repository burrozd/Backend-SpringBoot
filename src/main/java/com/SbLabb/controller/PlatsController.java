package com.SbLabb.controller;

import com.SbLabb.model.Plats;
import com.SbLabb.repository.PlatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platser")
public class PlatsController {

    @Autowired
    private PlatsRepository platsRepository;

    @GetMapping
    public List<Plats> getAllPlatser() {
        return platsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Plats getPlatsById(@PathVariable Long id) {
        return platsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Plats createPlats(@RequestBody Plats plats) {
        return platsRepository.save(plats);
    }

    // Eventuellt lägg till andra metoder för att uppfylla uppgiftens krav

}
