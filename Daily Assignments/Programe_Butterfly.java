package DailyAssignments;

public class Programe_Butterfly {
	public static void main(String args[])
	{
	for(int i=1;i<=5;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print("*");
    	}
    	for(int k=i+1;k<=10-i;k++)
    	{
    		System.out.print(" ");
    	}
    	for(int m=1;m<=i;m++)
		{
			 System.out.print("*");
		}
    	System.out.println();
    }
    for(int i=4;i>=1;i--)
	{
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print("*");
    	}	
    	for(int k=i+1;k<=10-i;k++)
    	{
    		System.out.print(" ");
    	}
    	for(int m=1;m<=i;m++)
		{
			 System.out.print("*");
		}
    	System.out.println();
	}
    	
    
}

}


