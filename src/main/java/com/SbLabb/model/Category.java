package com.SbLabb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namn;

    @OneToMany(mappedBy = "kategori")
    private List<Place> platser;

    // Getter och setter samt eventuella andra nödvändiga metoder

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public List<Place> getPlatser() {
        return platser;
    }

    public void setPlatser(List<Place> platser) {
        this.platser = platser;
    }
}
