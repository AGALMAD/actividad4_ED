package paquete;

public class Main {
    public static void main(String[] args) {

    //Crea 3 asignaturas
    Asignatura a1 = new Asignatura(1);
    Asignatura a2 = new Asignatura(2);
    Asignatura a3 = new Asignatura(3);

    //Crea el alumno con las tres asignaturas
    Alumno alumno = new Alumno(a1,a2,a3);

    //Crea el profesor
    Profesor profesor = new Profesor();

    profesor.ponerNotas(alumno);

    System.out.println(alumno.toString());

    System.out.println(profesor.calcularMedia(alumno));


    /*** Creación del usuario con nombre, año de nacimiento y DNI ***/
    Alumno alumnoNuevo = new Alumno(a1,a2,a3,"Pepe", 2003, "12345678J");

    System.out.println(alumnoNuevo.toString());


    }
}