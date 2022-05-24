package com.adri.bs4_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @GetMapping("/parametros")
    public String getParametros(
            @Value("${url}")String url,
            @Value("${password}")String pass
    ){
        return "Url: " +url+ "\nPassword: " +pass;
    }
}
