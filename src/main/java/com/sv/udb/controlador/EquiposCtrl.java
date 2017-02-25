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

/**
 *
 * @author DanielWilfredo
 */
public class EquiposCtrl {
    
    public boolean guar(Equipos obje)
    {
        //Equipos obje = new Equipos();
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("Insert into equipos values(NULL, ?, ?)");
         //   cmd.setString(1, obje.setNombEqui());
            
            
            
            
        } catch (Exception e) {
        }
        return resp;
    }
    
}
