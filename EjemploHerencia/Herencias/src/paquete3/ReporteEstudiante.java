package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

public class ReporteEstudiante extends Reporte {

    double promedioMatricula;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String cod) {
        super(cod);
    }

    public void setLista(ArrayList<Estudiante> list) {
        lista = list;
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public void setPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatricula += lista.get(i).getMatricula();
        }
        promedioMatricula /= lista.size();
    }

    public double getPromedioMatriculas() {

        return promedioMatricula;
    }

    @Override
    public String toString() {
        String cadena = "\n*********************\nREPORTE ESTUDIANTES\n";
        cadena = String.format("%s"
                + "Codigo  Reporte: %s", cadena, getCodigo());
        for (int i = 0; i < getLista().size(); i++) {
            cadena = String.format("%s\nNombres: %s -  Edad: %d - Matricula: $ "
                    + "%.2f", cadena, getLista().get(i).getNombre() + " "
                    + getLista().get(i).getApellido(),
                    getLista().get(i).getEdad(),
                    getLista().get(i).getMatricula());
        }
        cadena = String.format("%s\nPromedio Matriculas: $%.2f", cadena,
                getPromedioMatriculas());
        return cadena;
    }
}
