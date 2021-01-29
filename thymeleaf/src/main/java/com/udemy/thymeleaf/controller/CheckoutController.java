package com.udemy.thymeleaf.controller;

import com.udemy.thymeleaf.command.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @RequestMapping("/checkout")
    public String checkoutForm(Model model){
        model.addAttribute("checkoutCommand", new CheckoutCommand());
        return "checkoutForm";
    }

    @PostMapping("/docheckout")
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult br){

        if (br.hasErrors()){
            return  "checkoutForm";
        }
        return "checkoutComplete";
    }
}
