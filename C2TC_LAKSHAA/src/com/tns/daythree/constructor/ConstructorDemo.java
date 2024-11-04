package com.tns.daythree.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,adress;
		int id;
		System.out.println("Enter Customer ID:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		name=sc.nextLine();
		System.out.println("Enter Customer Adress");
		adress=sc.nextLine();
		System.out.println(" ");
		Customer c1=new Customer();
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerAdress(adress);
		System.out.println(c1);
		
		System.out.println("Enter Customer ID:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		name=sc.nextLine();
		System.out.println("Enter Customer Adress");
		adress=sc.nextLine();
		Customer c2=new Customer(name,id,adress);
		System.out.println(c2);
		sc.close();

	}

}
