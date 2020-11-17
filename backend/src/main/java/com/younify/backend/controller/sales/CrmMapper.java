package com.younify.backend.controller.sales;

import com.younify.backend.entity.sales.Crm;
import org.springframework.stereotype.Component;

@Component
public class CrmMapper {

    public Crm map (CrmDto crmDto){
        return Crm.builder()
                .id(crmDto.getId())
                .customer360View(crmDto.isCustomer360View())
                .customerPortal(crmDto.isCustomerPortal())
                .system(crmDto.getSystem())
                .existence(crmDto.isExistence())
                .build();
    }

    public CrmDto map (Crm crm){
        return CrmDto.builder()
                .id(crm.getId())
                .customer360View(crm.isCustomer360View())
                .customerPortal(crm.isCustomerPortal())
                .system(crm.getSystem().getId())
                .existence(crm.isExistence())
                .build();
    }
}
