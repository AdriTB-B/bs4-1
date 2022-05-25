package com.adri.bs4_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application-miconfiguracion.properties")
public class MiConfiguracion {
    private final String valor1;
    private final String valor2;
    MiConfiguracion(
            @Value("${valor1}") String valor1,
            @Value("${valor2}") String valor2
    ){
        this.valor1 = valor1;
        this.valor2 = valor2;
        System.out.println("Valor 1: " + valor1 +"\nValor 2: " + valor2);
    }

    public String getValor1() {
        return valor1;
    }

    public String getValor2() {
        return valor2;
    }

}
