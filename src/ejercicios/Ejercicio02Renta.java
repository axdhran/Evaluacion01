package ejercicios;

import java.util.Scanner;

public class Ejercicio02Renta {
    public static void main(String[] args) {

        //Instancia para lectura de datos
        Scanner ent = new Scanner(System.in);

        //Declaracion de variable
        double salary, rent=0, result=0;

        //Captura de datos
        System.out.println("----Descuento de renta----");

        System.out.println("Ingrese el monto de su sueldo");
        salary = ent.nextDouble();

        //Solucion al problema
        if(salary < 500){
            System.out.println("El monto de descuento de renta es: $0.00");
            System.out.println("El sueldo final es de: $" + salary );
        }
        else if (salary >= 500 && salary < 750) {
            rent = salary * 0.05;
            result = salary - rent;

            System.out.println("El monto de descuento de renta es: $" + rent );
            System.out.println("El sueldo final es de: $" + result );
        }
        else {
            rent = salary * 0.10;
            result = salary - rent;

            System.out.println("El monto de descuento de renta es: $" + rent );
            System.out.println("El sueldo final es de: $" + result );
        }

    }
}
