package com.adri.bs4_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @Autowired
    IPerfiles perfil;

    @GetMapping("/parametros")
    public String getParametros(
            @Value("${url}")String url,
            @Value("${password}")String pass
    ){
        return "Url: " +url+ "\nPassword: " +pass;
    }

    @GetMapping("/miconfiguracion")
    public String getMiConfiguracion(){
        MiConfiguracion config = Aplicacion.cac.getBean(MiConfiguracion.class);
        return "Valor 1: " + config.getValor1() +"\nValor 2: " + config.getValor2();
    }

    @GetMapping("/perfil")
    public void getPerfil(){
        perfil.miFuncion();
    }
}
