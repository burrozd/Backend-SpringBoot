package com.SbLabb.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Kategori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namn;

    // Andra attribut och relationer enligt uppgiften

    @OneToMany(mappedBy = "kategori")
    private List<Plats> platser;

    // Getter och setter-metoder


}
