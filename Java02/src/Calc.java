class Calculator  //calculator is our own class
{
int num1;  //Variables
int num2;
int result;
public void perform()  //our own creating object method
{
	result = num1 + num2; //Operation
}

}



public class Calc  //Calc is main class
{

	public static void main(String[] args) //object executed only in main() method
	{
		Calculator obj = new Calculator();//new calculator() is object, new is for allocating memory in object
		obj.num1 = 3;    //obj is object reference 
		obj.num2 = 8;
		obj.perform();
		System.out.print(obj.result);

	}

}
