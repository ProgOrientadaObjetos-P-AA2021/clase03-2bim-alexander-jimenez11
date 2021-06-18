package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

public class ReporteDocente extends Reporte {

    double promedioSueldo;
    ArrayList<Docente> lista;

    public ReporteDocente(String cod) {
        super(cod);
    }

    public void setLista(ArrayList<Docente> list) {
        lista = list;
    }

    public ArrayList<Docente> getLista() {
        return lista;
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
                + "Codigo  Reporte: %s", cadena, getCodigo());
        for (int i = 0; i < getLista().size(); i++) {
            cadena = String.format("%s\nNombres: %s -  Edad: %d - Sueldo: $ "
                    + "%.2f",cadena, getLista().get(i).getNombre() + " "
                    + getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),getLista().get(i).getSueldo());
        }
        cadena = String.format("%s\nPromedio Sueldos: $%.2f", cadena,
                getPromedioSueldos());
        return cadena;
    }
}
