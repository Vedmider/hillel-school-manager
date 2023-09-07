package com.hillel.application.service;

import com.hillel.application.persistent.entity.School;
import com.hillel.application.persistent.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public School create() {
        return new School();
    }

    @Override
    public School create(Long id) {
        return new School(id, null, null);
    }

    public School findInRepository(Long id) {
        return schoolRepository.findById(id).get();
    }
}
