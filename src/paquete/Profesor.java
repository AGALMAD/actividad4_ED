package paquete;

import paquete.Alumno;

import java.util.Random;

public class Profesor {

    /*** Métodos ***/

    //Pone notas aleatorias entre 0 y 10 a cada asignatura de un alumno
    public void ponerNotas(Alumno alumno){
        /* Notas aleatorias entre 0 y 10*/

        /* Cambio realizado en la nueva versión */
        Random numRandom = new Random();
        int n1 = numRandom.nextInt(0, 11) ;
        int n2 = numRandom.nextInt(0, 11) ;
        int n3 = numRandom.nextInt(0, 11) ;

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
