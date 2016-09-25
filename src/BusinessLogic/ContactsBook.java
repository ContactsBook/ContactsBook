package BusinessLogic;

import Data.Contact;
import UI.ContactsBookUI;
import java.util.HashMap;

public class ContactsBook {
    
    static HashMap<String,Contact> contacts;
    static int contador; //laves  :v

    public static void main(String[] args) {
        ContactsBookUI.imprimeBienvenida();
        boolean control = true;
        
        while(control){
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
                case 5: printAllContacts();
                        break;
                case 6: control = false;
                        break;
                default: ContactsBookUI.error();
                        break;
                
            }
            control = true;
            
        }
    }


/////////////////////////////////////////////////////////////
    
    
    public static void addContact() {
        contador ++;
        String key  = String.valueOf(contador);
        Contact newContact;
        newContact = ContactsBookUI.crearContacto();
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
