public class Producto {

        private String Codigo;
        private String Nombre;
        private String Descripcion;
        private double Precio;
        private int Cantidad;




    public Producto(String Codigo, String Nombre, String descripcion, double Precio, int Cantidad) {
            this.Codigo = Codigo;
            this.Nombre = Nombre;
            this.Descripcion = descripcion;
            this.Cantidad = Cantidad;
            this.Precio = Precio;
        }


        public String getCodigo() {
            return Codigo;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getDescripcion() {
        return Descripcion;
        }
        public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
        }

        public int getCantidad() {
            return Cantidad;
        }

        public void setCantidad(int cantidad) {
            Cantidad = cantidad;
        }

        public double getPrecio() {
            return Precio;
        }

        public void setPrecio(double precio) {
            Precio = precio;
        }


    @Override
    public String toString() {
        return "Producto{" +
                "Codigo='" + Codigo + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Precio=" + Precio +
                ", Cantidad=" + Cantidad +
                '}';
    }

    @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }




    }
