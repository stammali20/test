package Test;

import java.util.Scanner;

public class Evennumbers {

	public static void main(String args[])
	{
		int number, remainder;
		
		System.out.println("Please enter the number:  ");
		
		Scanner scan= new Scanner(System.in);

		number=scan.nextInt();
		
		remainder=number%2;
		
		if(remainder==0)
		{
			System.out.println(number+"is even number");
		}

		else {
			System.out.println(number+"is odd number");
		}
			
		}
		
		
		
	}



