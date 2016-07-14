package com.zwq.test.facade;

import com.zwq.test.service.ServiceA;
import com.zwq.test.service.ServiceB;
import com.zwq.test.service.ServiceC;
import com.zwq.test.service.impl.ServiceAImpl;
import com.zwq.test.service.impl.ServiceBImpl;
import com.zwq.test.service.impl.ServiceCImpl;

public class Facade {
	ServiceA sa;
	ServiceB sb;
	ServiceC sc;

	public Facade() {
		sa = new ServiceAImpl();
		sb = new ServiceBImpl();
		sc = new ServiceCImpl();
	}

	public void methodA() {
		sa.methodA();
//		sb.methodB();
	}

	public void methodB() {
		sb.methodB();
//		sc.methodC();
	}

	public void methodC() {
		sc.methodC();
//		sa.methodA();
	}
	
}
