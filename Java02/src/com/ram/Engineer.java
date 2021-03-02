package com.ram;

public class Engineer 
{

	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.age = 23;  //Package private
		obj.rollno = 12; //Public
		obj.name = "nani"; //this is in private, we cannot change here
		obj.marks = 36; //Protected

	}

}
