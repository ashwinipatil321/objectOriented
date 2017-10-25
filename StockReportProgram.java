package com.bridgelabaz.objectoriented;

import java.util.Scanner;

public class StockReportProgram 
{
	Scanner scanner = new Scanner(System.in);
	long totalValueOfEachStock;
	long sum=0;
	String  stockNames;
	int numberOfShare;
	long sharePrice;
	public static void main(String[] args) 
	{
		StockReportProgram srp=new StockReportProgram();
		srp.StockReport();
	}
	/**calcukate totalValueOfEachStock
	 * 
	 */
	public void StockReport()
	{
		System.out.println("Enter number of companies ");
		int n=scanner.nextInt();
		StockLogic stock[]=new StockLogic[n];
		for(int i=0;i<n;i++)
		{
			scanner.nextLine();
			System.out.println("Enter the Stock Name:");
			stockNames = scanner.nextLine();
			System.out.println("Enter the number of shares:");
			numberOfShare=scanner.nextInt();
			System.out.println("Enter The Share Price:");
			sharePrice =scanner.nextLong();
			stock[i]=new StockLogic(stockNames,numberOfShare,sharePrice);
			System.out.println("Stockname  "+"  numberOfShare  "+"  share price  "+"  totalValueOfEachStock  ");
				totalValueOfEachStock = (long) (stock[i].numberOfShare * stock[i].sharePrice);
				System.out.println(stock[i].stockNames+"\t\t"+stock[i].numberOfShare+ "\t\t "+stock[i].sharePrice +"\t\t"+totalValueOfEachStock);
		}
	}

}
