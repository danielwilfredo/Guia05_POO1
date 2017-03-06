/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Equipos;
import com.sv.udb.modelo.Partidos;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DanielWilfredo
 */
public class PartidosCtrl {
    
    static Statement st;
    static ResultSet rs;
   
    public boolean guar(Partidos obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
        PreparedStatement cmd = cn.prepareStatement("insert into partidos values (null, ?, ?, ?, ?, ?, ?, ?)");
        cmd.setInt(1, obje.getCodi_par());
        cmd.setInt(2, obje.getCodi_equi_a());
        cmd.setInt(3, obje.getCodi_equi_b());
        cmd.setInt(4, obje.getGol_equi_a());
        cmd.setInt(5, obje.getGol_equi_b());
        cmd.setString(6, obje.getFecha());
        cmd.setString(7, obje.getHora());
        cmd.setString(8, obje.getLugar());
        cmd.execute();
        resp = true;          
        } 
        catch (Exception e) 
        {
            System.err.println("Error al guardar Partidos: " + e.getMessage());
        }
        finally
        {
            try {
                if(cn!=null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
                
            } catch (SQLException err) 
            {
                err.printStackTrace();
            }
        }
        return resp;
    }
    public Equipos concmb(int codiEqui)
    {
        Equipos resp = new Equipos();
        Connection cn = new Conexion().getConn();
        try {
           PreparedStatement cmd = cn.prepareStatement("Select * from equipos where codi_equi=?");
           cmd.setInt(1, codiEqui);
            ResultSet rs = cmd.executeQuery();  
            while(rs.next())
            {
            resp.setCodiEqui(rs.getInt(1));
            resp.setNombEqui(rs.getString(2));
            resp.setDescEqui(rs.getString(3));
            }
        } catch (Exception e) {
        }
          finally 
        {
            try {
                if(cn!=null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            } catch (SQLException e) 
            {
                e.printStackTrace();
            }
        }
        return resp;
    }

}
