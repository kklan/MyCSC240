// Assignment : Project #1.1
// Name: Kunal Lanjewar
// Lecture: CSC 240 Tu 7:00pm to 9:40pm
/* Description: Write a program that has a non-recursive function called fact(n) that computes n!.  
				Is there a limit to how large n is?  Display the results for different values of n, 
				including what you think is the biggest (or close to the biggest) value of n you can use.*/

import java.util.Scanner;

public class nonRecursive 
{
	public static void main(String[] args) 
	{
		int n;		//declaring variables
		Scanner input = new Scanner(System.in);    //scanner to get input
		System.out.print("Enter a positive number (n) between 0 to 25: ");	//ask for input number (n)
		n = input.nextInt();
		System.out.println("The factorial of " + n + " is: " + fact(n));	//display result
	}
	
	public static long fact(long n) 
	{
		int i;		//declaring variables
		long j = 1;
		
		if (n < 0)			//Implementing exception handling to limit input range 0-25.
			throw new RuntimeException("Enter number (n) greater than 0.");
		else if (n > 25)
			throw new RuntimeException("Enter number (n) less than or equal to 25.");
		else if (n == 0)
			return 1;
		else
			for (i = 2; i <= n; i++)	//Calculating Factorial of n
				j *= i;
		return j;
	}
}