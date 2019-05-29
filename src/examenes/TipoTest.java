package examenes;

import java.util.ArrayList;

public class TipoTest extends Pregunta {
    private int numeroOpciones;

    public TipoTest( String texto, String correcta, int numeroOpciones) {
        super(texto, correcta);
        this.numeroOpciones = numeroOpciones;
    }

    public int getNumeroOpciones() {
        return numeroOpciones;
    }

    @Override
    public ArrayList<String> opcionesValidas() {
        ArrayList<String> opciones = new ArrayList<>();
        for(int i = 0; i < numeroOpciones;i++) {
            opciones.add("" +(char)('a' + i));
        }
        return opciones;
    }

    @Override
    public int calcularPuntuacion(String respuesta) {
        if(respuestaCorrecta.equals(respuesta)) {
            return 1;
        }
        return -(1/this.numeroOpciones);
    }
    
}
