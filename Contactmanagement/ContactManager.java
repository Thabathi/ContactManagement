package Contactmanagement;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public void updateContact(Contact contact) {
         
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }
}
 