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

}
