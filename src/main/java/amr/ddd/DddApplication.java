package amr.ddd;

import amr.ddd.Domain.Interfaces.services.IThingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class DddApplication {
	ApplicationContext context =  new ClassPathXmlApplicationContext("bean/constructorInitialzation.xml");
	;
	public static void main(String[] args) {
		SpringApplication.run(DddApplication.class, args);
	}


	@Bean
	public IThingService BThingService(){
		return context.getBean("thingService", IThingService.class);
	}



}
