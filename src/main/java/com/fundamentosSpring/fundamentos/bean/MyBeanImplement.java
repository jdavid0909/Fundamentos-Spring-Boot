package com.fundamentosSpring.fundamentos.bean;

import org.springframework.stereotype.Component;


public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("estoy imprimeindo desde el bean");
    }
}
