import java.util.Scanner;

public class InsertionSort
{
	public static void main(String []args)
	{
		int n, a;
		Scanner in = new Scanner(System.in);
	 
		System.out.println("Input number of integers to sort");
		n = in.nextInt();
		int array[] = new int[n];

		System.out.println("Enter " + n + " integers");

		for (a = 0; a < n; a++) 
		array[a] = in.nextInt();	

	
	       	for (int j = 1; j < n; j++)
		{
               		int key = array[j];
	                int i = j-1;
      			while ( (i > -1) && ( array [i] > key ) )
			{
	                	array [i+1] = array [i];
	               		i--;
      			}
                	System.out.println("Sorted list of numbers");
 
 			for (a = 0; a < n; a++) 
 	   		System.out.println(array[a]);
       		}
	}
}




/* The time complaxity in Best Case:0(n)
			  Average Case:0(n^2)
			  Worst Case:0(n^2)*/

/* The space complaxity in Worst Case:0(1)*/