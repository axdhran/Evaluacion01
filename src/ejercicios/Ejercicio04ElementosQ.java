package ejercicios;

import java.util.Scanner;

public class Ejercicio04ElementosQ {
    public static void main(String[] args) {

        //Instancia para leer datos
        Scanner ent = new Scanner(System.in);

        //Declaracion de vector
        String[] elementos = new String[8];

        //Captura de datos
        for(int i = 0; i < 8; i++){
            System.out.println("Escriba el nombre de un elemento quimico");
            elementos[i] = ent.next();
        }

        //Mostrar los datos
        for(int i = 7; i >= 0; i--){
            System.out.print(elementos[i] + ",");
        }
    }
}
