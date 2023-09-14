package com.hillel.application.persistent.repository;

import com.hillel.application.persistent.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School, Long> {

    @Override
    Optional<School> findById(Long aLong);


//    List<School> findByEmailAddressAndLastname(String emailAddress, String lastname);
//
//    // Enables the distinct flag for the query
//    List<School> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
//    List<School> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);
//
//    // Enabling ignoring case for an individual property
//    List<School> findByLastnameIgnoreCase(String lastname);
//    // Enabling ignoring case for all suitable properties
//    List<School> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);
//
//    // Enabling static ORDER BY for a query
//    List<School> findByLastnameOrderByFirstnameAsc(String lastname);
//    List<School> findByLastnameOrderByFirstnameDesc(String lastname);

    @EntityGraph(attributePaths = { "school.director" }, type = EntityGraph.EntityGraphType.LOAD)
    public School getSchoolById(Long id);
}
