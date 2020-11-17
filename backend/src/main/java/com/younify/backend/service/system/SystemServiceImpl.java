package com.younify.backend.service.system;

import com.younify.backend.entity.System;
import com.younify.backend.repository.SystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    private final SystemRepository systemRepository;

    @Autowired
    public SystemServiceImpl(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }

    @Override
    public List<System> findAllSystems() {
        return systemRepository.findAll();
    }
}
