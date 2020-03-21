/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import metodos.*;

/**
 *
 * @author Usuario
 */
public class VentanaCitas extends javax.swing.JFrame {
DefaultTableModel modelo;
    /**
     * Creates new form Interfaz
     */
    public VentanaCitas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Cargar.cargaComboDueño(ComboBox);
        modelo =  (DefaultTableModel) TablaCitas.getModel();
        Cargar.cargaTablaCitas(modelo);
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
        lblmensaje = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox<>();
        lblReiac = new javax.swing.JLabel();
        lblDniCli = new javax.swing.JLabel();
        ComboBoxMotivo = new javax.swing.JComboBox<>();
        lblMotivo = new javax.swing.JLabel();
        ComboBoxReiacAniaml = new javax.swing.JComboBox<>();
        lblfecha = new javax.swing.JLabel();
        entFecha = new javax.swing.JTextField();
        lblIdCita = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        entIdCita = new javax.swing.JLabel();
        btnModifCita = new javax.swing.JButton();
        btnBajaCita = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        entPrecio = new javax.swing.JLabel();
        btnAltaCita = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCitas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(930, 620));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblmensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 300, 50));

        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 150, 30));

        lblReiac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblReiac.setText("REIAC ANIMAL:");
        getContentPane().add(lblReiac, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, -1));

        lblDniCli.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDniCli.setText("DNI CLIENTE:");
        getContentPane().add(lblDniCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, -1));

        ComboBoxMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacuna", "Revision", "Tratamiento" }));
        ComboBoxMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMotivoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 150, 30));

        lblMotivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMotivo.setText("MOTIVO :");
        getContentPane().add(lblMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, -1));

        ComboBoxReiacAniaml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxReiacAniamlActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxReiacAniaml, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, 30));

        lblfecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblfecha.setText("FECHA :");
        getContentPane().add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 110, -1));
        getContentPane().add(entFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 150, 30));

        lblIdCita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblIdCita.setText("ID: ");
        getContentPane().add(lblIdCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 110, -1));

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrecio.setText("PRECIO :");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 110, -1));

        entIdCita.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        entIdCita.setText("ID: ");
        getContentPane().add(entIdCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 110, -1));

        btnModifCita.setText("MODIFICAR");
        btnModifCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifCitaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 130, 30));

        btnBajaCita.setText("BAJA");
        btnBajaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaCitaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBajaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 90, 30));

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

        entPrecio.setBackground(new java.awt.Color(255, 255, 255));
        entPrecio.setOpaque(true);
        getContentPane().add(entPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 150, 30));

        btnAltaCita.setText("ALTA");
        btnAltaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaCitaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 90, 30));

        TablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DUEÑO", "REIAC", "MOTIVO", "FECHA", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        TablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCitas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 570, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colormorado.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 410, 440));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
        String dni = (String) ComboBox.getSelectedItem();
        Cargar.cargaComboAnimalesDueño(ComboBoxReiacAniaml, dni);
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void ComboBoxMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMotivoActionPerformed

        String motivo = (String) ComboBoxMotivo.getSelectedItem();
        if (motivo.equalsIgnoreCase("vacuna")){
        entPrecio.setText("50");
        }else if (motivo.equalsIgnoreCase("revision")){
        entPrecio.setText("20");
        }else if (motivo.equalsIgnoreCase("tratamiento")){
        entPrecio.setText("30");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxMotivoActionPerformed

    private void btnAltaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaCitaActionPerformed
        // TODO add your handling code here:
        
        String dni = (String) ComboBox.getSelectedItem();
        String reiac = (String) ComboBoxReiacAniaml.getSelectedItem();
        String motivo = (String) ComboBoxMotivo.getSelectedItem();
        String fecha = (String) entFecha.getText();
        String precio = (String) entPrecio.getText();
        float p;
        if(!precio.equalsIgnoreCase("")){
            p = Float.parseFloat(precio);
        }else{
        p=0;
        }
        
        if ((dni.equalsIgnoreCase(""))|(reiac.equalsIgnoreCase(""))|(motivo.equalsIgnoreCase(""))|(fecha.equalsIgnoreCase(""))|(p==0)){
        lblmensaje.setText("Faltan datos por introducir");
        
        }else{
         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaDate = null;
            try {
                fechaDate = formato.parse(fecha);
            } catch (ParseException ex) {
                System.out.println(ex);
            }
            
            int id = Altas.altaCita(dni,reiac,motivo,fechaDate,p);
            
            entFecha.setText("");
            entPrecio.setText("");
            
            
            String[] fila = {String.valueOf(id), dni, reiac, motivo,fecha,String.valueOf(precio)};
            
            modelo.addRow(fila);
            
        }
        
        
    }//GEN-LAST:event_btnAltaCitaActionPerformed

    private void ComboBoxReiacAniamlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxReiacAniamlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxReiacAniamlActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        vPrincipal principal = new vPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModifCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifCitaActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(entIdCita.getText()) ;
         String dni = (String) ComboBox.getSelectedItem();
        String reiac = (String) ComboBoxReiacAniaml.getSelectedItem();
        String motivo = (String) ComboBoxMotivo.getSelectedItem();
        String fecha = (String) entFecha.getText();
        String precio = (String) entPrecio.getText();
        float p;
        if(!precio.equalsIgnoreCase("")){
            p = Float.parseFloat(precio);
        }else{
        p=0;
        }
        
        if ((dni.equalsIgnoreCase(""))|(reiac.equalsIgnoreCase(""))|(motivo.equalsIgnoreCase(""))|(fecha.equalsIgnoreCase(""))|(p==0)){
        lblmensaje.setText("Faltan datos por introducir");
        
        }else{
         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaDate = null;
            try {
                fechaDate = formato.parse(fecha);
            } catch (ParseException ex) {
                System.out.println(ex);
            }
            
            Modificar.modificarCita(id,dni,reiac,motivo,fechaDate,p);
             int fila = modelo.getRowCount();
        for (int i =0;i<fila ; i++){
            modelo.removeRow(0);

        }
        Cargar.cargaTablaCitas(modelo);
            lblmensaje.setText("Se ha modificado la cita");
        }
        
        
        
    }//GEN-LAST:event_btnModifCitaActionPerformed

    private void btnBajaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaCitaActionPerformed

        int id = Integer.parseInt(entIdCita.getText());

        Bajas.bajaCita(id);

        int fila = modelo.getRowCount();
        for (int i =0;i<fila ; i++){
            modelo.removeRow(0);

        }
        Cargar.cargaTablaCitas(modelo);

        entIdCita.setText("");
        entFecha.setText("");
        entPrecio.setText("");
        lblmensaje.setText("Se ha eliminado la cita");
      

    }//GEN-LAST:event_btnBajaCitaActionPerformed

    private void TablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCitasMouseClicked
        // TODO add your handling code here:
        
        int seleccion = TablaCitas.rowAtPoint(evt.getPoint());
        entIdCita.setText(String.valueOf(TablaCitas.getValueAt(seleccion, 0)));
        ComboBox.setSelectedItem(String.valueOf(TablaCitas.getValueAt(seleccion, 1)));
        ComboBoxReiacAniaml.setSelectedItem(String.valueOf(TablaCitas.getValueAt(seleccion, 2)));
        ComboBoxMotivo.setSelectedItem(String.valueOf(TablaCitas.getValueAt(seleccion, 3)));
        entFecha.setText(String.valueOf(TablaCitas.getValueAt(seleccion, 4)));
        entPrecio.setText(String.valueOf(TablaCitas.getValueAt(seleccion, 5)));
        
    }//GEN-LAST:event_TablaCitasMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JComboBox<String> ComboBoxMotivo;
    private javax.swing.JComboBox<String> ComboBoxReiacAniaml;
    private javax.swing.JTable TablaCitas;
    private javax.swing.JButton btnAltaCita;
    private javax.swing.JButton btnBajaCita;
    private javax.swing.JButton btnModifCita;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField entFecha;
    private javax.swing.JLabel entIdCita;
    private javax.swing.JLabel entPrecio;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDniCli;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblIdCita;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblReiac;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblmensaje;
    // End of variables declaration//GEN-END:variables
}
