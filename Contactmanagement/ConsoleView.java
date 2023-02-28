package Contactmanagement;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private ContactManager contactManager;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleView(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    public void start() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Add contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Update contact");
            System.out.println("4. View all contacts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    deleteContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    viewAllContacts();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println();
        }
    }

    private void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email address: ");
        String emailAddress = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber, emailAddress);
        contactManager.addContact(contact);
        System.out.println("Contact added successfully");
    }

    private void deleteContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        List<Contact> contacts = contactManager.getAllContacts();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contactManager.deleteContact(contact);
                System.out.println("Contact deleted successfully");
                		return;
            }
            }
            System.out.println("Contact not found");
            }
    private void updateContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        List<Contact> contacts = contactManager.getAllContacts();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.print("Enter new phone number (leave blank to keep the same): ");
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.isBlank()) {
                    contact.setPhoneNumber(phoneNumber);
                }
                System.out.print("Enter new email address (leave blank to keep the same): ");
                String emailAddress = scanner.nextLine();
                if (!emailAddress.isBlank()) {
                    contact.setEmailAddress(emailAddress);
                }
                System.out.println("Contact updated successfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    private void viewAllContacts() {
        List<Contact> contacts = contactManager.getAllContacts();
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone number: " + contact.getPhoneNumber());
            System.out.println("Email address: " + contact.getEmailAddress());
            System.out.println();
        }
        System.out.println("Total contacts: " + contacts.size());
    }
    public class Main {
    	public static void main(String[] args) {
    	ContactManager contactManager = new ContactManager();
    	ConsoleView consoleView = new ConsoleView(contactManager);
    	consoleView.start();
    	}
    	}
}
            

