package com.bridgeit.objectOreinted;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class AddressBookManager {

	public static void main(String args[]) throws IOException
	{
		
		AddressBookManag manag=new AddressBookManag();
		int choice;
		do {
					
		Utility u=new Utility();
		System.out.println("1. create address book");
		System.out.println("2. open address book");
		System.out.println("3. close address book");
		System.out.println("4. save ");
		System.out.println("5 Save As");
		System.out.println("6.quit");
		System.out.println("Enter your choice");
		 choice=u.inputInteger();
		switch(choice)
		{
		case 1: manag.createAddressBook();
				break;
			
		case 2: manag.openAddressBook();
				break;
				
		
		case 3:
				System.out.println("do you want to save your details yes or no");
				String feedback=u.inputString();
				if (feedback.equals("yes"))
				{
					System.out.println("internal call to save");
				}
				else
				{
					System.out.println("");
				}
		case 4: 
			
		
	}
	}while(choice<=6);
	}


}
