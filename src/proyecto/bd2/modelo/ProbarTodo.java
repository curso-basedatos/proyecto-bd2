/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bd2.modelo;

/**
 *
 * @author campitos
 */
public class ProbarTodo {
    
    public static void main(String[] args) {
        
        //Vamos a probar nuesstro DAOAlmacen
        //Primero creamos el almacen que necesita 
        //guardar el DAO
        Almacen a=new Almacen(5, "Ecatepec");
        
        //Creamos el objeto DAOAlmacen
        DAOAlmacen dao=new DAOAlmacen();
        
        //Le enviamos el mensaje de que guarde el almcen
        try{
        dao.guardar(a); 
            System.out.println("Se guarda bien en el cliente");
        }catch(Exception e){
  System.out.println(" Hubo error "+e.getMessage()); 
        }
    }
    
}
