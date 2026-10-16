package weeklyAssignments;

public class Programe_MovezerotoEnd {
	
	public static void main(String args[])
	{
	int[] arr= {0,5,0,3,8,0,2,9};
    int[] arr1=new int[arr.length];
    int index=0;
    
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]!=0)
    	{
    		arr1[index]=arr[i];
    		index++;
    	}
    }
    for(int i=0;i<arr1.length;i++)
    	System.out.print(arr1[i]+" ");
}

}


