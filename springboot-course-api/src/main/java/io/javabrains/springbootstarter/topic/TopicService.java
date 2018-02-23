package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics =  Arrays.asList(
			new Topic("spring", "Springframework", "Spring Description"), 
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("angular", "AngularJS", "AngularJS Description")			
			);

	public List<Topic> getAllTopics() {
		
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}
}
