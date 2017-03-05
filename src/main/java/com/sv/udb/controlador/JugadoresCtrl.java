/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;


import com.sv.udb.modelo.Equipos;
import com.sv.udb.modelo.Jugadores;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DanielWilfredo
 */
public class JugadoresCtrl {
     static Statement st;
    static ResultSet rs;
   
    public boolean guar(Jugadores obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
        PreparedStatement cmd = cn.prepareStatement("insert into jugadores values (null, ?, ?, ?, ?, ?)");
        cmd.setInt(1, obje.getCodiEqui());
        cmd.setString(2, obje.getNombJuga());
        cmd.setString(3, obje.getEdadJuga());
        cmd.setInt(4, obje.getAltuJuga());
        cmd.setString(5, obje.getPesoJuga());
        cmd.execute();
        resp = true;          
        } 
        catch (Exception e) 
        {
            System.err.println("Error al guardar Jugadores: " + e.getMessage());
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
    
    //UPDATEEEE 
    
     /*public boolean modi(Jugadores obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            String consu = "UPDATE equipos SET"
                    + " nomb_equi = '"+ obje.getNombEqui()+"',"
                    + " desc_equi = '"+ obje.getDescEqui()+"'"
                    + " WHERE codi_equi = '"+ obje.getCodiEqui()+"'";
            PreparedStatement cmd = cn.prepareStatement(consu);
           cmd.execute();
        resp = true;          
        } 
        catch (Exception e) 
        {
            System.err.println("Error al actualizar equipos: " + e.getMessage());
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
     */
     
     //DELETE
     
     
     public boolean elim (Jugadores obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            String consu = "DELETE FROM equipos WHERE codi_equi = " + obje.getCodiEqui() +"";
            PreparedStatement cmd = cn.prepareStatement(consu);
            cmd.execute();
        resp = true;          
        } 
        catch (Exception e) 
        {
            System.err.println("Error al Eliminar equipos: " + e.getMessage());
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
    
    
    
    //Consulta para sacar todos los tados de la tabla jugadores
    public List<Jugadores> consTodo()
    {
        List<Jugadores> resp = new ArrayList();
        Connection cn = new Conexion().getConn();
        try {
            /*PreparedStatement cmd = cn.prepareStatement("select codi_juga, nomb_equi, "
             + "nomb_juga, edad_juga, altu_juga, peso_juga\n" +
             "from jugadores, equipos where jugadores.codi_equi = equipos.codi_equi;");*/
            PreparedStatement cmd = cn.prepareStatement("select * from jugadores"); 
            ResultSet rs = cmd.executeQuery();
            
            while(rs.next())
            {
                resp.add(new Jugadores(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6)));
            }
        } catch (Exception e) 
        {
            e.printStackTrace();
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
   
    
   /* //Codigo para llenar el combo intento de llenar combo
     public  ArrayList<String> LlenarCombo()
            {
                Connection cn = new Conexion().getConn();
               ArrayList<String> Equi = new ArrayList<String>();
              
               
                try 
                { 
                    String Eq = "select * from equipos";
               PreparedStatement cmd = cn.prepareStatement(Eq);
                    //rs variable resultset y st variable statement
                    rs = cmd.executeQuery();
                    
                    
                } catch (Exception e) {
                }
                try {
                    while(rs.next())
                    {
                        Equi.add(rs.getString("nomb_equi"));
                    }
                } catch (Exception e) {
                }
               return Equi;
               
                             
            }*/
     }
