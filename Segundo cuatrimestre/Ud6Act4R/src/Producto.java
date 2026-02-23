import java.io.Serializable;

public class Producto implements Serializable {


    private static final long serialVersionUID = 6260423638953228932L;

    private String Referencia;
        private String Descripcion;
        private String Tipo;
        private int Cantidad;
        private double Precio;
        private int Descuento;
        private int IVA;
        private boolean AplicarDto;


        public Producto(String Referencia, String Descripcion, String Tipo){
            this.Referencia = Referencia;
            this.Descripcion = Descripcion;
            this.Tipo = Tipo;
        }

        public Producto(int Cantidad, double Precio, int Descuento, int IVA, boolean AplicarDto){
            this.Cantidad = Cantidad;
            this.Precio = Precio;
            this.Descuento = Descuento;
            this.IVA = IVA;
            this.AplicarDto = AplicarDto;

        }

        public Producto(String referencia, String descripcion, String tipo, int cantidad, double precio, int descuento, int IVA, boolean aplicarDto) {
            this.Referencia = referencia;
            this.Descripcion = descripcion;
            this.Tipo = tipo;
            this.Cantidad = cantidad;
            this.Precio = precio;
            this.Descuento = descuento;
            this.IVA = IVA;
            this.AplicarDto = aplicarDto;
        }

        public String getReferencia() {
            return Referencia;
        }

        public void setReferencia(String referencia) {
            Referencia = referencia;
        }

        public String getDescripcion() {
            return Descripcion;
        }

        public void setDescripcion(String descripcion) {
            Descripcion = descripcion;
        }

        public String getTipo() {
            return Tipo;
        }

        public void setTipo(String tipo) {
            Tipo = tipo;
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

        public int getDescuento() {
            return Descuento;
        }

        public void setDescuento(int descuento) {
            Descuento = descuento;
        }

        public int getIVA() {
            return IVA;
        }

        public void setIVA(int IVA) {
            this.IVA = IVA;
        }

        public boolean isAplicarDto() {
            return AplicarDto;
        }

        public void setAplicarDto(boolean aplicarDto) {
            AplicarDto = aplicarDto;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "Referencia='" + Referencia + '\'' +
                    ", Descripcion='" + Descripcion + '\'' +
                    ", Tipo='" + Tipo + '\'' +
                    ", Cantidad=" + Cantidad +
                    ", Precio=" + Precio +
                    ", Descuento=" + Descuento +
                    ", IVA=" + IVA +
                    ", AplicarDto ="  + AplicarDto +
                    '}';
        }


    }
