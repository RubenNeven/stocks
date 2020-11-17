package com.younify.frontend.service.system;

import com.younify.frontend.controller.system.SystemDto;
import com.younify.frontend.controller.system.SystemList;
import com.younify.frontend.model.System;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SystemService {
    List<SystemDto> getAllSystems();
}
