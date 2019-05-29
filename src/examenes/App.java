package examenes;

import java.util.Scanner;

public class App {

    
    public static void main(String[] args) {
        System.out.println("¿Tu nombre es?");
        Scanner teclado = new Scanner(System.in);
        String linea = teclado.nextLine();
        Enunciado_Examen enunciado = new Enunciado_Examen(linea);
        TipoTest preguntaTipoTest = new TipoTest("¿Cuál es el valor decimal del número binario 0010?\n a. 1, b. 2, c. 3",
        "b",1);
        enunciado.agregarPregunta(preguntaTipoTest);
        Tipo_Multiple preguntaMultiple = new Tipo_Multiple("¿Cuáles son protocolos deURL?\n a. http, b. ftp, c. coco",
        "a b");
        enunciado.agregarPregunta(preguntaMultiple);
        Tipo_TrueOr_False preguntaTrueOrFalse = new Tipo_TrueOr_False("¿Un byte equivale a 16 bits?", "falso");
        enunciado.agregarPregunta(preguntaTrueOrFalse);
        Examen examen = new Examen(enunciado);
        for(int i = 0; i< examen.getEnunciado().getNumeroPreguntas();i++){
            System.out.println(examen.getEnunciado().getPreguntas().get(i).toString());
            linea = teclado.nextLine();
            examen.responder(i, linea);
        }
        System.out.println("Tu nota es " +examen.corregir());
        

    }

    
}
