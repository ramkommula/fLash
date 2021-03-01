class Calc   //this is our own class
{
	double d1; //this is for double values
	int num1;  //these are all integers
	int num2;
	int result;


public Calc()  //this is our default constructor, here we did not give any parameters 
{
	num1 = 5; //we can give values here
	num2 = 5;
	System.out.println("In Constructor");
}

public Calc(int n)  //this is paramiterized constructor, Here we given int parameter
{
	num1 = (int)n; //we can mention int also
	num1 = n;
	num2 = n;
			
}

public Calc(double d)  ////this is paramiterized constructor, Here we given double parameter
{
	 d1 = 5.7;
	 //d1 = (double)5.7;
}
}


public class Objectdemo01 

{

	public static void main(String[] args) 
	{
		Calc obj = new Calc();  //we can give  values here
		//obj.num1 = 4;          //we can give values here
		obj.d1 = 4.5;
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.d1);

	}

}
