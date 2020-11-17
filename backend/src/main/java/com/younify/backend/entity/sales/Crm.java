package com.younify.backend.entity.sales;

import com.younify.backend.entity.System;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "crm")
public class Crm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean existence;

    @ManyToOne
    @JoinColumn(name = "id")
    private System system;
    private boolean customer360View;
    private boolean customerPortal;
}
