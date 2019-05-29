package examenes;

import java.util.ArrayList;

public class Tipo_TrueOr_False extends Pregunta{

    public Tipo_TrueOr_False(String texto, String correcta) {
        super(texto, correcta);
    }

    @Override
    public ArrayList<String> opcionesValidas() {
        ArrayList<String> opciones = new ArrayList<>();
        opciones.add("verdadero");
        opciones.add("falso");
        return opciones;
    }

    @Override
    public int calcularPuntuacion(String respuesta) {
        if(respuesta.equals(respuestaCorrecta)){
            return 1;
        }
        return -1;
    }
    
}
