
package paquete02;

public class Calificacion {
    
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Calificacion(String nom, String ape,double n1, double n2, double n3) {
        nombre = nom;
        apellido = ape;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerCalificacion1(double c) {
        nota1 = c;
    }

    public void establecerCalificacion2(double c) {
        nota2 = c;
    }

    public void establecerCalificacion3(double c) {
        nota3 = c;
    }

    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerNota1() {
        return nota1;
    }

    public double obtenerNota2() {
        return nota2;
    }

    public double obtenerNota3() {
        return nota3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String data = String.format("%s %s\n"
                + "  Calificaciones:\n"
                + "  ->1: %.2f\n"
                + "  ->2: %.2f\n"
                + "  ->3: %.2f\n"
                + "  Promedio: %.2f\n",
                nombre, apellido, nota1, nota2,
                nota3,promedio);
        return data;

    }
}
