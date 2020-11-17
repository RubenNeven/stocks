package com.younify.frontend.service.system;

import com.younify.frontend.controller.system.SystemDto;
import com.younify.frontend.controller.system.SystemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    private final RestTemplate restTemplate;

    @Autowired
    public SystemServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<SystemDto> getAllSystems() {
        ResponseEntity<SystemList> systemListResponseEntity = restTemplate.getForEntity("http://localhost:8081/api/systems", SystemList.class);
        SystemList systemList = systemListResponseEntity.getBody();
        List<SystemDto> systems = systemList.getSystems();
        return systems;
    }
}
