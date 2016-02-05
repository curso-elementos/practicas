/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author root
 */
public class TestPersistencia {
    public static void main(String[] args) {
         try{
            
            
             
             Direccion direccion=new Direccion();
             direccion.setCalle("SUR 40");
             direccion.setColonia("San Agustin");
             direccion.setEstado("Mexico");
             direccion.setMunicipio("Ecatepec");
             direccion.setNumero(8);
             
             
            
             Usuario u=new Usuario();
             u.setNombre("Erika");
             u.setLogin("Peralta");
             u.setPassword("marsh");
             u.setDireccion(direccion);
             DAOUsuario dao=new DAOUsuario();
            dao.guardar(u); 
            
     
                    System.out.println("mensajito");
        }catch(Exception e){
              System.out.println("mensajito MALO:"+e.getMessage());
        }
    }
}
