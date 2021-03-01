class Emp
{
int eid;
int salary;
//String ceo;
static String ceo;

public void Show()
{
	System.out.println(eid + ":" + salary + ":" +ceo);
}

}



public class StaticDemo 
{
	public static void main(String[] args) 
	{
		Emp Vikram = new Emp();
		Vikram.eid = 2;
		Vikram.salary = 4000;
		Emp.ceo = "mahesh";
		
		Emp Amajya = new Emp();
		Amajya.eid = 3;
		Amajya.salary = 5000;
		Emp.ceo = "Mahesh";
		
		Emp.ceo = "Likitha";
		
		Vikram.Show();
		Amajya.Show();
		
		}
	
}


