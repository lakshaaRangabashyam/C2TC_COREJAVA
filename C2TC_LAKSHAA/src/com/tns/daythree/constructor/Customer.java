package com.tns.daythree.constructor;

public class Customer {
	private String CustomerName;
	private int CustomerId;
	private String CustomerAdress;
	public Customer() {
		System.out.println("Default consrutor");
	}
	public Customer(String CustomerName, int CustomerId, String CustomerAdress) {
		System.out.println("Paramterised constructor");
		this.CustomerName=CustomerName;
		this.CustomerId=CustomerId;
		this.CustomerAdress=CustomerAdress;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerAdress() {
		return CustomerAdress;
	}
	public void setCustomerAdress(String customerAdress) {
		CustomerAdress = customerAdress;
	}
	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerId=" + CustomerId + ", CustomerAdress="
				+ CustomerAdress + "]";
	}
	
	
	

}
