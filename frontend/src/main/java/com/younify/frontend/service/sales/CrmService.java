package com.younify.frontend.service.sales;

import com.younify.frontend.controller.sales.CrmDto;
import org.springframework.http.ResponseEntity;

public interface CrmService {

    void addCrm(CrmDto crmDto);
}
