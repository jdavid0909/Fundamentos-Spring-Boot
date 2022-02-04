package com.fundamentosSpring.fundamentos.bean;

public class MyBeanWithDependecyImplement implements MyBeanWithDependecy{

    private MyOperations myOperations;

    public MyBeanWithDependecyImplement(MyOperations myOperations) {
        this.myOperations = myOperations;
    }

    @Override
    public void printWithDepedency() {
        int number =1;

        System.out.println(myOperations.suma(10));
        System.out.println("estoy implementando un bean desde la dependecia");
    }
}
