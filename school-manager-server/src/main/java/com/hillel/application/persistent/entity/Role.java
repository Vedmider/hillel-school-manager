package com.hillel.application.persistent.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authorities")
public class Role implements GrantedAuthority {

    public static final List<String> ROLES_LIST = new ArrayList<>();
    public static final String USER_ADMIN = "USER_ADMIN";
    public static final String AUTHOR_ADMIN = "AUTHOR_ADMIN";
    public static final String BOOK_ADMIN = "BOOK_ADMIN";


    static {
        ROLES_LIST.add(USER_ADMIN);
        ROLES_LIST.add(BOOK_ADMIN);
        ROLES_LIST.add(USER_ADMIN);
    }

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Column(name = "authority")
    private String authority;

    public Role(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

}
