package paquete;

import paquete.Alumno;

public class Profesor {

    /*** Métodos ***/

    //Pone notas aleatorias entre 0 y 10 a cada asignatura de un alumno
    public void ponerNotas(Alumno alumno){
        /* Notas aleatorias entre 0 y 10*/
        int n1 = (int) (Math.random() * 11);
        int n2 = (int) (Math.random() * 11);
        int n3 = (int) (Math.random() * 11);

        //Pone las notas
        alumno.getProgramacion().setCalificacion(n1);
        alumno.getBD().setCalificacion(n2);
        alumno.getSI().setCalificacion(n3);

    }

    //Calcula la media de las notas de un alumno
    public double calcularMedia(Alumno alumno){
        double media = (alumno.getProgramacion().getCalificacion() + alumno.getSI().getCalificacion() + alumno.getBD().getCalificacion() ) / 3;

        return media;
    }




}
