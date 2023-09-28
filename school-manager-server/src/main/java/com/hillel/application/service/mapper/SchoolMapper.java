package com.hillel.application.service.mapper;

import com.hillel.application.persistent.entity.SchoolEntity;
import com.hillel.model.School;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(imports = CityMapper.class)
public interface SchoolMapper {

    SchoolMapper INSTANCE = Mappers.getMapper( SchoolMapper.class );


    void updateCarFromDto(School schoolDto, @MappingTarget SchoolEntity entity);

    @AfterMapping
    default void updateSchoolDto(@MappingTarget School dto) {
        System.out.println(dto.toString());
    }

    default String stringToStringConvert(String string) {
        //TODO something

        return string;
    }
}
