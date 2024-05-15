package ejercicios;

import java.util.Scanner;

public class Ejercicio03Impares {
    public static void main(String[] args) {

        //Instancia para leer datos
        Scanner ent = new Scanner(System.in);

        //Captura de datos
        System.out.println("Ingrese un numero entero positivo: ");
         int num = ent.nextInt();

        //Solucion del problema
        if(num < 0){
            System.out.println("El numero ingresado no es valido. Debe de ser positivo");
        }
        else {
            System.out.println("Numeros impares entre 0 y " + num + ":");
            for (int i = 0; i <= num; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
