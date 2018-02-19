package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class topicservice {
	
	private List<toic> toics=new ArrayList<>(Arrays.asList(
	
					new toic("spring","spring framework","spring framework "),
					new toic("spring","spring framework","spring framework1 "),
					new toic("spring","spring framework","spring framework2 ")
					));
		
			public List<toic> getAlltopics(){
				
				return toics;
			}
			
		public toic gettopic(String id) {
			return toics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}

		public void oddtopic(toic toic) {
			toics.add( toic);
			
		}

		public void updatetopic(String id, toic toic) {
			for(int i=0;i<toics.size();i++) {
				toic t=toics.get(i);{
					if(t.getId().equals(id)) {
						toics.set(i,toic);
						return;
					}
					
				}
				
			}
		}

		public void deletetopic(String id) {
			toics.removeIf(t ->t.getId().equals(id));
		}}
		

		

