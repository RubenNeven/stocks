package com.younify.frontend.controller.system;

import com.younify.frontend.model.System;
import org.springframework.stereotype.Component;

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
}
