package com.iocapp.services;

import org.springframework.stereotype.Service;

@Service("tough")
public class ToughTask implements Task {

	@Override
	public void doThis() {
		// TODO Auto-generated method stub
            System.out.println("Doing Tough Task");
	}

}
