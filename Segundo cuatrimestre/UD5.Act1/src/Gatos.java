import java.io.Serializable;

public class Gatos {
    String Nombre;
    int Edad;


    public Gatos(String nombre, int edad){

        this.Nombre = nombre;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) throws NombreGatoException {
        if (nombre == null || nombre.length() < 3){
            this.Nombre = "John";
            throw new NombreGatoException(Nombre);
        }
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) throws EdadGatosException {
        if (edad < 0) {
            throw new EdadGatosException(Edad);
        }

    }

    public void ImprimirGato(){
        System.out.println("Gato = [Nombre: " + Nombre + ", Edad: " + Edad + "]");

    }

    @Override
    public String toString() {
        return "Gatos{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }
}

