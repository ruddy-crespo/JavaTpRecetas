/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatprecetas;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Declaracion de la clase JavaTpRecetas.
 * @author Grupo 8
 */
public class JavaTpRecetas {

    /**
     * @throws IOException
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        // TODO code application logic here
        
            ///TODOS ESTOS VALORES DEBEN LLENARSE CON EL OTRO ARCHIVO
           
            String obtenerPathRecetas = "";
            String ObtenerPathIngredientes = "";
            OrganizadorRecetas nuevaOrganizador = new OrganizadorRecetas();
            nuevaOrganizador.arracarOrganizadorRecetas(obtenerPathRecetas, ObtenerPathIngredientes);
            
            
    }
    
}

