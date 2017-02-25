/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author DanielWilfredo
 */
public class Equipos {
    private int codiEqui;
    private String nombEqui;
    private String descEqui;

    //Primer paso creamos un constructor vacio
    public Equipos() {
    }
    // constructor que reciba los 3 parametros atributos
    public Equipos(int codiEqui, String nombEqui, String descEqui) {
        this.codiEqui = codiEqui;
        this.nombEqui = nombEqui;
        this.descEqui = descEqui;
    }
    //Setter and getter para todos los atributos

    public int getCodiEqui() {
        return codiEqui;
    }

    public void setCodiEqui(int codiEqui) {
        this.codiEqui = codiEqui;
    }

    public String getNombEqui() {
        return nombEqui;
    }

    public void setNombEqui(String nombEqui) {
        this.nombEqui = nombEqui;
    }

    public String getDescEqui() {
        return descEqui;
    }

    public void setDescEqui(String descEqui) {
        this.descEqui = descEqui;
    }
    
    //agregar to string solo nombre equipo y solo retorna el nombre

    @Override
    public String toString() {
        return this.nombEqui;
    }
    
    
}
