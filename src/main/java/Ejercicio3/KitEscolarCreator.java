package Ejercicio3;

public class KitEscolarCreator extends CreatorKit{
    @Override
    public KitEscolar create() {
        KitEscolar kit = new KitEscolar();
        Mochila mochila = new Mochila();
        mochila.setnBolsillos(10);
        mochila.setTamano("XL");
        kit.setMochila(mochila);

        Cuadernos cuadernos = new Cuadernos();
        cuadernos.setnHojas(100);
        cuadernos.setTipo("Oficio");
        kit.setCuadernos(cuadernos);

        Deportivo deportivo = new Deportivo();
        deportivo.setColor("Rojo");
        deportivo.setnPrendas(3);
        deportivo.setTalla("L");
        kit.setDeportivo(deportivo);

        return kit;
    }
}
