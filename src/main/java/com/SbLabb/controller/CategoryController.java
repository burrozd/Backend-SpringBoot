package com.SbLabb.controller;

import com.SbLabb.model.Category;
import com.SbLabb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kategorier")
public class CategoryController {

    @Autowired
    private CategoryRepository kategoriRepository;

    @GetMapping
    public List<Category> getAllKategorier() {
        return kategoriRepository.findAll();
    }

    @GetMapping("/{id}")
    public Category getKategoriById(@PathVariable Long id) {
        return kategoriRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Category createKategori(@RequestBody Category category) {
        return kategoriRepository.save(category);
    }

    // Eventuellt lägg till andra metoder för att uppfylla uppgiftens krav

}