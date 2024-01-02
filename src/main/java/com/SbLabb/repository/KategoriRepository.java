package com.SbLabb.repository;

import com.SbLabb.model.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategoriRepository extends JpaRepository<Kategori, Long> {

    // Lägg till eventuella anpassade metoder om det behövs

}
