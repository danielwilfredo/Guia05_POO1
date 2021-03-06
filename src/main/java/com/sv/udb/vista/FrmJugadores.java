/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.EquiposCtrl;
import com.sv.udb.controlador.JugadoresCtrl;
import com.sv.udb.modelo.Equipos;
import com.sv.udb.modelo.Jugadores;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DanielWilfredo
 */
public class FrmJugadores extends javax.swing.JFrame {

    /**
     * Creates new form FrmJugadores
     */
    public FrmJugadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        cmbEqui.removeAllItems();
        this.txtCodJuga.enable(false);
        llenarComboBox();
        
        }
   
    private void llenarComboBox()
    {
        DefaultComboBoxModel<Equipos> modeEqui = new DefaultComboBoxModel<>();
        for(Equipos temp : new EquiposCtrl().consTodo())
        {
            modeEqui.addElement(temp);
        }
        this.cmbEqui.setModel((ComboBoxModel)modeEqui);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodJuga = new javax.swing.JTextField();
        txtNombJuga = new javax.swing.JTextField();
        txtEdadJuga = new javax.swing.JTextField();
        txtAltuJuga = new javax.swing.JTextField();
        txtPesoJuga = new javax.swing.JTextField();
        cmbEqui = new javax.swing.JComboBox<>();
        btnguardar = new javax.swing.JButton();
        btnmodi = new javax.swing.JButton();
        btnconsu = new javax.swing.JButton();
        btnelim = new javax.swing.JButton();
        btnlimp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbljugadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jugadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Codigo Jugador:");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Jugador:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("Edad Jugador:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("Altura Jugador:");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("Peso Jugador");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setText("Equipo:");

        txtCodJuga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodJuga.setText("1");

        txtNombJuga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtEdadJuga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtAltuJuga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtPesoJuga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cmbEqui.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbEqui.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnguardar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodi.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnmodi.setText("Modificar");
        btnmodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodiActionPerformed(evt);
            }
        });

        btnconsu.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnconsu.setText("Consultar");
        btnconsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsuActionPerformed(evt);
            }
        });

        btnelim.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnelim.setText("Eliminar");
        btnelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimActionPerformed(evt);
            }
        });

        btnlimp.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnlimp.setText("Limpiar");

        tbljugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null"
            }
        ));
        tbljugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbljugadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbljugadores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtAltuJuga))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodJuga)
                                    .addComponent(txtEdadJuga)
                                    .addComponent(txtNombJuga))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesoJuga)
                            .addComponent(cmbEqui, 0, 140, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconsu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnelim, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlimp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtCodJuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesoJuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtNombJuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdadJuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAltuJuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnelim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnlimp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnconsu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
 try {
             if(txtCodJuga.getText().isEmpty())
         {
             throw new Exception("Seleccione un registro");
         }
         if (txtNombJuga.getText().isEmpty())
         {
              throw new Exception("Ingrese un Nombre");
         }
         if(txtAltuJuga.getText().isEmpty())
         {
              throw new Exception("Ingrese una descripcion");
         }   
           if(txtPesoJuga.getText().isEmpty())
         {
              throw new Exception("Ingrese una descripcion");
         }   
             Equipos objeEqui = (Equipos)this.cmbEqui.getSelectedItem();  
            Jugadores obje = new Jugadores();
            obje.setCodiJuga(Integer.parseInt(this.txtCodJuga.getText()));
            obje.setCodiEqui(objeEqui.getCodiEqui());
            obje.setNombJuga(this.txtNombJuga.getText());
            obje.setEdadJuga(this.txtEdadJuga.getText());
            obje.setAltuJuga(Integer.parseInt(this.txtAltuJuga.getText()));
            obje.setPesoJuga(this.txtPesoJuga.getText());
            if(new JugadoresCtrl().guar(obje))
            {
                JOptionPane.showMessageDialog(this, "Datos guardados");
                this.txtAltuJuga.setText("");
                this.txtCodJuga.setText("1");
                this.txtEdadJuga.setText("");
                this.txtPesoJuga.setText("");
                this.txtNombJuga.setText("");
                
            }
            else JOptionPane.showMessageDialog(this, "Error al guardar los datos");
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnconsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsuActionPerformed
        try {
          DefaultTableModel model = (DefaultTableModel)this.tbljugadores.getModel();
          while(model.getRowCount()>0)
          {
              model.removeRow(0);
          }
          for(Jugadores temp : new JugadoresCtrl().consTodo())
          {
            model.addRow(new Object[] 
            {
                temp.getCodiJuga(), 
                temp, 
                temp.getNombJuga(),
                temp.getEdadJuga(), 
                temp.getAltuJuga(),
                temp.getPesoJuga()
            } 
                    
            );
            
          }
        } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnconsuActionPerformed

    private void tbljugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbljugadoresMouseClicked
       int fila = this.tbljugadores.getSelectedRow();
      if (fila>=0)
      {
          System.err.println("LLEGO AQUI");
          Jugadores obje = (Jugadores)this.tbljugadores.getValueAt(fila,1);
          this.txtCodJuga.setText(String.valueOf(obje.getCodiJuga()));
          this.cmbEqui.setEditable(true); 
          this.cmbEqui.setSelectedItem((Equipos)new EquiposCtrl().concmb(obje.getCodiEqui()));
          System.err.println((Equipos)new EquiposCtrl().concmb(obje.getCodiEqui()));
          this.cmbEqui.setEditable(false);
          this.txtNombJuga.setText(obje.getNombJuga());
          this.txtEdadJuga.setText(obje.getEdadJuga());
          this.txtAltuJuga.setText(String.valueOf(obje.getAltuJuga()));
          this.txtPesoJuga.setText(obje.getPesoJuga());
      }
    }//GEN-LAST:event_tbljugadoresMouseClicked

    private void btnmodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodiActionPerformed
       try {
         if(txtCodJuga.getText().isEmpty())
         {
             throw new Exception("Seleccione un registro");
         }
         if (txtNombJuga.getText().isEmpty())
         {
              throw new Exception("Ingrese un Nombre");
         }
         if(txtEdadJuga.getText().isEmpty())
         {
              throw new Exception("Ingrese una edad");
         }         
            Jugadores obje = new Jugadores();
             Equipos objeEqui = (Equipos)this.cmbEqui.getSelectedItem();
            obje.setCodiJuga(Integer.parseInt(this.txtCodJuga.getText()));
            obje.setCodiEqui(objeEqui.getCodiEqui());
            obje.setNombJuga(this.txtNombJuga.getText());
            obje.setEdadJuga(this.txtEdadJuga.getText());
            obje.setAltuJuga(Integer.parseInt(this.txtAltuJuga.getText()));
            obje.setPesoJuga(this.txtPesoJuga.getText());
            if(new JugadoresCtrl().modi(obje))
            {
                JOptionPane.showMessageDialog(this, "Datos Modificados");
             //   this.txtDesc.setText("");
               // this.txtNomb.setText("");
               // this.txtCodi.setText("1");
            }
            else JOptionPane.showMessageDialog(this, "Error al Actualizar los datos");
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnmodiActionPerformed

    private void btnelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimActionPerformed
        try {
             if(txtCodJuga.getText().isEmpty())
         {
             throw new Exception("Seleccione un registro");
         }
            Jugadores obje = new Jugadores();
            obje.setCodiJuga(Integer.parseInt(this.txtCodJuga.getText()));
            if(new JugadoresCtrl().elim(obje))
            {
                JOptionPane.showMessageDialog(this, "Datos Eliminados");
              //  this.txtDesc.setText("");
                //this.txtNomb.setText("");
                //this.txtCodi.setText("1");
            }
            else JOptionPane.showMessageDialog(this, "Error al Eliminar los datos");
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnelimActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsu;
    private javax.swing.JButton btnelim;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimp;
    private javax.swing.JButton btnmodi;
    private javax.swing.JComboBox<String> cmbEqui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbljugadores;
    private javax.swing.JTextField txtAltuJuga;
    private javax.swing.JTextField txtCodJuga;
    private javax.swing.JTextField txtEdadJuga;
    private javax.swing.JTextField txtNombJuga;
    private javax.swing.JTextField txtPesoJuga;
    // End of variables declaration//GEN-END:variables
}
