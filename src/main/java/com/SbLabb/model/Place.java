package com.SbLabb.model;

import javax.persistence.*;

@Entity
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namn;

    @ManyToOne
    @JoinColumn(name = "kategori_id")
    private Category category;



}