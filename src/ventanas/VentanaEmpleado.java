/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import excepciones.Excepciones;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.objects.Global;
import metodos.*;

/**
 *
 * @author Usuario
 */
public class VentanaEmpleado extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form Interfaz
     */
    public VentanaEmpleado() {

        initComponents();
        this.setLocationRelativeTo(null);
        modelo = (DefaultTableModel) tablaEmpleados.getModel();
        Cargar.cargaEmpleado(modelo);
    }

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

        lblIcono = new javax.swing.JLabel();
        btnAltaEmpleado = new javax.swing.JButton();
        lblSueldoEmp = new javax.swing.JLabel();
        entEspecEmp = new javax.swing.JTextField();
        lblTelefonoEmp = new javax.swing.JLabel();
        entTelefonoEmp = new javax.swing.JTextField();
        lblApellidoEmp = new javax.swing.JLabel();
        lblNombreEmp = new javax.swing.JLabel();
        lblDniEmp = new javax.swing.JLabel();
        entDniEmp = new javax.swing.JTextField();
        entApellidoEmp = new javax.swing.JTextField();
        btnModifEmp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBajaCli = new javax.swing.JButton();
        entNombreEmp = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();
        lblSueldoEmp1 = new javax.swing.JLabel();
        entSueldoEmp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(930, 620));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnAltaEmpleado.setText("ALTA");
        btnAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 90, 30));

        lblSueldoEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSueldoEmp.setText("Especialidad:");
        getContentPane().add(lblSueldoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));
        getContentPane().add(entEspecEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 180, 30));

        lblTelefonoEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefonoEmp.setText("Telefono:");
        getContentPane().add(lblTelefonoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        entTelefonoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entTelefonoEmpActionPerformed(evt);
            }
        });
        getContentPane().add(entTelefonoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 180, 30));

        lblApellidoEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblApellidoEmp.setText("Apellido:");
        getContentPane().add(lblApellidoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lblNombreEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNombreEmp.setText("Nombre: ");
        getContentPane().add(lblNombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        lblDniEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDniEmp.setText("DNI:");
        getContentPane().add(lblDniEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
        getContentPane().add(entDniEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 180, 30));
        getContentPane().add(entApellidoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 180, 30));

        btnModifEmp.setText("MODIFICAR");
        btnModifEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifEmpActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 130, 30));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     MENU EMPLEADOS");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 220, 50));

        btnBajaCli.setText("BAJA");
        btnBajaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaCliActionPerformed(evt);
            }
        });
        getContentPane().add(btnBajaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 90, 30));
        getContentPane().add(entNombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 180, 30));

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

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 290, 50));

        lblSueldoEmp1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSueldoEmp1.setText("Sueldo:");
        getContentPane().add(lblSueldoEmp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));
        getContentPane().add(entSueldoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 180, 30));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "TELEFONO", "SUELDO", "ESPECIALIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 520, 470));

        jLabel2.setBackground(new java.awt.Color(0, 153, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colormorado.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 420, 400));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaEmpleadoActionPerformed

        float s;
        int t;
        String dni = entDniEmp.getText().toString();
        String nombre = entNombreEmp.getText().toString();
        String apellido = entApellidoEmp.getText().toString();
        String especialidad = entEspecEmp.getText().toString();
        String sueldo = entSueldoEmp.getText();
        String telefono = entTelefonoEmp.getText().toString();
        if (!sueldo.equalsIgnoreCase("")) {
            s = Float.parseFloat(sueldo);
        } else {
            s = 0;

        }
        if (!telefono.equalsIgnoreCase("")) {
            t = Integer.parseInt(telefono);
        } else {
            t = 0;
        }

        if ((dni.equalsIgnoreCase("") | (nombre.equalsIgnoreCase("") | (apellido.equalsIgnoreCase("") | (especialidad.equalsIgnoreCase("")) | (s == 0.0f)) | (t == 0)))) {

            lblmensaje.setText("No se han introducido todos los datos");
        } else {
            // try {
            // Validar.validarDNI(dni);
            Altas.altaEmpleado(dni, nombre, apellido, especialidad, s, t);
            lblmensaje.setText("Empleado añadido");
            entDniEmp.setText("");
            entNombreEmp.setText("");
            entApellidoEmp.setText("");
            entTelefonoEmp.setText("");
            entSueldoEmp.setText("");
            entEspecEmp.setText("");

            String[] fila = {dni, nombre, apellido, telefono, sueldo, especialidad};

            modelo.addRow(fila);

            //  } catch (Excepciones e) {
            //     lblmensaje.setText(e.getMessage());
            // }
        }


    }//GEN-LAST:event_btnAltaEmpleadoActionPerformed

    private void btnModifEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifEmpActionPerformed
        // TODO add your handling code here:

        float s;
        int t;
        String dni = entDniEmp.getText().toString();
        String nombre = entNombreEmp.getText().toString();
        String apellido = entApellidoEmp.getText().toString();
        String especialidad = entEspecEmp.getText().toString();
        String sueldo = entSueldoEmp.getText();
        String telefono = entTelefonoEmp.getText().toString();
        if (!sueldo.equalsIgnoreCase("")) {
            s = Float.parseFloat(sueldo);
        } else {
            s = 0;

        }
        if (!telefono.equalsIgnoreCase("")) {
            t = Integer.parseInt(telefono);
        } else {
            t = 0;
        }

        if ((dni.equalsIgnoreCase("") | (nombre.equalsIgnoreCase("") | (apellido.equalsIgnoreCase("") | (especialidad.equalsIgnoreCase("")) | (s == 0.0f)) | (t == 0)))) {

            lblmensaje.setText("No se han introducido todos los datos");
        } else {
            Modificar.modificarEmpleado(dni, nombre, apellido, especialidad, s, t);
            int fila = modelo.getRowCount();
            for (int i = 0; i < fila; i++) {
                modelo.removeRow(0);

            }
            Cargar.cargaEmpleado(modelo);
             lblmensaje.setText("Se ha modificado el empleado");
        }

    }//GEN-LAST:event_btnModifEmpActionPerformed

    private void btnBajaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaCliActionPerformed
        String dni = entDniEmp.getText();

        Bajas.bajaEmpleado(dni);
        int fila = modelo.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);

        }
        Cargar.cargaEmpleado(modelo);

        entDniEmp.setText("");
        entApellidoEmp.setText("");
        entNombreEmp.setText("");
        entTelefonoEmp.setText("");
        entSueldoEmp.setText("");
        entEspecEmp.setText("");
        lblmensaje.setText("Se ha eliminado el empleado con dni: " + dni);
    }//GEN-LAST:event_btnBajaCliActionPerformed

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        // TODO add your handling code here:
        int seleccion = tablaEmpleados.rowAtPoint(evt.getPoint());

        entDniEmp.setText(String.valueOf(tablaEmpleados.getValueAt(seleccion, 0)));
        entNombreEmp.setText(String.valueOf(tablaEmpleados.getValueAt(seleccion, 1)));
        entApellidoEmp.setText(String.valueOf(tablaEmpleados.getValueAt(seleccion, 2)));
        entTelefonoEmp.setText(String.valueOf(tablaEmpleados.getValueAt(seleccion, 3)));
        entSueldoEmp.setText(String.valueOf(tablaEmpleados.getValueAt(seleccion, 4)));
        entEspecEmp.setText(String.valueOf(tablaEmpleados.getValueAt(seleccion, 5)));

    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        vPrincipal ventana = new vPrincipal();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void entTelefonoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entTelefonoEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entTelefonoEmpActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleado().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaEmpleado;
    private javax.swing.JButton btnBajaCli;
    private javax.swing.JButton btnModifEmp;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField entApellidoEmp;
    private javax.swing.JTextField entDniEmp;
    private javax.swing.JTextField entEspecEmp;
    private javax.swing.JTextField entNombreEmp;
    private javax.swing.JTextField entSueldoEmp;
    private javax.swing.JTextField entTelefonoEmp;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoEmp;
    private javax.swing.JLabel lblDniEmp;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblNombreEmp;
    private javax.swing.JLabel lblSueldoEmp;
    private javax.swing.JLabel lblSueldoEmp1;
    private javax.swing.JLabel lblTelefonoEmp;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables

}
