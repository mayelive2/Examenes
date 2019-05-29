package examenes;

import java.util.ArrayList;

public abstract class Pregunta {
    protected String texto;
    protected String respuestaCorrecta;
    protected int dificultad;

    public Pregunta(String texto, String correcta) {
        this.texto = texto;
        this.respuestaCorrecta = correcta;
        this.dificultad = 0;
    }
    
    public abstract ArrayList<String> opcionesValidas ();
    public abstract int calcularPuntuacion (String respuesta);
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    @Override
    public String toString(){
        String inf = texto + " ";
        return inf;
    }
        @Override
    public Object clone() throws CloneNotSupportedException {
        Pregunta obj=null;
        try{
            obj=(Pregunta)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println("No se puede duplicar");
        }
        return obj;
    }
    
    
    public String getTexto() {
        return texto;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public int getDificultad() {
        return dificultad;
    }

    
}
