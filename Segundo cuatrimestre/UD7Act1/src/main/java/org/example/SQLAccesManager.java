package org.example;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SQLAccesManager {




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



    //2 Despues pone un list
    public static producto getProductoId(String RefProducto) {

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
