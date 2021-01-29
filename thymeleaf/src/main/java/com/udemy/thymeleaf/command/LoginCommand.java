package com.udemy.thymeleaf.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginCommand {

    @NotEmpty
    private String userName;

    @NotEmpty
    private String passWord;
}

