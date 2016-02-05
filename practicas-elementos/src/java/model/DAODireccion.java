/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author root
 */
public class DAODireccion {
    
    SessionFactory fac;
    Session sesion;
    Transaction tranza;

    public DAODireccion() {
        fac = HibernateUtilidades.getSessionFactory();
        sesion = fac.openSession();
        tranza = sesion.beginTransaction();

    }

    public void cerrarTransaccion() {
        tranza.commit();
        
        sesion.close();
    }

    public void guardar(Direccion objeto) throws Exception {
        sesion.persist(objeto);
        
        cerrarTransaccion();
    }

    public void actualizar(Direccion objeto) throws Exception {
        sesion.update(objeto);
        cerrarTransaccion();
    }

    public void borrar(Direccion objeto) throws Exception {
        sesion.delete(objeto);
        cerrarTransaccion();
    }

    public Direccion buscarPorId(Integer id) throws Exception {
        Direccion objeto = (Direccion) sesion.createCriteria(Direccion.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTransaccion();
        return objeto;
    }

    public ArrayList<Direccion> buscarTodos() throws Exception {
       ArrayList<Direccion> objetos=     (ArrayList<Direccion>) sesion.createCriteria(Direccion.class).list();
       cerrarTransaccion();
       return objetos;
    }
}