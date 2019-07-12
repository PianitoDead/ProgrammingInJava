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
public class Equipos {
    private int id_equipo;
    private int id_cliente;
    private String tipo_equipo;
    private String marca;
    private String modelo;
    private String num_serie;
    private String mes_ingreso;
    private String annio_ingreso;
    private String observaciones;
    private String estatus;
    private String ultima_modificacion;
    private String comentarios_tecnicos;
    private String revision_tercnica_de;

    public Equipos() {
    }

    public Equipos(int id_equipo, int id_cliente, String tipo_equipo, String marca, String modelo, String num_serie, String mes_ingreso, String annio_ingreso, String observaciones, String estatus, String ultima_modificacion, String comentarios_tecnicos, String revision_tercnica_de) {
        this.id_equipo = id_equipo;
        this.id_cliente = id_cliente;
        this.tipo_equipo = tipo_equipo;
        this.marca = marca;
        this.modelo = modelo;
        this.num_serie = num_serie;
        this.mes_ingreso = mes_ingreso;
        this.annio_ingreso = annio_ingreso;
        this.observaciones = observaciones;
        this.estatus = estatus;
        this.ultima_modificacion = ultima_modificacion;
        this.comentarios_tecnicos = comentarios_tecnicos;
        this.revision_tercnica_de = revision_tercnica_de;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(String tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public String getMes_ingreso() {
        return mes_ingreso;
    }

    public void setMes_ingreso(String mes_ingreso) {
        this.mes_ingreso = mes_ingreso;
    }

    public String getAnnio_ingreso() {
        return annio_ingreso;
    }

    public void setAnnio_ingreso(String annio_ingreso) {
        this.annio_ingreso = annio_ingreso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getUltima_modificacion() {
        return ultima_modificacion;
    }

    public void setUltima_modificacion(String ultima_modificacion) {
        this.ultima_modificacion = ultima_modificacion;
    }

    public String getComentarios_tecnicos() {
        return comentarios_tecnicos;
    }

    public void setComentarios_tecnicos(String comentarios_tecnicos) {
        this.comentarios_tecnicos = comentarios_tecnicos;
    }

    public String getRevision_tercnica_de() {
        return revision_tercnica_de;
    }

    public void setRevision_tercnica_de(String revision_tercnica_de) {
        this.revision_tercnica_de = revision_tercnica_de;
    }
    
    
    
    
}
