/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocolecciones.pkg6;
import java.util.*;
/**
 *
 * @author Lorenzo
 */
public class PracticoColecciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Directorio d = new Directorio();
       
       Cliente c = new Cliente("Lorenzo","Muñoz","San Luis","Victor Tula 1570");
       Cliente c2 = new Cliente("Natalia","Pi","San Luis","Las Chacras 12");
       Cliente c3 = new Cliente("Diego","Funes","San Luis","Los Paraisos 1234");
       Cliente c7 = new Cliente("Cristiano","Ronaldo","San Luis","Portugal");
       
       d.agregarCliente("2664952528", c);
       d.agregarCliente("2664000000", c2);
       d.agregarCliente("266444444", c3);
       d.agregarCliente("2664102030", c7);
       
      
       d.buscarTelefono("Ronaldo");
       d.buscarClientes("San Luis");
     
       
       
    }
    
}
