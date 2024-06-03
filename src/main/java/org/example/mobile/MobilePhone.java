package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private final String myNumber;
private final ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        }else {
            return false;
        }

    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(myContacts.contains(oldContact)){
            int index=myContacts.indexOf(oldContact);
            myContacts.set(index,newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }

    }
    public int findContact(Contact contact){
        if (!myContacts.contains(contact)){
            return -1;
        }
        return myContacts.indexOf(contact);
    }


    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }


}
