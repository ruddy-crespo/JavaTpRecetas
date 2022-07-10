/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas.servicios;

/**
 *
 * @author VMLS
 */
public class ServicioRecetasTXT extends ServicioRecetas{

    @Override
    public String[] obtenerRecetas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
       }

    
    /*
        if((!pathIngredientes.getText().isEmpty()) && (!pathRecetas.getText().isEmpty())){
            OrganizadorRecetas cocina = new OrganizadorRecetas();
            try {
                this.jTextArea1.setText(cocina.arracarOrganizadorRecetas(this.pathRecetas.getText(),this.pathIngredientes.getText()));
            } catch (IOException ex) {
                Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Completar la ruta de los path");
        }*/

    @Override
    public String[] obtenerIngredientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
