import java.util.Scanner;
 
class SelSort
{
	public static void main(String []args)
	{
		int n,a;
		Scanner in = new Scanner(System.in);
 
		System.out.println("Input number of integers to sort");
		n = in.nextInt();
 		int array[] = new int[n];
 
		System.out.println("Enter " + n + " integers");
 
		for (a = 0; a < n; a++) 
		array[a] = in.nextInt();

		for (int i = 0; i < array.length - 1; i++)
        	{
        		int index = i;
            		for (int j = i + 1; j < array.length; j++)
                	if (array[j] < array[index])
                    	index = j;
      
      		        int smallerNumber = array[index]; 
            		array[index] = array[i];
            		array[i] = smallerNumber;
        	}
		System.out.println("Sorted list of numbers");
 
 		for (a = 0; a < n; a++) 
 	   		System.out.println(array[a]);
	}
}





/* The time complaxity in Best Case:0(n^2)
			  Average Case:0(n^2)
			  Worst Case:0(n^2)*/

/* The space complaxity in Worst Case:0(1)*/