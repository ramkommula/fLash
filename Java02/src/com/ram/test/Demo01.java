package com.ram.test;

import com.ram.Student;

public class Demo01 
{

	public static void main(String[] args) 
	{
		Student S = new Student();
		S.age = 23;  //Package private, we cannot change her
		
		S.rollno = 12; //Public...we can access this & change this in anywhere
		
		S.name = "nani"; //this is in private, we cannot change here
		
		S.marks = 36; //Protected, we cannot change her


	}

}
