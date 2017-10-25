package com.bridgelabaz.objectoriented;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.objectoriented.utility.Utility;
public class StockAccount 
{
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice..........");
			System.out.println("1.create user");
			System.out.println("2.Buy");
			System.out.println("3.Sell");
			System.out.println("4.display");
			System.out.println("5.Exit");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:  System.out.println("Create User..........");
			Utility.createUser();
			break;

			case 2: Utility.Buy();
			break;

			case 3: Utility.sell();
			break;

			case 4: Utility.display();
			break;
			case 5:System.exit(0);
			break;

			}
		}while(choice<=4);
		scanner.close();
	}
}



