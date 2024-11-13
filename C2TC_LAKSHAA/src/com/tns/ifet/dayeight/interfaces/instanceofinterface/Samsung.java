package com.tns.ifet.dayeight.interfaces.instanceofinterface;

public class Samsung implements Phone {
	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}
