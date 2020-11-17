package com.younify.backend.controller.system;

import com.younify.backend.service.system.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class SystemController {

    private final SystemService service;
    private final SystemMapper mapper;

    @Autowired
    public SystemController(SystemService service, SystemMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/systems")
    public ResponseEntity<SystemList> getAllSystems(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(mapper.convertToSystemDtoList(service.findAllSystems().stream().map(mapper::map).collect(Collectors.toList())));
    }
}
