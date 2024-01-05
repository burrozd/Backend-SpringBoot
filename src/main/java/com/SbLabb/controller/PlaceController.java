package com.SbLabb.controller;

import com.SbLabb.model.Place;
import com.SbLabb.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platser")
public class PlaceController {

    @Autowired
    private PlaceRepository platsRepository;

    @GetMapping
    public List<Place> getAllPlatser() {
        return platsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Place getPlatsById(@PathVariable Long id) {
        return platsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Place createPlats(@RequestBody Place plats) {
        return platsRepository.save(plats);
    }


}
