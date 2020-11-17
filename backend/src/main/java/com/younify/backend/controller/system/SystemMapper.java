package com.younify.backend.controller.system;

import com.younify.backend.entity.System;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SystemMapper {


    public System map(SystemDto systemDto){
        return System.builder()
                .id(systemDto.getId())
                .name(systemDto.getName())
                .company(systemDto.getCompany())
                .build();
    }

    public SystemDto map(System system){
        return SystemDto.builder()
                .id(system.getId())
                .name(system.getName())
                .company(system.getCompany())
                .build();
    }

    public SystemList convertToSystemDtoList(List<SystemDto> systems){
        return SystemList.builder()
                .systems(systems.stream().collect(Collectors.toList()))
                .build();
    }
}
