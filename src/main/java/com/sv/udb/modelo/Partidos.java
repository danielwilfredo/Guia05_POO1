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
public class Partidos {
    
    private int codi_par;
    private int codi_equi_a;
    private int codi_equi_b;
    private int gol_equi_a;
    private int gol_equi_b;
    private String fecha;
    private String hora;
    private String lugar;
    private String na;
    private String nb;
    
    public Partidos()
    {}
    
    public Partidos(int codi_par, int codi_equi_a, String na, int codi_equi_b, String nb, int gol_equi_a, int gol_equi_b, String fecha, String hora, String lugar) {
        this.codi_par = codi_par;
        this.codi_equi_a = codi_equi_a;
        this.na = na;
        this.codi_equi_b = codi_equi_b;
        this.nb = nb;
        this.gol_equi_a = gol_equi_a;
        this.gol_equi_b = gol_equi_b;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public Partidos(int codi_par, int codi_equi_a, int codi_equi_b, int gol_equi_a, int gol_equi_b, String fecha, String hora, String lugar) {
        this.codi_par = codi_par;
        this.codi_equi_a = codi_equi_a;
        this.codi_equi_b = codi_equi_b;
        this.gol_equi_a = gol_equi_a;
        this.gol_equi_b = gol_equi_b;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }
     public Partidos(int codi_par, String na, String nb, int gol_equi_a, int gol_equi_b, String fecha, String hora, String lugar) {
        this.codi_par = codi_par;
        this.na = na;
        this.nb = nb;
        this.gol_equi_a = gol_equi_a;
        this.gol_equi_b = gol_equi_b;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }
    
    
    

    public int getCodi_par() {
        return codi_par;
    }

    public void setCodi_par(int codi_par) {
        this.codi_par = codi_par;
    }

    public int getCodi_equi_a() {
        return codi_equi_a;
    }

    public void setCodi_equi_a(int codi_equi_a) {
        this.codi_equi_a = codi_equi_a;
    }

    public int getCodi_equi_b() {
        return codi_equi_b;
    }

    public void setCodi_equi_b(int codi_equi_b) {
        this.codi_equi_b = codi_equi_b;
    }

    public int getGol_equi_a() {
        return gol_equi_a;
    }

    public void setGol_equi_a(int gol_equi_a) {
        this.gol_equi_a = gol_equi_a;
    }

    public int getGol_equi_b() {
        return gol_equi_b;
    }

    public void setGol_equi_b(int gol_equi_b) {
        this.gol_equi_b = gol_equi_b;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }
    
    
    
    
    
    
}
