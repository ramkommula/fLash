class calculator
{
	int num1;
	int num2;
	int result;

	public calculator(int num1,int num2)
	{
		this.num1 = num1; //we are using this keyword to differentiate num1 & num2... because both r same
		this.num2 = num2;
		
		
	}
}



public class ObjectDemo02 
{

	public static void main(String[] args) 
	{
		calculator obj = new calculator(4,6); //we should give values here because we are taking paramitarized constructor
		//obj.num1 = 5;
		//obj.num2 = 6;
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
