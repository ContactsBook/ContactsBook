package BusinessLogic;

import Data.Contact;
import UI.ContactsBookUI;
import java.util.HashMap;

public class ContactsBook {

    static HashMap<String, Contact> contacts;

    public static void main(String[] args) {
        ContactsBookUI.imprimeBienvenida();
        
        for(;;){
            ContactsBookUI.imprimeOpciones();
            int  opcionElegida = ContactsBookUI.validaOpciones();
            
            switch(opcionElegida){
                case 1: addContact();
                        break;
                case 2: removeContact();
                        break;
                case 3: updateContact();
                        break;
                case 4: printAllContacts();
                        break;
                case 5: removeContact();
                        break;
                case 6: removeContact();
                        break;
                
            }
            
            
        }
    }


/////////////////////////////////////////////////////////////
    
    
    public static void addContact() {

    }

    public static void removeContact() {

    }

    public static void updateContact() {

    }

    public static void printAllContacts() {

    }

    public static void printContactsKeys() {

    }



}
