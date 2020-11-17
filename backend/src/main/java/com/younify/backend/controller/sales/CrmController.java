package com.younify.backend.controller.sales;

import com.younify.backend.repository.CrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class CrmController {

    private final CrmRepository crmRepository;
    private final CrmMapper crmMapper;

    @Autowired
    public CrmController(CrmRepository crmRepository, CrmMapper crmMapper) {
        this.crmRepository = crmRepository;
        this.crmMapper = crmMapper;
    }

    @GetMapping("/crm")
    public void addCrm(CrmDto crmDto){
        crmRepository.save(crmMapper.map(crmDto));
    }
}
