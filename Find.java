package com.bridgelabaz.objectoriented;
import java.util.ArrayList;
public class Find 
{
	/**Find doctor By Id
	 * @param al
	 * @param did
	 * @return
	 */
	public ArrayList<Doctor> FindById ( ArrayList<Doctor> al,int did)  //search doctor by id
	{  
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		for(Doctor d:al)
		{
			if(d.getDid()==did)
			{
				temp.add(d);
			}
		}
		return temp;	
	}
	/**Find doctor By Name
	 * @param al
	 * @param dn
	 * @return
	 */
	public ArrayList<Doctor> FindByName (ArrayList<Doctor> al, String dn)   //search doctor by name
	{ 
		ArrayList<Doctor> temp=new ArrayList<Doctor>();

		for(Doctor d:al)
		{
			if(d.getDname()==dn)
			{
				temp.add(d);
			}
		}
		return temp;
	}

	/**Find doctor By availability
	 * @param al
	 * @param as
	 * @return
	 */
	public ArrayList<Doctor> FindByava (ArrayList<Doctor> al, String as)  //search doctor by availability
	{
		ArrayList<Doctor> temp=new ArrayList<Doctor>();

		for(Doctor d:al)
		{
			if(d.getAvail()==as)
			{
				temp.add(d);
			}
		}
		return temp;	
	}

	/**find Patient by id
	 * @param al1
	 * @param fdid1
	 * @return
	 */
	public ArrayList<Patients> FindById1 (ArrayList<Patients> al1, int fdid1)  //search patients by id
	{
		ArrayList<Patients> temp=new ArrayList<Patients>();

		for(Patients p1:al1)
		{
			if(p1.getPid()==fdid1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

	/**find Patient by name
	 * @param al1
	 * @param dn1
	 * @return
	 */
	public ArrayList<Patients> FindByName1 (ArrayList<Patients> al1, String dn1)  //search patients by name
	{
		ArrayList<Patients> temp=new ArrayList<Patients>();

		for(Patients p1:al1)
		{
			if(p1.getPname()==dn1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

	/**find Patient by availability
	 * @param al1
	 * @param as1
	 * @return
	 */
	public ArrayList<Patients> FindByava1 (ArrayList<Patients> al1, String as1)   //search patients by availability
	{	
		ArrayList<Patients> temp=new ArrayList<Patients>();

		for(Patients p1:al1)
		{
			if(p1.getMobile()==as1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}
}


