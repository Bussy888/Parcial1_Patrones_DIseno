package Ejercicio4;

public class FactoryMateria {
    public static Materia make(String type){
        Materia materia;
        switch (type.toLowerCase()){
            case "matematicas":
                materia = new Matematicas();
                break;
            case "historia":
                materia = new Historia();
                break;
            case "ingles":
                materia = new Ingles();
                break;
            default:
                materia = new Lenguaje();
                break;
        }
        return materia;
    }
}
