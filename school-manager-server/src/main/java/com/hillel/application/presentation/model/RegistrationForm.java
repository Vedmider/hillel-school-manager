package com.hillel.application.presentation.model;

import com.hillel.application.service.validation.group.AdvanceInfo;
import com.hillel.application.service.validation.group.BasicInfo;
import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.NotBlank;

@GroupSequence({BasicInfo.class, AdvanceInfo.class})
public class RegistrationForm {
    @NotBlank(groups = BasicInfo.class)
    private String firstName;
    @NotBlank(groups = AdvanceInfo.class)
    private String street;
}