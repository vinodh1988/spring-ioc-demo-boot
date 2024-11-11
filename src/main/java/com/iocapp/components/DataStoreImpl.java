package com.iocapp.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class DataStoreImpl implements DataStore{
	
	{
		System.out.println("Data store instantiated");
	}

	@Override
	public void store() {
		// TODO Auto-generated method stub
		System.out.println("Storing The Default Data");
	}

}
