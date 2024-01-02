package com.SbLabb.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Plats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namn;

    @ManyToOne
    @JoinColumn(name = "kategori_id")
    private Kategori kategori;

    // Andra attribut och relationer enligt uppgiften

    // Getter och setter-metoder

}
