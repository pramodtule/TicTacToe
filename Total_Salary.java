interface Salary
{

    public abstract void Display1();
    
}

class Employee
{
	String Employee_Name;
	int age;

	Employee(String Employee_Name,int age)
	{
		this.Employee_Name=Employee_Name;
		this.age=age;
	}
public  void Display2(String Employee_Name,int age)
{
  System.out.println("Employee_Name"+this.Employee_Name);
  System.out.println("age"+this.age);
}
}

public class Total_Salary extends Employee implements Salary
{
	public static void main(String[] args)
    {
      Total_Salary T=new Total_Salary();
      T.Display1(80000,60000);
      T.Display2("Pramod",23);

	}
	public void Display1(int Salary,int Basic_sal)
	{
		System.out.println("Salary="+Salary);
		System.out.println("Basic_sal="+Basic_sal);
	}
	
}