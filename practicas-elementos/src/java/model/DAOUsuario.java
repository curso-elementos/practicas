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
public class DAOUsuario {

    SessionFactory fac;
    Session sesion;
    Transaction tranza;

    public DAOUsuario() {
        fac = HibernateUtilidades.getSessionFactory();
        sesion = fac.openSession();
        tranza = sesion.beginTransaction();

    }

    public void cerrarTransaccion() {
        tranza.commit();
        sesion.close();
    }

    public void guardar(Usuario objeto) throws Exception {
        sesion.persist(objeto);
        cerrarTransaccion();
    }

    public void actualizar(Usuario objeto) throws Exception {
        sesion.update(objeto);
        cerrarTransaccion();
    }

    public void borrar(Usuario objeto) throws Exception {
        sesion.delete(objeto);
        cerrarTransaccion();
    }

    public Usuario buscarPorId(Integer id) throws Exception {
        Usuario objeto = (Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTransaccion();
        return objeto;
    }

    public ArrayList<Usuario> buscarTodos() throws Exception {
       ArrayList<Usuario> objetos=     (ArrayList<Usuario>) sesion.createCriteria(Usuario.class).list();
       cerrarTransaccion();
       return objetos;
    }

}
