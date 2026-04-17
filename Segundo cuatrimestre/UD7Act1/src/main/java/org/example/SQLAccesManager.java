package org.example;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase de acceso a datos (DAO) para gestionar las operaciones CRUD de la tabla Productos.
 * <p>
 * Proporciona métodos estáticos para consultar, insertar, actualizar y eliminar
 * registros de productos en la base de datos utilizando JDBC.
 * </p>
 * * @author Nahiomy
 * @version 1.0
 */
public class SQLAccesManager {




    /**
     * Obtiene la lista completa de productos almacenados en la base de datos.
     * * @return Una {@link List} de objetos {@link producto} con todos los registros encontrados.
     * @throws RuntimeException Si ocurre un error de acceso a la base de datos (SQLException).
     */

    //1
    public static List<producto> getProductos() {
        List<producto> Productos = new LinkedList<>();

        String sqlProductos = "select * from productos";

        try(Connection connection = SQLManager.getConnection();
                Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlProductos)) {

            while (resultSet.next()) {

                int IDProducto = resultSet.getInt(1);
                String ReferenciaProducto = resultSet.getString(2);
                String NombreProducto = resultSet.getString(3);
                String DescripcionProducto = resultSet.getString(4);
                int TipoProducto = resultSet.getInt(5);
                int CantidadProducto = resultSet.getInt(6);
                double PrecioProducto = resultSet.getDouble(7);
                int DescuentoProducto = resultSet.getInt(8);
                int IVAProducto = resultSet.getInt(9);
                boolean AplicarDtoProducto = resultSet.getBoolean(10);

                Productos.add(new producto(IDProducto, ReferenciaProducto, NombreProducto, DescripcionProducto, TipoProducto, CantidadProducto, PrecioProducto, DescuentoProducto, IVAProducto, AplicarDtoProducto));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Productos;

    }


    /**
     * Busca un producto específico a través de su referencia única.
     * * @param RefProducto La cadena de texto que identifica la referencia del producto.
     * @return Un objeto {@link producto} si se encuentra; {@code null} en caso contrario.
     * @throws RuntimeException Si ocurre un error en la ejecución de la consulta SQL.
     */
    //2 Despues pone un list
    public static producto getProductoRef(String RefProducto) {

        producto P = null;

        String sqlProductoID = "select * from productos where referencia = ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sqlProductoID)){


            statement.setString(1, RefProducto);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String ReferenciaProducto = resultSet.getString(2);
                String NombreProducto = resultSet.getString(3);
                String DescripcionProducto = resultSet.getString(4);
                int TipoProducto = resultSet.getInt(5);
                int CantidadProducto = resultSet.getInt(6);
                double PrecioProducto = resultSet.getDouble(7);
                int DescuentoProducto = resultSet.getInt(8);
                int IVAProducto = resultSet.getInt(9);
                boolean AplicarDtoProducto = resultSet.getBoolean(10);

                P = new producto(id, ReferenciaProducto, NombreProducto, DescripcionProducto, TipoProducto, CantidadProducto, PrecioProducto, DescuentoProducto, IVAProducto, AplicarDtoProducto);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return  P;

    }


    /**
     * Busca el primer producto que coincida con un tipo específico.
     * * @param Tipo El identificador numérico del tipo de producto.
     * @return El primer objeto {@link producto} encontrado; {@code null} si no hay coincidencias.
     * @throws RuntimeException Si ocurre un error en la base de datos.
     */
    //3
    public static producto getProTipo(int Tipo) {

        producto P = null;

        String sqlProductoID = "select * from productos where tipo = ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sqlProductoID)){


            statement.setInt(1, Tipo);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String ReferenciaProducto = resultSet.getString(2);
                String NombreProducto = resultSet.getString(3);
                String DescripcionProducto = resultSet.getString(4);
                int TipoProducto = resultSet.getInt(5);
                int CantidadProducto = resultSet.getInt(6);
                double PrecioProducto = resultSet.getDouble(7);
                int DescuentoProducto = resultSet.getInt(8);
                int IVAProducto = resultSet.getInt(9);
                boolean AplicarDtoProducto = resultSet.getBoolean(10);

                P = new producto(id, ReferenciaProducto, NombreProducto, DescripcionProducto, TipoProducto, CantidadProducto, PrecioProducto, DescuentoProducto, IVAProducto, AplicarDtoProducto);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return  P;
    }


    /**
     * Obtiene una lista de productos cuyo stock es mayor o igual a la cantidad especificada.
     * * @param CantidadProduct Cantidad mínima de stock para filtrar.
     * @return Una {@link List} de productos que cumplen el criterio de cantidad.
     * @throws RuntimeException Si hay un error en la consulta preparada.
     */
    //4 Lista
    public static List<producto> getProCantidad(int CantidadProduct) {
        List<producto> ProductosCant = new LinkedList<>();


        String sqlProductoID = "select * from productos where cantida >= ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sqlProductoID)){


            statement.setInt(1, CantidadProduct);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String ReferenciaProducto = resultSet.getString(2);
                String NombreProducto = resultSet.getString(3);
                String DescripcionProducto = resultSet.getString(4);
                int TipoProducto = resultSet.getInt(5);
                int CantidadProducto = resultSet.getInt(6);
                double PrecioProducto = resultSet.getDouble(7);
                int DescuentoProducto = resultSet.getInt(8);
                int IVAProducto = resultSet.getInt(9);
                boolean AplicarDtoProducto = resultSet.getBoolean(10);

                ProductosCant.add(new producto(id, ReferenciaProducto, NombreProducto, DescripcionProducto, TipoProducto, CantidadProducto, PrecioProducto, DescuentoProducto, IVAProducto, AplicarDtoProducto));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return ProductosCant;
    }


    /**
     * Inserta un nuevo producto en la base de datos.
     * * @param p El objeto {@link producto} que contiene los datos a insertar.
     * @return El número de filas afectadas (habitualmente 1) o 0 si no se insertó nada.
     * @throws RuntimeException Si ocurre un error de integridad o de SQL.
     */
    //5
    public static int InsertarProducto(producto p) {

        int response = -1;

        String SQLInsertarProducto = "insert into productos(referencia, nombre, descripcion, tipo, cantida, precio, descuento, iva, aplicarDto)"
                + "Values ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";



        try (Connection connection = SQLManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQLInsertarProducto)){

            statement.setNString(1, p.getReferencia());
            statement.setNString(2, p.getNombre());
            statement.setNString(3, p.getDescripcion());
            statement.setInt(4, p.getTipo());
            statement.setInt(5, p.getCantidad());
            statement.setDouble(6, p.getPrecio());
            statement.setInt(7, p.getDescuento());
            statement.setInt(8, p.getIva());
            statement.setBoolean(9, p.isAplicarDto());

            response = statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return response;
    }

    /**
     * Elimina un producto de la base de datos basándose en su referencia.
     * * @param referencia La referencia del producto a eliminar.
     * @return El número de filas eliminadas.
     * @throws RuntimeException Si ocurre un error durante el borrado.
     */
    public static int EliminarProducto(String referencia) {
        int response = -1;

        String SQLEliminarProducto = "delete from productos where referencia = ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQLEliminarProducto)
        ){
            statement.setString(1, referencia);
             response = statement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return response;
    }

    /**
     * Actualiza los datos de un producto existente identificado por su ID.
     * * @param descripcionP Nueva descripción del producto.
     * @param cantidadP Nueva cantidad en stock.
     * @param precioP Nuevo precio unitario.
     * @param descuentoP Nuevo porcentaje de descuento.
     * @param aplicarDtoP Estado de aplicación de descuento.
     * @param idP Identificador único (ID) del producto a modificar.
     * @return El número de filas actualizadas.
     * @throws RuntimeException Si ocurre un error durante la actualización.
     */
    public static int ActualizarProducto(String descripcionP, int cantidadP, double  precioP, int descuentoP,  boolean aplicarDtoP, int idP) {
        int response = -1;

        String SQLActualizarProducto = "update productos set  descripcion = ?, " +
                "cantida = ?, precio = ?, descuento = ?, aplicarDto = ?  where id = ?";


        try (Connection connection = SQLManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQLActualizarProducto)){

            statement.setNString(1, descripcionP);
            statement.setInt(2, cantidadP);
            statement.setDouble(3, precioP);
            statement.setInt(4, descuentoP);
            statement.setBoolean(5, aplicarDtoP);

            statement.setInt(6, idP);

            response= statement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return response;
    }


    /**
     * Registra una nueva categoría o tipo de producto en la tabla secundaria.
     * * @param idT ID único para el nuevo tipo.
     * @param tipo Nombre descriptivo del tipo.
     * @return El número de filas insertadas en la tabla de tipos.
     * @throws RuntimeException Si ocurre un error al insertar el nuevo tipo.
     */
    public static int NuevoTipoProducto(int idT, String tipo) {
        int response = -1;

        String SQLNuevoTipoProducto = "insert into tipos(idTipo, tipo) values (?, ?)";


        try (Connection connection = SQLManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQLNuevoTipoProducto)){

            statement.setInt(1, idT);
            statement.setNString(2, tipo);

            response = statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return response;
    }





}
