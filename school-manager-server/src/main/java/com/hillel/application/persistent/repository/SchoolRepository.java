package com.hillel.application.persistent.repository;

import com.hillel.application.persistent.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SchoolRepository extends JpaRepository<School, Long> {


}
