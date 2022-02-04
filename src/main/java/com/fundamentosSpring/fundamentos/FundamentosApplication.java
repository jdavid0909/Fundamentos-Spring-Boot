package com.fundamentosSpring.fundamentos;

import com.fundamentosSpring.fundamentos.bean.MyBean;
import com.fundamentosSpring.fundamentos.bean.MyBeanWithDependecy;
import com.fundamentosSpring.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {


	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependecy myBeanWithDependecy;
	public FundamentosApplication(@Qualifier("complementTwoDependency") ComponentDependency componentDependency, MyBean myBean,MyBeanWithDependecy myBeanWithDependecy){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependecy = myBeanWithDependecy;

	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependecy.printWithDepedency();
	}
}
