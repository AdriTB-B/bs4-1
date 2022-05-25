package com.adri.bs4_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2Impl implements IPerfiles {
    @Value("${variable1}")
    private String valorPerfil;
    @Override
    public void miFuncion() {
        System.out.println(valorPerfil);
    }
}
