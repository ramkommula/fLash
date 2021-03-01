class Employee
{
int eid;
int salary;
int i;
//String ceo;
static String ceo;

static
{
	ceo = "Mahesh";  //we can create seperate static block also
}

public Employee()  //Constructor 1
{
	eid = 1;
	salary = 4000;
}

public Employee(int i) //Constructor 2
{
	i = 55;
}

public void Show()  //Method
{
	System.out.println(eid + ":" + salary + ":" +ceo);   //this is the formating 
}

}


public class StaticDemo01
{
	static int i = 9; //we can create int value outside also by using static keyword
	public static void main(String[] args) 
	{
		Employee Vikram = new Employee();  //Vikram Object
	
		int i = 12; //we r modifying here
		Employee Amajya = new Employee();  //Amajya Object
		
		System.out.println(i);
		
		Employee Value = new Employee();  //Value Object
		Value.i = 44;
		System.out.println(Value.i);
		
		
		Vikram.Show();
		Amajya.Show();
		
		}
	
}


