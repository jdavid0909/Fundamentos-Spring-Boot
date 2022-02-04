package com.fundamentosSpring.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComplementTwoDependency implements ComponentDependency {

    @Override
    public void saludar() {
        System.out.println("Este es el llamado de interfaz");
    }
}
