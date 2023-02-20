package Ejercicio2;

import javax.print.Doc;

public class Client {
    public static void main(String[] args) {
        Docentes docentes = new Docentes();
        docentes.setNombre("");
        docentes.setApellido("");
        docentes.setSueldo(5000);
        docentes.setCargaHoraria(80);
        docentes.setCursoEducacionSuperior(true);
        docentes.setAccesoPlataforma(true);
        docentes.setMarcadoBiometrico(false);
        docentes.setHoraDeEntrada("08:00");
        docentes.setHoraDeSalida("18:00");

        Docentes d1 = docentes.clone();
        d1.setNombre("Carlos");
        d1.setApellido("Ortega");
        d1.showInfo();

        Docentes d2 = docentes.clone();
        d2.setNombre("John");
        d2.setApellido("Price");
        d2.showInfo();

        Docentes d3 = docentes.clone();
        d3.setNombre("Simon");
        d3.setApellido("Riley");
        d3.showInfo();

        Docentes d4 = docentes.clone();
        d4.setNombre("Alex");
        d4.setApellido("Mason");
        d4.showInfo();

        Docentes d5 = docentes.clone();
        d5.setNombre("Kyle");
        d5.setApellido("Garrick");
        d5.showInfo();

        Docentes d6 = docentes.clone();
        d6.setNombre("John");
        d6.setApellido("McTavish");
        d6.showInfo();

        Docentes d7 = docentes.clone();
        d7.setNombre("Samantha");
        d7.setApellido("Maxis");
        d7.showInfo();

        Docentes d8 = docentes.clone();
        d8.setNombre("Nikolai");
        d8.setApellido("Belinski");
        d8.showInfo();

        Docentes d9 = docentes.clone();
        d9.setNombre("Edward");
        d9.setApellido("Richtofen");
        d9.showInfo();

        Docentes d10 = docentes.clone();
        d10.setNombre("Tank");
        d10.setApellido("Dempsey");
        d10.showInfo();

        Docentes d11 = docentes.clone();
        d11.setNombre("Takeo");
        d11.setApellido("Masaki");
        d11.showInfo();

        Docentes d12 = docentes.clone();
        d12.setNombre("Dimitri");
        d12.setApellido("Petrenko");
        d12.showInfo();

        Docentes d13 = docentes.clone();
        d13.setNombre("Victor");
        d13.setApellido("Reznov");
        d13.showInfo();

        Docentes d14 = docentes.clone();
        d14.setNombre("Vladimir");
        d14.setApellido("Makarov");
        d14.showInfo();

        Docentes d15 = docentes.clone();
        d15.setNombre("Alejandro");
        d15.setApellido("Vargas");
        d15.showInfo();
    }
}
