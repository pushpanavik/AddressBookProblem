package com.bridgeit.objectOreinted;

import com.bridgeit.utility.Utility;

public class AddressBookManag implements AddressBookManagerInterface {
	AddressBookMain create=new AddressBookMain();
	Utility u=new Utility();
	@Override
	public void createAddressBook() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name");
		String filename=u.inputString();
		create.addPerson();
		
	}

	@Override
	public void openAddressBook() {
		// TODO Auto-generated method stub
		create.editPersonDetail();
	}

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
