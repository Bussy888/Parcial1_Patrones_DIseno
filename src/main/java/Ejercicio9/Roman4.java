package Ejercicio9;

public class Roman4 extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("4")) {
            context.output = context.output + "IV ";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
