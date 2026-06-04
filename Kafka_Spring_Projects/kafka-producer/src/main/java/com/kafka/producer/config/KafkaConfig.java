package com.kafka.producer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.kafka.producer.pojo.Employee;

@Configuration
public class KafkaConfig {

	
	
	public  ProducerFactory<String,Employee>  getProducerFactory(){
		
		
		Map<String,Object>  config = new HashMap<String,Object>();
		
		
		config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return new  DefaultKafkaProducerFactory<String, Employee>(config);
		
		
	}
	
	
	
	
	
	@Bean
	public KafkaTemplate  getKafkaTemplate() {
		
		
		return new KafkaTemplate<String, Employee>(getProducerFactory());
		
	}	
	
	
	
	
}
