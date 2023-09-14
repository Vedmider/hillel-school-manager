package com.hillel.application.persistent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class City {

    @Id
    private Long id;


    @ManyToMany
    private List<City> cities;
}
