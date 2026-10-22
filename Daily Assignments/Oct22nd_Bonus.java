package DailyAssignments;

class Employee1
{
	 final  void calculateBonus()
	{
		System.out.println("Hello");
		
	}

}
	class manager extends Employee1
	{
		void calculatebonus()
		{
			System.out.println("bye");
			
	}
}

public class Oct22nd_Bonus {
	
	public static void main() {
		Employee1 employee= new Employee1();
		employee.calculateBonus();
	}

}

