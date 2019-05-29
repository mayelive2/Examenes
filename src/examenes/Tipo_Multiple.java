package examenes;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;

public class Tipo_Multiple extends Pregunta {
    private int numeroCorrecta;

    public Tipo_Multiple(String texto, String correcta) {
        super(texto, correcta);
        this.numeroCorrecta = correcta.split(" ").length;
    }
    
    
    
    @Override
    public ArrayList<String> opcionesValidas() {
        ArrayList<String> opciones = new ArrayList<>();
        for(int i = 0; i < numeroCorrecta;i++) {
            opciones.add("" +(char)('a' + i));
        }
        return opciones;
    }

    @Override
    public int calcularPuntuacion(String respuesta) {
        String[] opciones = respuestaCorrecta.split(" ");
        String[] correctas = respuesta.split(" ");
        int puntuacion = 0;
        for (String correcta1 : correctas) {
            if (Arrays.asList(opciones).contains(correcta1)) {
                puntuacion++;
            } else {
                puntuacion--;
            }
        }
        return 1-abs(numeroCorrecta - puntuacion)/numeroCorrecta;
    }
    
}
