/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author root
 */
@Entity
@Table(name="USUARIO")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name="ID_USUARIO")
    private Integer id;
    
    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="ID_DIRECCION")
    private Direccion direccion;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="LOGIN")
    private String login;
    
    @Column(name="PASSWORD")
    private String password;

    public Usuario() {
    }

    public Usuario(Direccion direccion, String nombre, String login, String password) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", direccion=" + direccion + ", nombre=" + nombre + ", login=" + login + ", password=" + password + '}';
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
