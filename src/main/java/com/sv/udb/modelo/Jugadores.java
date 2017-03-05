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
public class Jugadores {
    private int CodiJuga ;
    private int CodiEqui;
    private String NombJuga;
    private String EdadJuga;
    private int AltuJuga;
    private String PesoJuga;
 
    
    public Jugadores()
    {
    }

    public Jugadores(int CodiJuga, int CodiEqui, String NombJuga, String EdadJuga, int AltuJuga, String PesoJuga) {
        this.CodiJuga = CodiJuga;
        this.CodiEqui = CodiEqui;
        this.NombJuga = NombJuga;
        this.EdadJuga = EdadJuga;
        this.AltuJuga = AltuJuga;
        this.PesoJuga = PesoJuga;
    }
        

    public int getCodiJuga() {
        return CodiJuga;
    }

    public void setCodiJuga(int CodiJuga) {
        this.CodiJuga = CodiJuga;
    }

    public int getCodiEqui() {
        return CodiEqui;
    }

    public void setCodiEqui(int CodiEqui) {
        this.CodiEqui = CodiEqui;
    }

    public String getNombJuga() {
        return NombJuga;
    }

    public void setNombJuga(String NombJuga) {
        this.NombJuga = NombJuga;
    }

    public String getEdadJuga() {
        return EdadJuga;
    }

    public void setEdadJuga(String EdadJuga) {
        this.EdadJuga = EdadJuga;
    }

    public int getAltuJuga() {
        return AltuJuga;
    }

    public void setAltuJuga(int AltuJuga) {
        this.AltuJuga = AltuJuga;
    }

    public String getPesoJuga() {
        return PesoJuga;
    }

    public void setPesoJuga(String PesoJuga) {
        this.PesoJuga = PesoJuga;
    }
  
    
}
