package org.waver.dutchobs;
import lombok.extern.slf4j.Slf4j;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan
public class Application {
	
	public static void main(String[] args){
		log.info("starting application");
		SpringApplication.run(Application.class,args);
	}

}
