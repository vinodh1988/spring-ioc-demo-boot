package com.iocapp.services;

import org.springframework.stereotype.Service;

@Service("easy")
public class EasyTask implements Task {

	@Override
	public void doThis() {
		// TODO Auto-generated method stub
          System.out.println("Easy Task");
	}

}
