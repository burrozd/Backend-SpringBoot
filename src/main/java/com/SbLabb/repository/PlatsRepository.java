package com.SbLabb.repository;

import com.SbLabb.model.Plats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatsRepository extends JpaRepository<Plats, Long> {

    // Lägg till eventuella anpassade metoder om det behövs

}
