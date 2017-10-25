package com.bridgelabaz.objectoriented;
import java.util.Scanner;
public class Patients
{
	int pid;
	String pname;
	int age;
	String mobile;
	Scanner scanner=new Scanner(System.in);
	public int getPid() 
	{
		return pid;
	}
	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getMobile() 
	{
		return mobile;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}

	/*overide toString method 
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return "Patients [pid=" + pid + ", pname=" + pname + ", age=" + age + ", mobile=" + mobile + "]";
	}

	/**method to add patients information
	 * 
	 */
	public void addPatient()
	{

		System.out.println("Enter Your Details ...");

		System.out.println("Enter Name: ");
		this.pname=scanner.nextLine();
		System.out.println();

		System.out.println("Enter Id: ");
		this.pid=scanner.nextInt();
		System.out.println();

		System.out.println("Enter Age: ");
		this.age=scanner.nextInt();
		System.out.println();

		System.out.println("Enter Mobile Number: ");
		this.mobile=scanner.nextLine();
		System.out.println();
	}
}

