package com.bridgelabaz.objectoriented;
import java.util.Scanner;
public class Person 
{
	Scanner s = new Scanner(System.in);
	class Entry
	{
		private String first;
		private String last;
		private String address;
		private String zip_code;
		Entry(String first, String last, String address, String zip_code)
		{
			this.first = first;
			this.last = last;
			this.address = address;
			this.zip_code = zip_code;
		}
		Entry()
		{
			first = "";
			last = "";
			address = "";
			zip_code = "";
		}
		public void readEntry()
		{
			System.out.println("First Name:"+first );
			System.out.println("Last Name:"+last );
			System.out.println("Address:"+address );
			System.out.println("zip_code:"+zip_code );
		}
	}
	private int entries = 0;
	Entry[] contents;
	/**initialize the number of contents in entry
	 * @param e
	 */
	public void initEntries(int e)
	{
		contents = new Entry[e];
		for (int i = 0;i<contents.length;i++)
		{      
			contents[i] = new Entry();
		}
	}
	
	/**get the  Entries
	 * @return
	 */
	public int getEntries()
	{
		return contents.length;
	}
	
	/**add the Person
	 * @param first
	 * @param last
	 * @param address
	 * @param zip_code
	 */
	public void add(String first, String last, String address, String zip_code)
	{
		if (entries<contents.length)
		{
			contents[entries] = new Entry(first, last, address, zip_code);
			entries++;
		}
		else 
		{
			System.out.println("no person");
		}
	}
	
	/**remove Person
	 * @param entry
	 */
	public void remove(int entry)
	{
		if (entries>0){
			contents[entry] = new Entry();
			for (int i = 0;i<entries-entry;i++){
				if (entry+1==entries) contents[entry] = new Entry();
				else{
					Entry temp = contents[entry+i];
					contents[entry+i] = contents[entry+i+1]; 
					contents[entry+i+1] = temp;
				}
			}
			entries--;
		}
		else System.out.println("not removed");
	}
	
	/**Changes the values of an entry
	 * @param first
	 * @param last
	 * @param address
	 * @param zip_code
	 * @param selection
	 */
	public void edit(String first, String last, String address, String zip_code, int selection)
	{
		contents[selection].first = first;
		contents[selection].last = last;
		contents[selection].address = address;
		contents[selection].zip_code = zip_code;
	}
	
	/**sort enteries by name,zipcode,city
	 * @param n
	 */
	public void sort(int n)
	{
		for(int i = 0;i<contents.length;i++)
		{
			for (int j = 0;j<contents.length;j++){
				switch(n){
				case 1:
					if (contents[i].first.compareTo(contents[j].first)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				case 2:
					if (contents[i].last.compareTo(contents[j].last)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				case 3:
					if (contents[i].address.compareTo(contents[j].address)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				case 4:
					if (contents[i].zip_code.compareTo(contents[j].zip_code)<0){
						Entry temp = contents[i];
						contents[i] = contents[j];
						contents[j] = temp;
					}
					break;
				default: 
					System.out.println("Error: invalid field");
					break;
				}
			}
		}
	}
	public void addFromCopy(Entry e){
		if (entries<contents.length){
			contents[entries] = e;
			entries++;
		}
		else System.out.println("Entry is full");
	}

}

