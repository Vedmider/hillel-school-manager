package com.hillel.application.persistent.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "director_super_director")
@Getter
@Setter
public class Director {

    @Id
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "lastName", column = @Column(name = "last_name", length = 5)),
            @AttributeOverride(name = "firstName", column = @Column(name = "first_name"))
    })
    private ContactInfo contactInfo;


    @Column(name = "last_name", length = 20)
    @Size(max = 20)
    private String lastName;

    @OneToOne(mappedBy = "director")
    private School school;


}
