import java.util.Scanner;
 
class BubbleSort
{
	public static void main(String []args)
	{
		int n, a, z, swap;
		Scanner in = new Scanner(System.in);
 
		System.out.println("Input number of integers to sort");
		n = in.nextInt();
 		int array[] = new int[n];
 
		System.out.println("Enter " + n + " integers");
 
		for (a = 0; a < n; a++) 
		array[a] = in.nextInt();
 
		for (a = 0; a < ( n - 1 ); a++)
		{
	        	for (z = 0; z < n - a - 1; z++)
			{
		        	if (array[z] > array[z+1]) 
        			{
		          		swap=array[z];
          				array[z]=array[z+1];
		          		array[z+1]=swap;
        			}
      	  		}
    		}
 
    		System.out.println("Sorted list of numbers");
 
 		for (a = 0; a < n; a++) 
 	   		System.out.println(array[a]);
  	}
}




/* The time complaxity in Best Case:0(n)
			  Average Case:0(n^2)
			  Worst Case:0(n^2)*/

/* The space complaxity in Worst Case:0(1)*/