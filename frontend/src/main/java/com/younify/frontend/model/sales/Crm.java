package com.younify.frontend.model.sales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Crm {
    private boolean existence;
    private System system;
    private boolean customer360View;
    private boolean customerPortal;

}
