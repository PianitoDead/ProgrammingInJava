/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Brando Taipe
 */
public class Clientes {
    private int id_cliente;
    private String nombre_cliente;
    private String email_cliente;
    private String tel_cliente;
    private String dir_cliente;
    private String ultima_modificacion;

    public Clientes() {
    }

    public Clientes(int id_cliente, String nombre_cliente, String email_cliente, String tel_cliente, String dir_cliente, String ultima_modificacion) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.email_cliente = email_cliente;
        this.tel_cliente = tel_cliente;
        this.dir_cliente = dir_cliente;
        this.ultima_modificacion = ultima_modificacion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getTel_cliente() {
        return tel_cliente;
    }

    public void setTel_cliente(String tel_cliente) {
        this.tel_cliente = tel_cliente;
    }

    public String getDir_cliente() {
        return dir_cliente;
    }

    public void setDir_cliente(String dir_cliente) {
        this.dir_cliente = dir_cliente;
    }

    public String getUltima_modificacion() {
        return ultima_modificacion;
    }

    public void setUltima_modificacion(String ultima_modificacion) {
        this.ultima_modificacion = ultima_modificacion;
    }
}
