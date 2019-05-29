package examenes;

import java.util.ArrayList;

public class Enunciado_Examen {
    private String nombre;
    private ArrayList<Pregunta> preguntas;

    public Enunciado_Examen(String nombre) {
        this.nombre = nombre;
        this.preguntas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }
    
    public Pregunta obtenerPregunta(int a) {
        return preguntas.get(a);
    }
    
    public boolean permutarPregunta(int mover, int lugar) {
        if(obtenerPregunta(mover) != null && obtenerPregunta(lugar) != null){
            Pregunta pregLugar = preguntas.get(lugar-1);
            Pregunta pregMover = preguntas.get(mover-1);
            preguntas.set(mover-1, pregLugar);
            preguntas.set(lugar-1, pregMover);
            return true;
        }
        return false;
    }
    
    public boolean borrarPregunta(Pregunta pregunta){
        if(preguntas.contains(pregunta)) {
            preguntas.remove(pregunta);
            return true;
        }
        return false;
    }
    
    public boolean borrarPregunta(int numeroPregunta){
        if(obtenerPregunta(numeroPregunta) != null) {
            preguntas.remove(numeroPregunta);
            return true;
        }
        return false;
    }
    
    public boolean contienePregunta(Pregunta pregunta){
        return preguntas.contains(pregunta);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPreguntas() {
        return preguntas.size();
    }
    
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
    
}
