package com.younify.frontend.service.sales;

import com.younify.frontend.controller.sales.CrmDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CrmServiceImpl implements CrmService {

    private final RestTemplate restTemplate;

    @Autowired
    public CrmServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void addCrm(CrmDto crmDto) {
        restTemplate.postForEntity("http://localhost:8080/api/sales/crm", crmDto , CrmDto.class);
    }
}
