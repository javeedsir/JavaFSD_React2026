package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics = "NessTopic", groupId = "group_id")
	public  void consume(String data) {
		
		System.out.println("Data consume from Producer:  "+data);
		
	}
	
	

}
