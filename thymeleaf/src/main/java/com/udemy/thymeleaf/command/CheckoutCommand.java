package com.udemy.thymeleaf.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutCommand {
    @NotEmpty
    @Size(min = 2, max = 50)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String lastName;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String addressLine1;
    private String addressLine2;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 2)
    private String stateCode;

    @NotEmpty
    @Size(min = 5, max = 10)
    private String zipCode;
}
