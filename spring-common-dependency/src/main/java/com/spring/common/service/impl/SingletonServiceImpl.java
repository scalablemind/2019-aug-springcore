package com.spring.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.common.service.PrototypeService;
import com.spring.common.service.SingletonService;

public class SingletonServiceImpl implements SingletonService {
	
	@Autowired
	@Qualifier("prototypeService")
	private PrototypeService prototypeService;

	
	public SingletonServiceImpl() {
		System.out.println("inside constructor of singleton service impl");
	}

	@Override
	public void process() {
		System.out.println("inside singleton process service impl class....");
		prototypeService.process();
	}

}
