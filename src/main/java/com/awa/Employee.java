package com.awa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
   private Address address;//Dependent object. so we need to create setter injections
   
   
   public Address getAddress() {
	return address;
}
   
   @Autowired//setter injection 
  public void setAddress(Address address) {
	this.address = address;
}
  public Employee() {
		System.out.println("Empl Constructor");
		
	}
    public void storeAddress() {
    	System.out.println("Empl store address");
    	System.out.println(address.EmplyAdree());//de
    }
}
