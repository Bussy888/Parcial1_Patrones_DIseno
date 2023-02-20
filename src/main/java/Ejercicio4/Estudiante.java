package Ejercicio4;

public class Estudiante {
    private String nombre;
    private int ci;
    FactoryMateria factoryMateria = new FactoryMateria();

    public Estudiante(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
    }
     public void materiaAsignada(String materia){
         System.out.println("*****ASIGNACION DE MATERIA*****");
         System.out.println("El estudiante :"+nombre);
         System.out.println("Con Carnet de Identidad: "+ci);
         factoryMateria.make(materia).showInfo();
     }

}
