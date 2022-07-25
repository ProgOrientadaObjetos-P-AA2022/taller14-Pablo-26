
package paquete02;

public class Trabajador {
    private String ci;
    private String nombre;
    private String correo;
    private double sueldo;
    private int mesSueldo;
    
    public Trabajador(String c, String nom, String co, double s, int m){
        ci = c;
        nombre = nom;
        correo = co;
        sueldo = s;
        mesSueldo = m;
    }
    
    public void establecerCedula(String c){
        ci = c;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCorreo(String c){
        correo = c;
    }
    
    public void establecerSueldo(double s){
        sueldo = s;
    }
    
    public void establecerMesSueldo(int m){
        mesSueldo = m;
    }
    
    public String obtenerCedula(){
        return ci;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCorreo(){
        return correo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public int obtenerMesSueldo(){
        return mesSueldo;
    }
    
    @Override
    public String toString() {
        String data = String.format("Nombre: %s\n"
                + "Cédula: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del Sueldo: %d\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo());
        return data;
    }
}
