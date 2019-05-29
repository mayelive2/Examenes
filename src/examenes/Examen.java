package examenes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Examen {
    public static int id  = 1;
    private int identificador;
    private final Enunciado_Examen enunciado;
    private Map< Pregunta, String> respuestas;

    Examen(Enunciado_Examen enunciado) {
        this.enunciado = enunciado;
        respuestas = new HashMap<>();
        this.identificador = Examen.id++;
    }
    
    public boolean responder(int numero, String respuesta) {
        if(enunciado.obtenerPregunta(numero) != null ){
            if(!respuestas.containsKey(enunciado.getPreguntas().get(numero))){
                respuestas.put(enunciado.getPreguntas().get(numero), respuesta);
            }else{
                respuestas.replace(enunciado.getPreguntas().get(numero), respuesta);
            }
            return true;
        }
        return false;
    }
    
    public int obtenerNota(int numero){
        if(enunciado.obtenerPregunta(numero) != null ){
            String respondio = respuestas.get(enunciado.getPreguntas().get(numero));
            return enunciado.obtenerPregunta(numero).calcularPuntuacion(respondio);
        }
        return 0;
    }
    
    public int corregir(){
        int puntuacion = 0;
        for(int i = 0; i<enunciado.getNumeroPreguntas();i++){
            puntuacion += obtenerNota(i);
            
        }
        return 10*(puntuacion/enunciado.getNumeroPreguntas());
    }

    public static int getId() {
        return id;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Enunciado_Examen getEnunciado() {
        return enunciado;
    }

    public Map<Pregunta, String> getRespuestas() {
        return respuestas;
    }
    
}
