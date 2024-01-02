package com.SbLabb.controller;

import com.SbLabb.model.Kategori;
import com.SbLabb.repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kategorier")
public class KategoriController {

    @Autowired
    private KategoriRepository kategoriRepository;

    @GetMapping
    public List<Kategori> getAllKategorier() {
        return kategoriRepository.findAll();
    }

    @GetMapping("/{id}")
    public Kategori getKategoriById(@PathVariable Long id) {
        return kategoriRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Kategori createKategori(@RequestBody Kategori kategori) {
        return kategoriRepository.save(kategori);
    }

    // Eventuellt lägg till andra metoder för att uppfylla uppgiftens krav

}
