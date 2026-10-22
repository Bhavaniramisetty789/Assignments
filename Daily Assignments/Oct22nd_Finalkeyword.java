package DailyAssignments;

class Employee
{
	int employeeId;
	String employeename;
	double salary;


Employee(int employeeId,String employeename,double salary)
{
	this.employeeId=employeeId;
	this.employeename=employeename;
	this.salary=salary;
}

void displayDetails()
{
	System.out.println(this.employeeId+":"+this.employeename+":"+this.salary);
}
}

public class Oct22nd_Finalkeyword {
	
	public static void main(String[] args)
	{
      Employee employee=new Employee(101,"john",2000);
      Employee employee1=new Employee(102,"myra",3000);
	
       employee.displayDetails();
       employee1.displayDetails();
}
}

