/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newmavenprojectjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class ServicioBD {
    
    private Connection conexion;
    
    public ServicioBD() throws SQLException{
        //sqlite crea el nuevo archivo de la base si no existe
        this.conexion = DriverManager.getConnection("jdbc:sqlite:base_de_prueba.db");
    }
    
    public void crearTabla() throws SQLException {
        String createQuery = "CREATE TABLE IF NOT EXISTS recetas ("
                + "nombre varchar(255), "
                + "cantidad int"
                + ")";

        Statement st = this.conexion.createStatement();
        st.execute(createQuery);
    }
    
    public void truncarTabla() throws SQLException {
        String deleteQuery = "DELETE FROM recetas";

        Statement st = this.conexion.createStatement();
        st.execute(deleteQuery);
    }
    
    public void mostrarTodos() throws SQLException {
        String query = "SELECT nombre, cantidad FROM recetas";
        Statement st = this.conexion.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("ResultSet: ");
        
        while (rs.next()) {
            System.out.print(" -- Nombre: " + rs.getString("nombre") + " ");
            System.out.print(" -- Cantidad: " + rs.getInt("cantidad") + " ");
            System.out.println("");
        }
        
        System.out.println("Fin ResultSet");
    }
    
    public int insert(String nombre, int cantidad) throws SQLException {
        String insertSQL = "INSERT INTO recetas(nombre, cantidad)"
                        + " VALUES(?, ?)";
        
        PreparedStatement st = this.conexion.prepareStatement(insertSQL);

        st.setString(1, nombre);
        st.setInt(2, cantidad);
        
        return st.executeUpdate();
    }
    
    public int actualizarCantidad(String nombre, int cantidad) throws SQLException {
        String updateSQL = "UPDATE recetas SET cantidad = ?"
                + " WHERE nombre = ?";
        PreparedStatement st = this.conexion.prepareStatement(updateSQL);

        st.setInt(1, cantidad);
        st.setString(2, nombre);
        return st.executeUpdate();
    }
    
}
