// Assignment : Project #1.3
// Name: Kunal Lanjewar
// Lecture: CSC 240 Tu 7:00pm to 9:40pm
/* Description: A map maker is making a map which will include the states of Tennessee, Mississippi, Alabama, Georgia, & Florida.  
				The map maker only has 3 colors to use and no two states which share a border can be colored the same color.  
				Write a program which ﬁnds an acceptable assignment of colors to states.  
				Take care that your program does not assume the solution.  
				For example, your program should not automatically set Tennessee=Florida).*/ 

import java.util.Scanner;

public class ColorMap 
{
	public static void main(String[] args) 
	{
		String states[] = { "Tennessee", "Mississippi", " Alabama", "Georgia", "Florida"};// declaring array
		String setColor = ""; 	//stores input color in setColor
		int i = 0;	//declaring variables
		Scanner input = new Scanner(System.in);		//to get input from user
		while (i < 5) 
		{
			System.out.println("Choose a color (Red, Green and Blue) for: " + states[i]);	//ask user to input color
			String color = input.nextLine();
			
			if (setColor.equals("")) 		//checks for colors input
			{
				setColor = color;
			} 
			else 
			{
				if (setColor.equals(color)) //if same color twice, gives an error
				{
					System.out.println("Oops! Same color and border for " + states[i - 1] + " and " + states[i] +"?" + "\nPlease choose different color and Try again!");
					return;
				} 
				else 
				{
					setColor = color;
				}
			}
			
			i++;	//increments i (upto 5 states) for while loop
		}
		System.out.println("Sucessfully colored all states!"); //if all ok, it prints this message.
	}
}
