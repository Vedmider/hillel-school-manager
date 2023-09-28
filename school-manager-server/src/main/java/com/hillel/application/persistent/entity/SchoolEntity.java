package com.hillel.application.persistent.entity;

import com.hillel.application.service.validation.group.BasicInfo;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Set;

@Entity(name = "school")
@Table(name = "it_school")
@NamedEntityGraph(
        name = "post-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("director")
        }
)
@Validated
@Getter
@Setter
public class SchoolEntity {

    @Id
    @GeneratedValue
    @NotBlank
    private Long id;

    @Column(name = "school_name")
    @Pattern(regexp = "^[\\w-\\._]+$")
    private String name;

    @Column(name = "school_address")
    @NotNull(groups = {BasicInfo.class})
    private String address;

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "secured_director_id")
    private Director director;

    @ManyToMany
    @JoinTable(
            name = "city_school_table",
            joinColumns = @JoinColumn(name = "city_id"),
            inverseJoinColumns = @JoinColumn(name = "school_id"))
    private Set<City> cities;

    @ElementCollection
    @CollectionTable(name = "item_tag", joinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    @Column(name = "tag")
    private List<@Size(max = 48) @Pattern(regexp = "^((?![\\|\\/]).)*$") String> tags;

    @Version
    private Long version;

    public SchoolEntity() {
    }

    public void removeDirector(Director director) {
        this.director = null;

    }

    public @NotNull Director getDirector(@Valid SchoolEntity schoolEntity) {
        return this.director;
    }

}
