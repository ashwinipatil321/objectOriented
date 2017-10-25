package com.bridgelabaz.objectoriented;
import java.util.Scanner;
import com.bridgelabz.objectoriented.utility.Utility;
public class Regex {
	public static void main(String args[])
	{
		Utility utility = new Utility();
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter FirstName:");
		String firstName=scanner.nextLine();
		System.out.println("Enter LastName:");
		String lastName=scanner.nextLine();
		System.out.println();
		System.out.println("Enter Mobile Number:");
		String mobileNumber=scanner.nextLine();
		System.out.println();
		String message="  Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. "
				+ "	your contact number is 91-xxxxxxxxxx."
				+ " Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		System.out.println(utility.convertString(firstName,lastName,mobileNumber,message));
		scanner.close();
	}
}


