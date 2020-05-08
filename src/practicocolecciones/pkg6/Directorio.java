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
public class Directorio  {
   
    
   TreeMap<String,Cliente> direc = new TreeMap<>();
   List<String> listaTelefonos=new ArrayList<String>();
   List<Cliente> listaClientes=new ArrayList<Cliente>();
   
   
   
   public void agregarCliente(String telefono,Cliente cli)
   {
       direc.put(telefono, cli);
   }
   public void buscarCliente(String telefono)
   {
       direc.get(telefono);
   }
   
   public void buscarTelefono(String apellido){
       for(Map.Entry<String,Cliente> entrada: direc.entrySet())
       {
           String clave = entrada.getKey();
           Cliente valor = entrada.getValue();
           if(valor.getApellido()==apellido){
              listaTelefonos.add(clave);
           }
       }
       Iterator iter = listaTelefonos.iterator();
		while (iter.hasNext())
		  System.out.println(iter.next());
	
   }
   
   public void buscarClientes(String ciudad){
       {
       for(Map.Entry<String, Cliente> entrada: direc.entrySet()) { 
			String clave=entrada.getKey();
			Cliente valor=entrada.getValue();
			if(valor.getCiudad()==ciudad) {
				listaClientes.add(valor);
				}	
			
		}
		for(Cliente listc : listaClientes) {
            System.out.println(listc.getNombre());
        }
        
   }
   }
   public void borrarCliente(String telefono){
       direc.remove(telefono);
   }

 
    
}