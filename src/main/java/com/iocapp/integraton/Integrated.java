package com.iocapp.integraton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iocapp.components.DataStore;

@Component
public class Integrated {
  @Autowired
	private DataStore store;
	
	{
		System.out.println("Integrated got Instantiated");
	}
}
