package Contactmanagement;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	
	    private String name;
	    private String phoneNumber;
	    private String emailAddress;

	    public Contact(String name, String phoneNumber, String emailAddress) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.emailAddress = emailAddress;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getEmailAddress() {
	        return emailAddress;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public void setEmailAddress(String emailAddress) {
	        this.emailAddress = emailAddress;
	    }
	}

	



