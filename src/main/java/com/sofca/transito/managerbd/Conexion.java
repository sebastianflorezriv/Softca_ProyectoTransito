package com.sofca.transito.managerbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {



    private static Connection connection;

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    private boolean ocupada;

    private final String url = "jdbc:postgresql://localhost:5432/estudio";
    private final String user = "postgres";
    private final String password = "admin";

    // Método para obtener la conexión
    public void connect() {

        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            System.out.println("Conexión a PostgreSQL exitosa!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public void FreeConexion(){
        this.ocupada=false;
    }

    public void ocupar(){
        this.ocupada=true;
    }

}
