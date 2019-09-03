package com.spring.common.service.impl;

import com.spring.common.service.PrototypeService;

public class PrototypeServiceImpl implements PrototypeService {
	
	public PrototypeServiceImpl() {
		System.out.println(">inside constructor of prototype service impl");
	}

	@Override
	public void process() {
		System.out.println("Inside prototype process service");
		
	}

}
