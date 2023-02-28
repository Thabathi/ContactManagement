package Contactmanagement;

import java.util.List;

public class ContactController {
	 
	    private ContactManager contactManager;

	    public ContactController(ContactManager contactManager) {
	        this.contactManager = contactManager;
	    }

	    public void addContact(String name, String phoneNumber, String emailAddress) {
	        Contact contact = new Contact(name, phoneNumber, emailAddress);
	        contactManager.addContact(contact);
	    }

	    public void deleteContact(String name) {
	        List<Contact> contacts = contactManager.getAllContacts();
	        for (Contact contact : contacts) {
	            if (contact.getName().equals(name)) {
	                contactManager.deleteContact(contact);
	                return;
	            }
	        }
	    }

	    public void updateContact(String name, String phoneNumber, String emailAddress) {
	        List<Contact> contacts = contactManager.getAllContacts();
	        for (Contact contact : contacts) {
	            if (contact.getName().equals(name)) {
	                if (!phoneNumber.isBlank()) {
	                    contact.setPhoneNumber(phoneNumber);
	                }
	                if (!emailAddress.isBlank()) {
	                    contact.setEmailAddress(emailAddress);
	                }
	                return;
	            }
	        }
	    }

	    public List<Contact> getAllContacts() {
	        return contactManager.getAllContacts();
	    }
	}



