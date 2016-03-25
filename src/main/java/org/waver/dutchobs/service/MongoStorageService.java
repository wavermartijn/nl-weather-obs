package org.waver.dutchobs.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.bson.Document;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.waver.dutchobs.domain.Feature;
import org.waver.dutchobs.domain.WaterTemperatuurCollection;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

@Slf4j
@Service
public class MongoStorageService implements InitializingBean{

	
	

	
	public MongoClient mongoClient;
	
	@Autowired
	public void setMongoClient(MongoClient mongoClient){
		log.info("setting mongoClient");
		this.mongoClient = mongoClient;
	}
	
	MongoDatabase database;
	ObjectMapper mapper = new ObjectMapper();
	
	public String readDummy(){
		
		
		return null;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//mongoClient = context.getBean(MongoClient.class);
		System.out.println("Logged in succesfully!!");
		//mongoDB = 
			
		System.out.println("1111");	
		
		System.out.println("22222");
		String watertemperatureCollection = "watertemperatuur";
//		database = this.provideDatabase("rijkswaterstaat");
//		if (!collectionExists(watertemperatureCollection)){
//			database.createCollection(watertemperatureCollection);
//		}
		
		
	}
	
	
	public MongoDatabase provideDatabase(String databaseName){
		
		return mongoClient.getDatabase(databaseName);
		
	}
	
	
	public void basicSave(MongoCollection<Document> mongoCollection, WaterTemperatuurCollection watertemps) throws JsonProcessingException{
		
		
		Document doc = new Document();
		doc = Document.parse(mapper.writeValueAsString(watertemps));
		
//		doc.put("name", "martijn");
//		doc.put("date", new Date());
		mongoCollection.insertOne(doc);
	}
	
	private boolean collectionExists(String collectionName){
		boolean exists = false;
		MongoIterable<String> allnames = 	database.listCollectionNames();
		for (String thisname: allnames){
			if(thisname.equals(collectionName)){
				exists = true;
			}
			System.out.println("table name: "+thisname);
		}
		return exists;
	}
	
	

	
}
