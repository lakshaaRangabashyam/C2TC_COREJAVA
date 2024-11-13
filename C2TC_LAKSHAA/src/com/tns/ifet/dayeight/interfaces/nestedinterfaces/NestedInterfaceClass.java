package com.tns.ifet.dayeight.interfaces.nestedinterfaces;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface {
	@Override
	public void print() {
		 System.out.println("Print method of nested interface");
	}

}
