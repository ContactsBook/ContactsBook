package UI;
import java.util.Scanner;
import Data.Contact;

public class ContactsBookUI {
    
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
    
    public static int validaOpciones(){
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        return opcion;
    }
}
