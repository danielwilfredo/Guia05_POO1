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
import java.util.ArrayList;
import java.util.List;

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
        //cmd.setInt(1, obje.getCodi_par());
        cmd.setInt(1, obje.getCodi_equi_a());
        cmd.setInt(2, obje.getCodi_equi_b());
        cmd.setInt(3, obje.getGol_equi_a());
        cmd.setInt(4, obje.getGol_equi_b());
        cmd.setString(5, obje.getFecha());
        cmd.setString(6, obje.getHora());
        cmd.setString(7, obje.getLugar());
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
    public boolean modi(Partidos obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            String consu = "update partidos set "
                    + "codi_equi_a="+obje.getCodi_equi_a()+","
                    + " codi_equi_b="+obje.getCodi_equi_b()+", "
                    + "gol_equi_a="+obje.getGol_equi_a()+", "
                    + "gol_equi_b="+obje.getGol_equi_b()+","
                    + " fecha='"+obje.getFecha()+"', "
                    + "hora='"+obje.getHora()+"', "
                    + "lugar='"+obje.getLugar()+"'\n" +
                     "where id_partido ="+obje.getCodi_par()+"";
            PreparedStatement cmd = cn.prepareStatement(consu);
           cmd.execute();
        resp = true;          
        } 
        catch (Exception e) 
        {
            System.err.println("Error al actualizar Partido: " + e.getMessage());
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
    
    //delete delete from partidos where id_partido = 15;
    
     public boolean elim (Partidos obje)
    {
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            String consu = "DELETE FROM partidos WHERE id_partido = " + obje.getCodi_par()+"";
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
     
      public List<Partidos> consTodo()
    {
        List<Partidos> resp = new ArrayList();
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("select id_partido, partidos.codi_equi_a, partidos.codi_equi_b, equipos.nomb_equi, gol_equi_a, gol_equi_b,fecha,hora,lugar from equipos,partidos where partidos.codi_equi_b = equipos.codi_equi");
            ResultSet rs = cmd.executeQuery();
            PreparedStatement cmd2 = cn.prepareStatement("select nomb_equi from partidos,equipos where partidos.codi_equi_a = equipos.codi_equi;");
            ResultSet rs2 = cmd2.executeQuery();

            while(rs.next() && rs2.next())
            {
                resp.add(new Partidos(rs.getInt(1),
                        rs.getInt(2),
                        rs2.getString(1),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
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
