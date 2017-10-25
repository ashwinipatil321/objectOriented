package com.bridgelabaz.objectoriented;

import java.sql.Date;

public class Appointment{


	Integer did;
	Date date;
	//constructor
	public Appointment(int did)
	{ 
		this.did=did;
		
	}
	//getter and setter methods
	public int getDid() 
	{
		return did;
	}
	public void setDid(int did) 
	{
		this.did = did;
	}


	public String toString() 
	{
		return "Appointment [did=" + did + "]";
	}

	public int hashCode()
	{
    	return this.did.hashCode();
	}
	//checking for equality
	public boolean equals(Object object)
	{
    	if (object == null) 
			return false;
    	if (object == this) 
			return true;
    	if (!(object instanceof Appointment))
			return false;
    	
    	Appointment dA = (Appointment) object;

		if((this.did==dA.did))
			return true;
		else
			return false;
	}
}


