package UI;

import java.util.Scanner;
import Data.Contact;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ContactsBookUI {
    //static Scanner entrada = new Scanner(System.in);

    public static void printContact(Contact contact) {
        System.out.println(contact);
    }

    public static void imprimeBienvenida() {
        System.out.println("Bienvenidio a su Libro de Contactos");
        System.out.println("###################################");
    }

    public static void imprimeOpciones() {
        System.out.println("¿Qué desea hacer?");
        System.out.print("[1] Agregar \n[2] Eliminar \n[3] Actualizar \n[4] Mostrar Todos \n[5] Mostrar Keys \n[6] Salir\n");
    }

    public static int pedirInt() {
        System.out.println("Ingrese un número");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static String pedirCadena() {
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.nextLine();
        return cadena;
    }

public static Contact crearContacto() {

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
        while (fijo<0){
            System.out.println("Escriba un telefono fijo de contacto válido");
            fijoStr = pedirCadena();
            fijo = Integer.parseInt(fijoStr);
        }

        System.out.println("Escriba el telefono móvil del contacto");
        String movilStr = pedirCadena();
        long movil = Long.parseLong(movilStr);
        while (movil<0){
            System.out.println("Escriba un telefono móvil de contacto válido");
            movilStr = pedirCadena();
            movil = Long.parseLong(movilStr);
        }

        System.out.println("Escriba la direccion del contacto");
        String dir = pedirCadena();

        newContact = new Contact(nombre, apellido, emails, fijo, movil, dir);

        return newContact;

    }

    public static HashSet crearListaCorreos() {
        HashSet<String> emails = new HashSet();

        System.out.print("Ingrese el número de correos a guardar: ");
        int contador=0;
        contador= pedirInt();
        for (int i = 1; i <= contador; i++) {
            System.out.println("Escriba el e-mail " + i + " del contacto");
            String cadena = pedirCadena();
                        
            for (int j=0; j<cadena.length(); j++){
                
                if(cadena.indexOf('@') != -1 && cadena.indexOf('.') != -1) {
                    emails.add(cadena);
                    j = cadena.length(); 
                }else{
                    System.out.println("El correo debe tener como mínimo un \'.\' y un \'@\'");
                    System.out.println("Escriba el e-mail " + i + " del contacto");
                    cadena = pedirCadena();
                }
            }         
        
        }
        return emails;
    }

    public static void error() {
        System.out.println("Por  favor ingrese una opcion válida");
    }

    public static boolean verificaDisponibilidad(HashMap<String, Contact> contactos) {
        boolean var = contactos.isEmpty();
        return var;

    }

    public static void recorreImprimeContactos(HashMap<String, Contact> contactos) {
        if (verificaDisponibilidad(contactos)) {
            System.out.println("No hay contactos disponibles");
        } else {
            Iterator it = contactos.entrySet().iterator();
            System.out.println("Su lista de contactos es: ");

            while (it.hasNext()) {
                Map.Entry e = (Map.Entry) it.next();
                System.out.println(e.getValue());
            }
        }
        System.out.println("");
    }

    public static void recorreImprimeKeys(HashMap<String, Contact> contactos) {
        if (verificaDisponibilidad(contactos)) {
            System.out.println("No hay contactos disponibles");
        } else {
            Iterator it = contactos.entrySet().iterator();
            System.out.println("Su lista de Keys es : ");
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry) it.next();
                System.out.println("Key: " + e.getKey());
            }
        }
        System.out.println("");
    }

    public static void preguntaPorMas(HashMap<String, Contact> contactos) {
        if (contactos.isEmpty()) {
            //System.out.println("");
        } else {
            System.out.println("¿Quiere ver la info de algún contacto? \nIngrese la key: ");
            String opcion = pedirCadena();
            Contact calledContact = contactos.get(opcion);
            System.out.print("El contacto que ha pedido con la key: " + opcion + " es : ");
            printContact(calledContact);
        }
    }

    public static void preguntaPorMasUpdate(HashMap<String, Contact> contactos) {
        System.out.println("Ingrese la key del contacto a actualizar : ");
        String key = pedirCadena();
        System.out.println("Acontinuacion ingrese los datos del contacto: \n");
        Contact newContact;
        newContact = ContactsBookUI.crearContacto();
        contactos.put(key, newContact);
        System.out.println("Su contacto se actualizó correctamente");
    }

    public static void paraBorrar(HashMap<String, Contact> contactos) {
        
        if (contactos.isEmpty()) {
            //System.out.println("");
        } else {
            System.out.println("Ingrese la Key del contacto a eliminar: ");
            String key = pedirCadena();
            Contact deletedContact = contactos.remove(key);
            boolean check = contactos.containsKey(key);

            if (check==false){
                System.out.println("Su contacto ha sido eliminado satisfactoriamente");
            }
        }
    }
}
