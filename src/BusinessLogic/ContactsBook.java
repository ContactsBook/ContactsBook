package BusinessLogic;

import Data.Contact;
import UI.ContactsBookUI;
import java.util.HashMap;

public class ContactsBook {

    //static HashMap<String,Contact> contacts;
    static int contador = 0; //laves  :v

    public static void main(String[] args) {

        HashMap<String, Contact> listaContactos;
        listaContactos = new HashMap();

        ContactsBookUI.imprimeBienvenida();
        boolean control = true;

        while (control) {
            ContactsBookUI.imprimeOpciones();

            int opcionElegida = ContactsBookUI.pedirInt();

            switch (opcionElegida) {
                case 1:
                    addContact(listaContactos);
                    break;
                case 2:
                    String key = String.valueOf(ContactsBookUI.pedirInt());
                    removeContact(listaContactos, key);
                    break;
                case 3:
                    updateContact(listaContactos);
                    break;
                case 4:
                    printAllContacts(listaContactos);
                    break;
                case 5:
                    printContactsKeys(listaContactos);
                    break;
                case 6:
                    control = false;
                    break;
                default:
                    ContactsBookUI.error();
                    break;

            }

        }
    }

/////////////////////////////////////////////////////////////
    public static void addContact(HashMap<String, Contact> contactos) {
        contador++;
        String key = String.valueOf(contador);
        Contact newContact;
        newContact = ContactsBookUI.crearContacto();
        contactos.put(key, newContact);
    }

    

    public static void removeContact(HashMap<String, Contact> contactos, String key) {
        
        ContactsBookUI.verificaDisponibilidad(contactos);
        
        Contact deletedContact = contactos.remove(key);
    }
    
    public static void updateContact(HashMap<String, Contact> contactos) {
        ContactsBookUI.recorreImprimeKeys(contactos);
    }

    public static void printAllContacts(HashMap<String, Contact> contactos) {

        ContactsBookUI.recorreImprimeContactos(contactos);

    }

    public static void printContactsKeys(HashMap<String, Contact> contactos) {

        ContactsBookUI.recorreImprimeKeys(contactos);
        ContactsBookUI.preguntaPorMas(contactos);
    }

}
