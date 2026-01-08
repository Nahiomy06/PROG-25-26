public class Inventario {

    private String Nombre;
    private Mascotas [] MisMascotas;



    //Nuestro propio :3
    private int MascotasActuales;

    public Inventario (String nombre, int capacidad){

        this.Nombre = nombre;
        this.MisMascotas = new Mascotas[capacidad];
        this.MascotasActuales = 0;


    }

    public String getNombre() {
        return Nombre;
    }


    public boolean InsertarMascota(Mascotas mascotas){
        boolean Estado = false;
        if (MascotasActuales < this.MisMascotas.length){
            this.MisMascotas[MascotasActuales] = mascotas;
            this.MascotasActuales ++;
            Estado = true;
        }
        return Estado;
    }


    public  boolean EliminarMascotas(Mascotas mascotas){
        boolean Estado = false;
        int Index = -1;
        if (MascotasActuales > 0){
            for (int i = 0; i < this.MascotasActuales; i++) {
                if (this.MisMascotas[i].Nombre == mascotas.Nombre){

                    Index = i;
                    break;;
                }

            }
            if (Index != -1){
                this.MisMascotas[Index] = this.MisMascotas[MascotasActuales - 1];
                this.MisMascotas[MascotasActuales - 1] = null;
                this.MascotasActuales--;
                Estado = true;

            }

        }
        return Estado;
    }


    public  boolean VaciarInventario(){
        boolean Estado = false;
        if (this.MascotasActuales > 0){
            this.MisMascotas = new  Mascotas[10];
            this.MascotasActuales = 0;
            Estado = true;
        }
        return Estado;
    }


    public String MostrarInfoMascotas(int Pocicion) {
        String mascotas = "no ahi mascotas que correspondan";
        if (Pocicion >= 0 && Pocicion < this.MascotasActuales){
            mascotas = this.MisMascotas[Pocicion].toString();

        }
        return mascotas;
    }
    








}
