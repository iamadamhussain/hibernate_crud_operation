package com.adam.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //this class Crud operation
@Table(name="person_spl26") //it gives table name
public class Person {
	
	@Id					//primary key
	@GeneratedValue		//generate auto increment values in pid
	private int  pid;//1,2,3
	
	private String name;
	private String address;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}
	
	

	

}
