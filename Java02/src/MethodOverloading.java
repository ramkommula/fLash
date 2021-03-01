class Casio                       
{                                 //multiple methods with same name & with different parameters 
	public void add(int i,int j)  //method1
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)//method2
	{
		System.out.println(i+j+k);
	}
	public void add(double i,double j)//method2
	{
		System.out.println(i+j);
	}
}

public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		Casio obj = new Casio();
		obj.add(3, 4);
		obj.add(3, 5, 7);
		obj.add(3.5, 4.3);

	}

}
