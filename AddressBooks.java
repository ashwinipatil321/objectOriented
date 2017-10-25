package com.bridgelabaz.objectoriented;
import java.util.Scanner;
public class AddressBooks
{
	public static void main(String[] args)
	{
		
			System.out.println("Select an option!");
			System.out.println("1. Add an Person");
			System.out.println("2. Remove an Person");
			System.out.println("3. Edit an Person");
			System.out.println("4. Sort ");
			System.out.println("5. Select another person");
			System.out.println("6. Move entry person");
			System.out.println("7. Exit the menu");
			System.out.print("> ");
			selection = scanner.nextInt();
			switch(selection){
			case 1: 
				System.out.print("First name? ");
				first = scanner.next();
				System.out.print("Last name? ");
				last = scanner.next();
				System.out.print("Address? ");
				address = scanner.next();
				System.out.print("zip_code? ");
				zip_code = scanner.next();
				person[selectedPerson].add(first, last, address, zip_code);
				break;
			case 2: 
				System.out.print("Remove which entry? ");
				int entry = scanner.nextInt();
				person[selectedPerson].remove(entry);
				break;
			case 3:
				System.out.print("Edit which entry?");
				int whichEntry = scanner.nextInt();
				System.out.print("First name? ");
				first = scanner.next();
				System.out.print("Last name? ");
				last = scanner.next();
				System.out.print("Address? ");
				address = scanner.next();
				System.out.print("zip_code? ");
				zip_code = scanner.next();
				person[selectedPerson].edit(first, last, address, zip_code, whichEntry);
				break;
			case 4: 
				System.out.println("Sort alphabetically by which field?");
				System.out.println("1. Sort by first name");
				System.out.println("2. Sort by last name");
				System.out.println("3. Sort by address");
				System.out.println("4. Sort by zip_code");
				person[selectedPerson].sort(scanner.nextInt());
				break;
			case 5: 
				System.out.print("Select Person?");
				selectedPerson = scanner.nextInt();
				break;
			case 6:
				System.out.print("Move which entry? ");
				int entryNo = scanner.nextInt();
				Person.Entry entryToMove = person[selectedPerson].contents[entryNo];
				person[selectedPerson].remove(entryNo);
				System.out.print("To which Person? ");
				int whichPerson = scanner.nextInt();
				person[whichPerson].addFromCopy(entryToMove);
				break;
			case 7:
				done = true;
				break;
			default:
				System.out.print("Please choose a valid menu number");
			}
		}
		scanner.close();
	}
}


