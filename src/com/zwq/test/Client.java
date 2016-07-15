package com.zwq.test;

import com.zwq.test.facade.Facade;
import com.zwq.test.service.ServiceA;
import com.zwq.test.service.ServiceB;
import com.zwq.test.service.impl.ServiceAImpl;
import com.zwq.test.service.impl.ServiceBImpl;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceA sa = new ServiceAImpl();
		  ServiceB sb = new ServiceBImpl();
		  sa.methodA();
		  sb.methodB();
		  System.out.println("=====================");
		  Facade f = new Facade();
		  f.methodA();
		  f.methodB();
		  f.methodC() ;System.out.println("new lnne  local");
		  
		  //hahahaha
	}
	
	/**
	 * add new line from local
	 */
}
