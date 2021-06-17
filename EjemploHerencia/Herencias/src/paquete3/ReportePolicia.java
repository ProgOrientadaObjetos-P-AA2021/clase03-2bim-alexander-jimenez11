/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class ReportePolicia extends Reporte {

    double promedioEdad;
    ArrayList<Policia> lista;

    public ReportePolicia(String cod) {
        super(cod);
    }

    public void setLista(ArrayList<Policia> list) {
        lista = list;
    }

    public void setPromedioEdad() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdad += lista.get(i).getEdad();
        }
        promedioEdad /= lista.size();
    }

    public double getPromedioEdad() {

        return promedioEdad;
    }

    @Override
    public String toString() {
        String cadena = "\n*********************\nREPORTE POLICIAS\n";
        cadena = String.format("%s"
                + "Codigo            : %s"
                + "\nPromedio Edad  : $%.2f Años", cadena, getCodigo(), getPromedioEdad());

        return cadena;
    }
}
