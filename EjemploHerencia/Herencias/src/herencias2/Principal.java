/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        int edad = 0, opc = 0;
        while (opc != 4) {
            System.out.println("\n    * MENU *");
            System.out.println("1. ESTUDIANTE");
            System.out.println("2. DOCENTE");
            System.out.println("3. POLICIA");
            System.out.println("4. SALIR");
            System.out.print("\nSELECCIONE UNA OPCIÓN: ");
            opc = sc.nextInt();
            while (opc < 1 || opc > 4) {
                System.out.println("ERROR AL SELECCIONAR OPCION....");
                System.out.print("\nSELECCIONE UNA OPCIÓN: ");
                opc = sc.nextInt();
            }
            sc.nextLine();
            switch (opc) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    System.out.println("Ingrese la matrícula: ");
                    double mat = sc.nextDouble();
                    Estudiante e = new Estudiante(nombre, apellido, edad, mat);
                    System.out.println(e);
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    System.out.println("Ingrese el sueldo: ");
                    double sueldo = sc.nextDouble();
                    Docente d = new Docente(nombre, apellido, edad, sueldo); // falta implementar
                    System.out.println(d);
                    break;
                case 3:
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el rango: ");
                    String rango = sc.nextLine();
                    // Un policia hereda de una Persona y adicionalmente tiene 
                    // la característia rango
                    Policia p = new Policia(nombre, apellido, edad, rango); // falta implementar
                    System.out.println(p);
                    break;
                case 4:
                    System.out.println("PROGRAMA FINALIZADO...");
                    break;
            }
        }
    }
}

