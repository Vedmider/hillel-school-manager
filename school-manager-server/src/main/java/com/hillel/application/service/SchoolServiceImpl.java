package com.hillel.application.service;

import com.hillel.application.infrastructure.exceptions.SchoolManagerDefaultException;
import com.hillel.application.persistent.entity.School;
import com.hillel.application.persistent.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public School create() {
        throw new SchoolManagerDefaultException();
    }

    @Async
    public void doSomething() {

    }
}
