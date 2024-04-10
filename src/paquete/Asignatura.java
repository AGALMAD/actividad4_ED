package paquete;

public class Asignatura {

    /***** Atributos *****/
    private int id;
    private double calificacion;

    /***** Constructores *****/

    public Asignatura(int id){
        this.id = id;
    }

    /******* Getter y Setter ****/

    public int getId() {
        return id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", calificacion=" + calificacion +
                '}';
    }
}
