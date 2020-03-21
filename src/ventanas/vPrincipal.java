/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metodos.ficheros;

/**
 *
 * @author Usuario
 */
public class vPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public vPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        lblIcono = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnEmpleados1 = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO VETERINARIO");
        setAutoRequestFocus(false);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(930, 620));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1040, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnImportar.setBackground(new java.awt.Color(0, 153, 102));
        btnImportar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnImportar.setForeground(new java.awt.Color(255, 255, 255));
        btnImportar.setText("IMPORTAR DATOS");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 330, 80));

        btnExportar.setBackground(new java.awt.Color(0, 153, 102));
        btnExportar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setText("EXPORTAR DATOS");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 330, 80));

        btnCitas.setBackground(new java.awt.Color(0, 153, 102));
        btnCitas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnCitas.setText("CITAS");
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 330, 80));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 153, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(new javax.swing.border.MatteBorder(null));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 580, 120, 40));

        btnEmpleados1.setBackground(new java.awt.Color(0, 153, 102));
        btnEmpleados1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEmpleados1.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados1.setText("ANIMALES");
        btnEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleados1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 330, 80));

        btnEmpleados.setBackground(new java.awt.Color(0, 153, 102));
        btnEmpleados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("EMPLEADOS");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 330, 80));

        btnClientes.setBackground(new java.awt.Color(0, 153, 102));
        btnClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 330, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:

        VentanaCliente cliente = new VentanaCliente();
        cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        VentanaEmpleado empleado = new VentanaEmpleado();
        empleado.setVisible(true);


    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleados1ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        VentanaAnimal animal = new VentanaAnimal();
        animal.setVisible(true);
    }//GEN-LAST:event_btnEmpleados1ActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        VentanaCitas citas = new VentanaCitas();
        citas.setVisible(true);
    }//GEN-LAST:event_btnCitasActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ficheros.importarEmpleado();
            ficheros.importarClientes();
            ficheros.importarAnimales();
            ficheros.importarCitas();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed

        // TODO add your handling code here:
        try {
            ficheros.exportarEmpleado();
            ficheros.exportarClientes();
            ficheros.exportarAnimales();
            ficheros.exportarCitas();
        } catch (IOException ex) {
            Logger.getLogger(vPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnExportarActionPerformed

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
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEmpleados1;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblIcono;
    // End of variables declaration//GEN-END:variables
}
