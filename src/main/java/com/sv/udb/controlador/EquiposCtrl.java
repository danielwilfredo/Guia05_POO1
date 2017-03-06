/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Equipos;
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
public class EquiposCtrl {
   
    
    public boolean guar(Equipos obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("Insert into equipos values(NULL,?,?)");
        cmd.setString(1, obje.getNombEqui());
        cmd.setString(2, obje.getDescEqui());
        cmd.execute();
        resp = true;          
        } 
        catch (Exception e) 
        {
            System.err.println("Error al guardar equipos: " + e.getMessage());
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
    
     public boolean modi(Equipos obje)
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
     
     
     //DELETE
     
     
     public boolean elim (Equipos obje)
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
    
    
    
    //Consulta para sacar todos los tados de la tabla :v
    public List<Equipos> consTodo()
    {
        List<Equipos> resp = new ArrayList();
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("Select * from equipos");
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new Equipos(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)));
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
   
    
}
