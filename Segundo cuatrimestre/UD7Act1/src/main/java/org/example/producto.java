package org.example;

/**
 * Representa la entidad Producto dentro del sistema de inventario.
 * <p>
 * Esta clase actúa como un modelo de datos (POJO) que contiene todas las propiedades
 * de un producto, incluyendo información técnica, de stock y comercial.
 * </p>
 * * @author Nahiomy
 * @version 1.0
 */
public class producto {

    /** Identificador único del producto en la base de datos. */
    private int id;

    /** Código de referencia único del producto (SKU). */
    private String referencia;

    /** Nombre comercial del producto. */
    private String nombre;

    /** Descripción detallada de las características del producto. */
    private String descripcion;

    /** Categoría o tipo al que pertenece el producto (FK a la tabla tipos). */
    private int tipo;

    /** Cantidad disponible en el inventario. */
    private int cantidad;

    /** Precio unitario de venta. */
    private double precio;

    /** Porcentaje de descuento aplicable (0-100). */
    private int descuento;

    /** Porcentaje de IVA aplicado al producto. */
    private int iva;

    /** Indica si el producto es apto para promociones o descuentos automáticos. */
    private boolean aplicarDto;

    /**
     * Constructor completo para crear un objeto producto con todos sus atributos.
     * * @param id Identificador único.
     * @param referencia Referencia única del producto.
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param tipo Identificador del tipo/categoría.
     * @param cantidad Stock inicial.
     * @param precio Precio de venta.
     * @param descuento Porcentaje de descuento inicial.
     * @param iva Tipo de IVA aplicable.
     * @param aplicarDto Estado de aplicación de descuento.
     */
    public producto(int id, String referencia, String nombre, String descripcion, int tipo, int cantidad, double precio, int descuento, int iva,  boolean aplicarDto) {
        this.id = id;
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.iva = iva;
        this.aplicarDto = aplicarDto;

    }

    /**
     * Constructor simplificado (útil para inserciones donde el ID es autoincremental).
     * * @param refP Referencia del producto.
     * @param nombreP Nombre del producto.
     * @param descripcionP Descripción del producto.
     * @param idTP Identificador de tipo.
     * @param cantidadP Cantidad en stock.
     * @param precioP Precio unitario.
     * @param descuentoP Porcentaje de descuento.
     * @param ivaP Porcentaje de IVA.
     * @param aplicarP Estado del descuento.
     */
    public producto(String refP, String nombreP, String descripcionP, int idTP, int cantidadP, double precioP, int descuentoP, int ivaP, boolean aplicarP) {
        this.referencia = refP;
        this.nombre = nombreP;
        this.descripcion = descripcionP;
        this.tipo = idTP;
        this.cantidad = cantidadP;
        this.precio = precioP;
        this.descuento = descuentoP;
        this.iva = ivaP;
        this.aplicarDto = aplicarP;
    }

    /** @return El ID único del producto. */
    public int getId() {
        return id;
    }
    /** @param id El nuevo ID del producto. */
    public void setId(int id) {
        this.id = id;
    }

    /** @return La referencia comercial. */
    public String getReferencia() {
        return referencia;
    }


    /** @return El nombre del producto. */
    public String getNombre() {
        return nombre;
    }


    /** @return La descripción del producto. */
    public String getDescripcion() {
        return descripcion;
    }


    /** @return El identificador de tipo de producto. */
    public int getTipo() {
        return tipo;
    }


    /** @return La cantidad disponible en stock. */
    public int getCantidad() {
        return cantidad;
    }


    /** @return El precio de venta. */
    public double getPrecio() {
        return precio;
    }


    /** @return El porcentaje de descuento actual. */
    public int getDescuento() {
        return descuento;
    }


    /** @return El porcentaje de IVA aplicado. */
    public int getIva() {
        return iva;
    }


    /** @return {@code true} si se aplica descuento, {@code false} de lo contrario. */
    public boolean isAplicarDto() {
        return aplicarDto;
    }


    /**
     * Devuelve una representación en cadena de texto del objeto producto.
     * @return String con todos los atributos del producto.
     */
    @Override
    public String toString() {
        return "producto{" +
                "id= " + id +
                ", referencia= " + referencia + '\'' +
                ", nombre= " + nombre + '\'' +
                ", descripcion= " + descripcion + '\'' +
                ", tipo= " + tipo + '\'' +
                ", cantidad= " + cantidad +
                ", precio= " + precio +
                ", descuento= " + descuento +
                ", iva= " + iva +
                ", aplicarDto= " + aplicarDto +
                "}";
    }
}
