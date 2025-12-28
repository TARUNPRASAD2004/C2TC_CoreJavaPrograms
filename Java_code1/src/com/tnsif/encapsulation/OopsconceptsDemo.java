package com.tnsif.encapsulation;

public class OopsconceptsDemo {
	
	private int serialNum;
	private String Name;
	private int age;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "OopsconceptsDemo [serialNum=" + serialNum + ", Name=" + Name + ", age=" + age + "]";
	}
	
	
}
