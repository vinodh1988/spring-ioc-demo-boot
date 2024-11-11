package com.iocapp.integraton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iocapp.components.DataStore;

import jakarta.annotation.PostConstruct;

@Component
public class Integrated {
  @Autowired
	private DataStore store;
	
	{
		System.out.println("Integrated got Instantiated");
		System.out.println(store); // at this point of time dependency injection not happened
	}
	public Integrated(){
		System.out.println(store);
	}
	//post construct runs automatically after constructor and all properties are intialized
	@PostConstruct
	public void init() {
		System.out.println("In post construct of Integrated");
		System.out.println(store); //autowired
		store.store();
		
	}
}
