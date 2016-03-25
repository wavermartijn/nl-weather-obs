package org.waver.dutchobs.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.waver.dutchobs.domain.Feature;
import org.waver.dutchobs.domain.WaterTemperatuurCollection;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Slf4j
@Service
public class WaterTemperatureIngestor {
	
	@Autowired
	MongoStorageService mongoStorageService;
	
	@Autowired
	public MongoClient mongoClient;
	
	
	@Value("${watertemperatuur.url}")
	String waterTemperatuurAddress;
	
	ObjectMapper mapper = new ObjectMapper();
	
	//runs every 10 seconds = 10000
	//runs every 60 minutes = 3600000
	//runs every 3 hours =   10800000
	@Scheduled(fixedRate =   10800000)
	public void ingestWaterTemperature() throws JsonParseException, JsonMappingException, MalformedURLException, IOException{
		
		log.info("running a new watertemperature ingestion");
		WaterTemperatuurCollection watertemps = this.retrieveObs();
		
		List<Feature> waterFeatures = watertemps.getFeatures();
		for (int i=0; i<waterFeatures.size(); i++){
			System.out.println(i+ " doc location "+waterFeatures.get(i).getLocatienaam()+" temp = "+waterFeatures.get(i).getWaarde());
			
		}
		String watertemperatureCollection = "watertemperatuur";
		
		MongoDatabase database = mongoStorageService.provideDatabase("rijkswaterstaat");
		
		MongoCollection<Document> watertempCollection = database.getCollection(watertemperatureCollection);

		mongoStorageService.basicSave(watertempCollection,watertemps);	
	}
	
	
	
	private WaterTemperatuurCollection retrieveObs() throws JsonParseException, JsonMappingException, MalformedURLException, IOException{
		return mapper.readValue(new URL(waterTemperatuurAddress), WaterTemperatuurCollection.class);	
	}
}