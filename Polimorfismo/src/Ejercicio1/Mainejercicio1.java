/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class Mainejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        System.out.println("Qué tipo de empleado desea crear Administrativo(a) o Programador (p) ");

        char tipoEmpleado = teclado.nextLine().charAt(0);
        Empleado a1= null;
        if (tipoEmpleado == 'a') {

             a1 = new Administrativo();
            System.out.println("Introduce nombre administrativo");
            a1.setNombre(teclado.nextLine());
            System.out.println("¿Está casad@? s/n");
            char casado = teclado.nextLine().charAt(0);
            if (casado == 's') {
                a1.setCasado(true);

            } else {
                a1.setCasado(false);
            }
            
            if (a1 instanceof Administrativo){
            System.out.println("Introduzca nivel de inglés. Alto: a. Medio: m. Bajo: b");

            char nivel = teclado.nextLine().charAt(0);
            switch (nivel) {
                case 'a':
                  ((Administrativo) a1).setNi(Administrativo.nivelingles.alto);
                    break;
                case 'm':
                     ((Administrativo) a1).setNi(Administrativo.nivelingles.medio);
                    break;
                case 'b':
                     ((Administrativo) a1).setNi(Administrativo.nivelingles.bajo);
                    break;

            }
            }
            System.out.println("Introduzca su edad");
            try {
                a1.setEdad(teclado.nextInt());

            } catch (EEdadNoValida e) {
                System.out.println(e.getMessage());
            }
            teclado.nextLine();
        } else if (tipoEmpleado == 'p') {

            Programador p1 = new Programador();
            System.out.println("Introduce nombre administrativo");
            p1.setNombre(teclado.nextLine());
            System.out.println("¿Está casad@? s/n");
              char casado = teclado.nextLine().charAt(0);
            if (casado == 's') {
                p1.setCasado(true);

            } else {
                p1.setCasado(false);
            }
            System.out.println("Lineas de código de este mes");
            p1.setLineasDeCodigoPorHora(teclado.nextInt());
            System.out.println("Introduzca su edad");
            try {
                p1.setEdad(teclado.nextInt());

            } catch (EEdadNoValida e) {
                System.out.print(e.getMessage());
            }
            teclado.nextLine();

        }
    }
}
