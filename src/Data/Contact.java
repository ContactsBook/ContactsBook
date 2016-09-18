
package Data;


import java.util.HashSet;

public class Contact {
    private String nombre;
    private String apellido;
    private HashSet<String> correosElectronicos;
    private int telefonoFijo;
    private long telefonoMovil;
    private String direccion;

    public Contact(String nombre, String apellido, HashSet<String> correosElectronicos, int telefonoFijo, long telefonoMovil, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correosElectronicos = correosElectronicos;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashSet<String> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(HashSet<String> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }

    public int getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(int telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public long getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(long telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contact{" + "nombre=" + nombre + ", apellido=" + apellido + ", correosElectronicos=" + correosElectronicos + ", telefonoFijo=" + telefonoFijo + ", telefonoMovil=" + telefonoMovil + ", direccion=" + direccion + '}';
    }
    
    
    
   
    
}
