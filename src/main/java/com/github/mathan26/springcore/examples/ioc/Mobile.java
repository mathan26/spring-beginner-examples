package com.github.mathan26.springcore.examples.ioc;

import com.github.mathan26.springcore.examples.ioc.Airtel;
import com.github.mathan26.springcore.examples.ioc.Sim;
import com.github.mathan26.springcore.examples.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Mobile {

	public static void main(String[] args) {


		// If you want to use Airtel sim
//		Sim sim= new Airtel();
//		sim.call();
//
//		//Now you don't want to use Airtel change to Vodafone
//		Sim sim1=new Vodafone();
//		sim1.call();

		//Now you want to use Jio
		// But without touching the Source code...
		// Means the App should be configurable

		// We can use spring to achieve
		//But spring need some meta data that should be configurable outside of the source. i.e XML

		// 1. Spring can Create Object
		// 2. Spring can manage Object

		// That is called IOC container...
				// 1. BeanFactory   - Interface
				// 2. ApplicationContext - Interface  ( with More functionality than BeanFactory)
				// ======> Implementations
						// 1. ClassPathXMLContext

		System.out.println("\n\n\n");
		System.out.println("#################USING SPRING################");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("Config loaded...");
		Sim airtel=applicationContext.getBean("sim",Sim.class);
		airtel.data();


	}

}
