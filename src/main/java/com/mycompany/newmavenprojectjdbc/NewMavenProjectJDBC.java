/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.newmavenprojectjdbc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class NewMavenProjectJDBC {

    public static void main(String[] args) throws SQLException {

        ServicioBD servicio = new ServicioBD();
        
        servicio.crearTabla();
        //servicio.truncarTabla();
        
        //servicio.insert("papa", 3);
        //servicio.insert("cebolla", 10);
        
        servicio.mostrarTodos();
        
        //servicio.actualizarCantidad("papa", 5);
        
        servicio.mostrarTodos();
         
    }
}
