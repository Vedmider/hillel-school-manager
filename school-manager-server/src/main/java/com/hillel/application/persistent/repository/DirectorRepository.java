package com.hillel.application.persistent.repository;

import com.hillel.application.persistent.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}
