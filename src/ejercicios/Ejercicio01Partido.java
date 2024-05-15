package ejercicios;

import java.util.Scanner;

public class Ejercicio01Partido {
    public static void main(String[] args) {
        //instancia para leer datos
        Scanner ent = new Scanner(System.in);

        //declaracion de variables
        int win,los, tie, points;

        //captura de datos
        System.out.println("Ingrese el numero de partidos ganados");
        win = ent.nextInt();

        System.out.println("Ingrese el numero de partidos perdidos");
        los = ent.nextInt();

        System.out.println("Ingrese el numero de partidos empatados");
        tie = ent.nextInt();

        //solucion del problema
        points = (win * 3) + tie ;

        //muestra de datos
        System.out.println();
        System.out.println("Los puntos obtenidos en el torneo son: [" + points + "]" );
    }
}
