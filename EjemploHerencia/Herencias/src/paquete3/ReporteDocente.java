/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class ReporteDocente extends Reporte {

    double promedioSueldo;
    ArrayList<Docente> lista;

    public ReporteDocente(String cod) {
        super(cod);
    }

    public void setLista(ArrayList<Docente> list) {
        lista = list;
    }

    public void setPromedioSueldos() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldo += lista.get(i).getSueldo();
        }
        promedioSueldo /= lista.size();
    }

    public double getPromedioSueldos() {
        return promedioSueldo;
    }

    @Override
    public String toString() {
        String cadena = "\n*********************\nREPORTE DOCENTES\n";
        cadena = String.format("%s"
                + "Codigo            : %s"
                + "\nPromedio Sueldos  : %.2f", cadena, getCodigo(), getPromedioSueldos());

        return cadena;
    }
}
