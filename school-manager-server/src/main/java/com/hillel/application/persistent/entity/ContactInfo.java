package com.hillel.application.persistent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class ContactInfo {

    @Column
    private String address;

    @Column
    private String phone;

    @Column
    private String firstName;

    @Column(name = "last_professional_name")
    private String lastName;
}
