package com.hillel.application.persistent.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

@Entity(name = "school")
@Table(name = "it_school")
public class School {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "school_name")
    @Pattern(regexp = "^[\\w-\\._]+$")
    private String name;

    @Column(name = "school_address")
    private String address;

    public School() {
        super();
    }

    public School(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
