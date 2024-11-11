package com.iocapp.components;

import org.springframework.stereotype.Component;

@Component
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
