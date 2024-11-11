package com.iocapp.integraton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iocapp.components.DataStore;

import jakarta.annotation.PostConstruct;

//@Component
public class IntegratedVersion2 {
 //@Autowired
 private DataStore store;
 
 //@PostConstruct
 public void perform() {
	 System.out.println("In Integrated Version2");
	 System.out.println(store);
	 store.store();
 }
}
