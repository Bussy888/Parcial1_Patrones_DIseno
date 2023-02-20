package Ejercicio4;

public class Client {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Mateo Michel", 60305355);
        e1.materiaAsignada("Historia");

        Estudiante e2 = new Estudiante("Frank Woods", 54367821);
        e2.materiaAsignada("MATEMATICAS");

        Estudiante e3 = new Estudiante("Blake Shelton", 609540241);
        e3.materiaAsignada("Lenguaje");

        Estudiante e4 = new Estudiante("Luke Combs", 123444345);
        e4.materiaAsignada("ingles");

        Estudiante e5 = new Estudiante("Cody Jinks", 48784943);
        e5.materiaAsignada("INGLES");

    }
}
