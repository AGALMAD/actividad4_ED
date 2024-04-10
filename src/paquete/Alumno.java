package paquete;

public class Alumno {

    /***** Atributos *****/

    private Asignatura programacion;
    private Asignatura SI;
    private Asignatura BD;



    /***** Constructores *****/

    public Alumno(Asignatura a1, Asignatura a2, Asignatura a3){

        programacion = a1;
        SI = a2;
        BD = a3;
    }

    public Alumno(int a1, int a2, int a3){
        programacion = new Asignatura(a1);
        SI = new Asignatura(a2);
        BD = new Asignatura(a3);

    }

    /******* Getter y Setter ****/
    public Asignatura getProgramacion() {
        return programacion;
    }

    public Asignatura getSI() {
        return SI;
    }

    public Asignatura getBD() {
        return BD;
    }

    /***** Métodos ******/

    @Override
    public String toString() {
        return "Alumno{" +
                "programacion=" + programacion.toString() +
                ", SI=" + SI.toString() +
                ", BD=" + BD.toString() +
                '}';
    }
}
