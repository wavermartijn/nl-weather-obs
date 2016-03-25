package org.waver.dutchobs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@EnableWebMvc
@Configuration
@EnableScheduling
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "org.waver.dutchobs")
public class AppConfiguration {

	
	@Value("${mongo.ip}")
	private String mongoIP;
	
	@Value("${mongo.port}")
	private int mongoPort;
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	@Bean
	public MongoClient provideMongoDataBase(){
		MongoCredential credentials = MongoCredential.createMongoCRCredential("waver", "local", "waver".toCharArray());
		
		MongoClient mongoClient = new MongoClient(new ServerAddress(mongoIP,mongoPort),Arrays.asList(credentials));
		return mongoClient;
	}
}
