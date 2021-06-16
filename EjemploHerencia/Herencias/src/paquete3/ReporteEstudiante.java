/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatricula;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String cod) {
        super(cod);
    }

    public double getPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatricula += lista.get(i).getMatricula();
        }
        promedioMatricula /= lista.size();
        return promedioMatricula;
    }

    @Override
    public String toString() {
        String cadena = "\n*********************\nREPORTE ESTUDIANTES\n";
        cadena = String.format("%s"
                + "Codigo            : %s"
                + "\nPromedio Matricula  : $%.2f", cadena, codigo, promedioMatricula);

        return cadena;
    }
}
