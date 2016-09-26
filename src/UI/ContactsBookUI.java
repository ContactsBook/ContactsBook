package UI;
import java.util.Scanner;
import Data.Contact;
import java.util.HashSet;

public class ContactsBookUI {
    //static Scanner entrada = new Scanner(System.in);
    
    
    public static void printContact (Contact contact){
        System.out.println(contact);
    }
    
    public static void imprimeBienvenida(){
        System.out.println("Bienvenidio a su Libro de Contactos");
        System.out.println("###################################");
    }
    
    public static void imprimeOpciones(){
        System.out.println("¿Qué desea hacer?");
        System.out.print("[1] Agregar \n[2] Eliminar \n[3] Actualizar \n[4] Mostrar Todos \n[5] Mostrar Uno \n[6] Salir\n");
    }
    
    public static int pedirInt(){
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        return opcion;
    }
    
    public static String pedirCadena(){
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine();
        return cadena;
    }
    /*public static Contact instanciaContacto(Contact nuevoContacto){
        return (nuevoContacto = new Contact());
    }*/
    
    public static Contact crearContacto(){
        
        Contact newContact;
        
        System.out.println("Escriba el nombre del contacto");
        String nombre = pedirCadena();
        
        System.out.println("Escriba el apellido del contacto");
        String apellido = pedirCadena();
        
        HashSet emails;
        emails = crearListaCorreos();
        
        System.out.println("Escriba el telefono fijo del contacto");
        String fijoStr = pedirCadena();
        int fijo = Integer.parseInt(fijoStr);
        
        System.out.println("Escriba el telefono móvil del contacto");
        String movilStr = pedirCadena();
        long movil = Long.parseLong(movilStr);
        
        System.out.println("Escriba la direccion del contacto");
        String dir = pedirCadena();
        
        newContact = new Contact(nombre, apellido, emails, fijo, movil, dir);
        
        return newContact;
        
    }
    
    public static HashSet crearListaCorreos(){
        HashSet<String> emails = new HashSet();
               
        System.out.print("Ingrese el número de correos a guardar: ");
        int contador = pedirInt();
        
        for (int i = 1; i<=contador; i++){
            System.out.println("Escriba el e-mail " +i+ " del contacto");
            emails.add(pedirCadena());
        }
        
        
        return emails;
    }
    
    public static void error(){
        System.out.println("Por  favor ingrese una opcion válida");
    }
}
