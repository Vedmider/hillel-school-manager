package com.hillel.application.persistent.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "director_super_director")
@Getter
@Setter
public class Director {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "lastName", column = @Column(name = "last_name", length = 5)),
            @AttributeOverride(name = "firstName", column = @Column(name = "first_name"))
    })
    private ContactInfo contactInfo;


    @OneToOne(mappedBy = "director")
    private SchoolEntity schoolEntity;


}
