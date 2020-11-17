package com.younify.frontend.controller.sales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CrmDto {
    private boolean existence;
    private System system;
    private boolean customer360View;
    private boolean customerPortal;
}
