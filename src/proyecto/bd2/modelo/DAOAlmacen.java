/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bd2.modelo;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author campitos
 */
public class DAOAlmacen {
    
    
    //Primera Operacion
  public void guardar(Almacen almacen)throws Exception{
       Connection con=Conexion.conectarse();
        
        CallableStatement callate=con.prepareCall("{call guardar_almacen(?,?)}");
        callate.setInt(1, almacen.getNumeroAlmacen());
        callate.setString(2,almacen.getUbicacionAlmacen());

        callate.execute();
      //  int pk=callate.getInt(1);
        System.out.println("Se guarado el almacen");
        con.close();
       
  }
  public ArrayList<Almacen> obtenerTodos()throws Exception{
    Connection con=  Conexion.conectarse();
              ArrayList<Almacen> almacenes=new ArrayList<>();
   Statement st= con.createStatement();
 ResultSet res=st.executeQuery("SELECT * FROM ALMACEN");
 while(res.next()){
   Integer numeroAlmacen=  res.getInt(1);
   String nombreAlmacen=res.getString(2);
    Almacen almacen=new Almacen(numeroAlmacen, nombreAlmacen);
   almacenes.add(almacen);
   
     }
 con.close();
 return almacenes;
  }
    
    
}
