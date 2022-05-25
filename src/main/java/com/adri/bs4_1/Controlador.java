package com.adri.bs4_1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
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

    @GetMapping("/miconfiguracion")
    public String getMiConfiguracion(){
        Configuracion config = (Configuracion)Ejerciciobs41SpringApplication.cac.getBean(Configuracion.class);
        return "Valor 1: " + config.getValor1() +"\nValor 2: " + config.getValor2();
    }
}
