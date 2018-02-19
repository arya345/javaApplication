package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class topiccontroller {
	
	@Autowired
	private topicservice topicservice;
	
	@RequestMapping("/toics")
		public List<toic>getAlltopics() {
			
			return topicservice.getAlltopics();
		}
		
		@RequestMapping("/toics/{id}")
		public toic gettpoic(@PathVariable String id) {
			return topicservice.gettopic(id);
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/toics")
		public void addtopic(@RequestBody toic toic) {
			
			topicservice.oddtopic(toic);
		}
		@RequestMapping(method=RequestMethod.PUT,value="/toics/{id}")
		public void updatetopic(@RequestBody toic toic,@PathVariable String id) {
			
			topicservice.updatetopic(id,toic);
		
	}
		@RequestMapping(method=RequestMethod.DELETE,value="/toics/{id}")
		public void deletetpoic(@PathVariable String id) {
			topicservice.deletetopic(id);
		}
}
