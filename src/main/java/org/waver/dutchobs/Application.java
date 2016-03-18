package org.waver.dutchobs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@ComponentScan
public class Application {
	
	public static void main(String[] args){
		System.out.println("starting application");
		SpringApplication.run(Application.class,args);
	}

}
