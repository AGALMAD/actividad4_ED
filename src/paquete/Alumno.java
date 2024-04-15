package paquete;

public class Alumno {

    /***** Atributos *****/

    private Asignatura programacion;
    private Asignatura SI;
    private Asignatura BD;

    /*** Mejora de atributos para el alumno ***/
    private String nombre;
    private int anioNac;
    private String DNI;


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


    /*** Constructor para añadir el nombre, el año del nacimineto y el DNI***/
    public Alumno(Asignatura programacion, Asignatura SI, Asignatura BD, String nombre, int anioNac, String DNI) {
        this.programacion = programacion;
        this.SI = SI;
        this.BD = BD;
        this.nombre = nombre;
        this.anioNac = anioNac;
        this.DNI = DNI;
    }

    /******* Métodos para obtener los datos ****/
    public Asignatura getProgramacion() {
        return programacion;
    }

    public Asignatura getSI() {
        return SI;
    }

    public Asignatura getBD() {
        return BD;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public String getDNI() {
        return DNI;
    }

    /***** Métodos ******/

    @Override
    public String toString() {
        return "Alumno{" +
                "programacion=" + programacion.toString() +
                ", SI=" + SI.toString() +
                ", BD=" + BD.toString() +
                ", nombre='" + nombre + '\'' +
                ", anioNac=" + anioNac +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
