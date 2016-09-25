
package BusinessLogic;

import Data.Contact;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;





public class ContactsBook {
    
    public static HashMap<Integer,Contact> contacts;     
    static Contact contacto[];
    
   public static void addContact(){
       String nombre;
       String apellido;
       HashSet<String> correosElectronicos;
       int telefonoFijo;
       long telefonoMovil;
       String direccion;
       int contador = 0;
       Scanner reader = new Scanner (System.in);
       
    
       while (contacto [contador] != null && contador<contacto.length){
			contador++;
		if (contador<contacto.length){
			System.out.print("Nombre: ");
			nombre = reader.nextLine();
			System.out.print("Apellido: ");
                        apellido = reader.nextLine();
                        System.out.print("Correo Electronicos: ");
                        // Cómo llenar los correos?
			System.out.print("Teléfono fijo: ");
			telefonoFijo = reader.nextInt();
			System.out.print("Teléfono Móvil: ");
			telefonoMovil = reader.nextInt();
			System.out.print("Dirección: ");
			direccion = reader.nextLine();
                }
       }
} 
    
   
   public static void removeContact(){
       
       
   }
   public static void updateContact(){
       
   }
   public static void printAllContacts(HashMap<Integer,Contact> contacts){
       
       
       }       
   
   public static void printContactsKeys(){
       
   }
   
        
    
    public static void main (String [] args){
        
        addContact();
    }
    
}
