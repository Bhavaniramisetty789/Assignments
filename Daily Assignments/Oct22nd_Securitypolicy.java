package DailyAssignments;

class Securitypolicy
{
	void displaydetails()
	{
		System.out.println("Securitypolicy displayed");
	}
}

class Adminpolicy extends Securitypolicy
{
	
}

public class Oct22nd_Securitypolicy {
	
public static void main(String[] args)
{
	Securitypolicy add = new Securitypolicy();
	add.displaydetails();
}

}
