package com.fundamentosSpring.fundamentos.configuration;

import com.fundamentosSpring.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperations beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependecy beanOperationOperationDependency(MyOperations myOperations){
        return new MyBeanWithDependecyImplement(myOperations);
    }
}
