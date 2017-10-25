package com.bridgelabaz.objectoriented;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.bridgelabz.objectoriented.utility.Utility;
public class ClinicManagement 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	Utility utility = new Utility();
		do
		{
			System.out.println();
			System.out.println("----------Clinique Management System---------");
			System.out.println();
			System.out.println("1.Add Doctor");
			System.out.println("2.Add Patients");
			System.out.println("3.Print Doctor");
			System.out.println("4.Print Patients");
			System.out.println("7.Search Doctor by Name ,Id or Availability");
			System.out.println("8.Search Patients by Name ,Id or Mobile Number");
			System.out.println("9.Exit");
			System.out.println();
			System.out.println("Enter your Choice: ");
			int choice=scanner.nextInt();
			switch (choice) 
			{
			case 1:
				utility.addDoctor();
				
				break;
			case 2:
				utility.addPatient();
				arrayListPatients.add(patients);
				break;
			case 3:
				//Printing  All Doctors Details..
				System.out.println("All Doctors Details..");
				System.out.println(arrayListDoctor);
				break;
			case 4:
				//Printing Patients Details..
				System.out.println("All Patients Details..");
				System.out.println(arrayListPatients);
				break;
			/*case 5:
				System.out.println("Enter Docotor Id ");
				int doctorId = scanner.nextInt();
				ArrayList<Doctor>doc=find.FindById(arrayListDoctor, doctorId);
				if(doc!=null)
				{
					if(doc.size()>=1)
					{
						System.out.println("Enter Date of Appointment(eg.10/06/2016): ");
						Date date1=(Date) utility.printDate(scanner.next());
						if(date1==null)
						{
							System.out.println("Date format is not correct");
						}
						//Checking for availability of doctors
						
							Appointment newApp=new Appointment(doctorId);
							if(appoint.containsKey(newApp))
							{
								//already some appointment is there on that date
								Integer appointment=appoint.get(newApp);
								if(appointment<=5)
								{
									//Appointment on given date is less then 5
									appointment++;
									appoint.put(newApp,appointment);
									//System.out.println("Appointment Scheduled on "+date1.toString()+" "+" with Doctor Id"+doctorId);
								}
								else
								{
									//On given date appointment is more then 5
									System.out.println("Please Select Another Date"); 
								}
							}
							else
							{
								//No appointment is there on given date
								appoint.put(newApp,1);
							}
						}
					}
					//doctor Id does not exit in the DoctorsList
					else
					{
						System.out.println("Invalid Doctor Id");
					}
				
				break;*/
			case 5:
				int ch1=0;
				do
				{
					//search 
					System.out.println();
					System.out.println("----------Search Doctor---------");
					System.out.println();
					System.out.println("1.Search Docotor By id");
					System.out.println("2.Search Docotor By Name");
					System.out.println("3.Search Docotor By Availability");
					System.out.println("4.Exit");
					System.out.println();
					System.out.println("Enter your Choice: ");
					int ch=scanner.nextInt();

					switch (ch) 
					{
					case 1:
						System.out.println("1.Enter Docotor Id");
						int did1=scanner.nextInt();
						arrayListDoctor=find.FindById(arrayListDoctor,did1);
						//search doctor by name
						System.out.println(arrayListDoctor);
						break;
					case 2:
						System.out.println("Enter Docotor Name");
						String dname=scanner.next();
						arrayListDoctor=find.FindByName(arrayListDoctor,dname);
						System.out.println(arrayListDoctor);			
						break;
					case 3:
						//search doctor by Availability
						System.out.println("Enter Docotor Availability");
						String avail=scanner.next();
						arrayListDoctor=find.FindByava(arrayListDoctor,avail);
						System.out.println(arrayListDoctor);
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("Invalid choice");
						break;
					}
				}
				while(ch1<5);			
			case 6:
				Find f1=new Find();
				int ch2=0;
				do
				{
					System.out.println();
					System.out.println("----------Search Patients---------");
					System.out.println();
					System.out.println("1.Search Patients By Id");
					System.out.println("2.Search Patients By Name");
					System.out.println("3.Search Patients By Mobile Number");
					System.out.println("4.Exit");
					System.out.println();
					System.out.println("Enter your Choice: ");
					int ch3=scanner.nextInt();
					switch (ch3) 
					{
					case 1:
						//Search Patients by id
						System.out.println("Enter Patients  Id");
						int pid1=scanner.nextInt();
						arrayListPatients=f1.FindById1(arrayListPatients,pid1);
						System.out.println(arrayListPatients);
						break;
					case 2:
						//Search Patients by Name
						System.out.println("Enter Patients Name");
						String pname1=scanner.next();
						arrayListPatients=f1.FindByName1(arrayListPatients,pname1);
						System.out.println(arrayListPatients);
						break;
					case 3:
						//Search Patients by Mobile Number
						System.out.println("Enter Patients Mobile Number");
						String avail1=scanner.next();
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("Invalid choice");
						break;
					}
				}
				while(ch2<5);
			case 7:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		while(c<10);	
	}

}
