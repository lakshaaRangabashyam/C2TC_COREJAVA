package com.tns.daythree.encapsulation;

public class OopsConceptDemo {
	private  int RollNo;
	private String Name;
	private int Age;

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "OopsConceptDemo [RollNo=" + RollNo + ", Name=" + Name + ", Age=" + Age + "]";
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

}
