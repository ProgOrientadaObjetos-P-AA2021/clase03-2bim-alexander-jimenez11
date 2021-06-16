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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("\n    *** MENU ***");
        System.out.println("1. ESTUDIANTE");
        System.out.println("2. DOCENTE");
        System.out.println("3. POLICIA");
        //System.out.println("4. SALIR");
        System.out.print("\nSELECCIONE UNA OPCIÓN: ");
         System.out.print("Nonmbre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
        opc = sc.nextInt();
        sc.nextLine();
        switch (opc) {
            case 1:
               
                Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
                System.out.println(e);
            // Un docente hereda de una Persona y adicionalmente tiene 
            // la característia sueldo
            case 2:
                Docente d = new Docente("Luis", "Alvarez", 40, 400); // falta implementar
                System.out.println(d);
            case 3:
                // Un policia hereda de una Persona y adicionalmente tiene 
                // la característia rango
                Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
                System.out.println(p);
          
           
        }

    }
}
