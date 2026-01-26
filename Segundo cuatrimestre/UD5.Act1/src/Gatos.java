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

    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3){
            this.Nombre = "John";
            throw new IllegalArgumentException("El nombre ser mayor a 3 letras. Se pondra el nombre John por defecto;");
        }
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            this.Edad = 1;
            throw new Exception("la edad no puede ser negativa o ser un caracter, Se pondra la edad por defecto como 1.");
        }

    }

    public void ImprimirGato(){
        System.out.println("Gato = [Nombre: " + Nombre + ", Edad: " + Edad + "]");

    }






}

