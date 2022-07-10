/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas.servicios;

/**
 *
 * @author VMLS
 */
public class ServicioRecetasFactory {
    
    public ServicioRecetas obtenerServicio(String tipo) throws Exception{
        switch (tipo) {
            case "TXT":
                return new ServicioRecetasTXT();
            case "SQL":
                return new ServicioRecetasSQL();
            default:
                throw new Exception("Servicio invàlido");
        }
    }
    
}
