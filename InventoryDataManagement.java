package com.bridgelabaz.objectoriented;
import java.io.IOException;
import java.util.jar.JarException;
import org.json.simple.parser.ParseException;
import com.bridgelabz.objectoriented.utility.Utility;
public class InventoryDataManagement
{
	public static void main(String[] args) throws JarException, IOException, ParseException
	{
		Utility utility=new Utility();
		utility.jsonInventoryDataManagement();
	}

}
