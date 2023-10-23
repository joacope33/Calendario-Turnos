/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.calendario.login.IGU;

import com.mycompany.calendario.login.Logica.Controladora;
import com.mycompany.calendario.login.Logica.Paciente;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joaco
 */
public class Alta extends javax.swing.JPanel {
    Controladora control;
    GestionDeTurnos ventana;
    Boolean isEdition=false;
    Paciente pacienteEdicion = new Paciente();
    /**
     * Creates new form Alta
     */
    public Alta() {
        initComponents();
        control = new Controladora();
    }
    public Alta(Paciente paciente) {
        initComponents();
        modificarEnAlta(paciente);
        control = new Controladora();
        pacienteEdicion=paciente; 
    }  
    public void modificarEnAlta(Paciente paciente){
        isEdition=true;
        if (paciente!= null){
            System.out.println(paciente.toString());
        txtNombreYApellido.setText(paciente.getNombre());
        txtDni.setValue(paciente.getDNI());
        txtNCelular.setValue(paciente.getNumeroCelular());
        txtObraSocial.setText(paciente.getObraSocial());
        txtHora.setValue(paciente.getHora());
        txtTurno.setDate(paciente.getTurno());
        }
        btnAlta.setText("Modificar");
        btnLimpiar.setVisible(false);
        txtNombreYApellido.setEditable(false);
        txtDni.setEditable(false);
        txtNCelular.setEditable(false);
        txtObraSocial.setEditable(false);
        
 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        camposGestiTurn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreYApellido = new javax.swing.JTextField();
        txtObraSocial = new javax.swing.JTextField();
        txtTurno = new com.toedter.calendar.JDateChooser();
        btnAlta = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtNCelular = new javax.swing.JFormattedTextField();
        txtDni = new javax.swing.JFormattedTextField();
        txtHora = new javax.swing.JFormattedTextField();
        jSpinner1 = new javax.swing.JSpinner();

        setMinimumSize(new java.awt.Dimension(551, 483));

        camposGestiTurn.setBackground(new java.awt.Color(255, 255, 255));
        camposGestiTurn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        camposGestiTurn.setForeground(new java.awt.Color(102, 102, 102));
        camposGestiTurn.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        camposGestiTurn.setPreferredSize(new java.awt.Dimension(540, 487));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre y Apellido:");
        jLabel1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("DNI:");
        jLabel2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Obra social:");
        jLabel3.setToolTipText("Agregar ");
        jLabel3.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("N° Celular:");
        jLabel5.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de Turno:");
        jLabel4.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Hora de Turno:");
        jLabel6.setEnabled(false);

        btnAlta.setText("DAR ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtNCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNCelularActionPerformed(evt);
            }
        });

        txtDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        txtHora.setForeground(new java.awt.Color(0, 145, 149));
        txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("HH:mm"))));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setText("00:00");
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout camposGestiTurnLayout = new javax.swing.GroupLayout(camposGestiTurn);
        camposGestiTurn.setLayout(camposGestiTurnLayout);
        camposGestiTurnLayout.setHorizontalGroup(
            camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposGestiTurnLayout.createSequentialGroup()
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camposGestiTurnLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreYApellido)
                            .addComponent(txtObraSocial)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNCelular)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addGroup(camposGestiTurnLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(camposGestiTurnLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        camposGestiTurnLayout.setVerticalGroup(
            camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camposGestiTurnLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreYApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtObraSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(camposGestiTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );

        jSpinner1.setUI(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(497, 497, 497)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(camposGestiTurn, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(camposGestiTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        
        if (txtDni.getText().isEmpty()||txtDni.getValue()==null||txtNombreYApellido.getText().isEmpty()||txtNCelular.getValue()==null||txtObraSocial.getText().isEmpty()|| txtTurno.getDate()==null||txtHora.getValue()==null) {
            JOptionPane.showMessageDialog(null,"Complete Campos vacios","FALTAN CARGAR CAMPOS",JOptionPane.ERROR_MESSAGE);
        }else{
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            Paciente paci = isEdition ? pacienteEdicion: new Paciente();
            if(!isEdition){
            paci.setId(pacienteEdicion.getId());
            }else{
            paci.setId(control.numeroId() + 1);
            }
            paci.setDNI((long) txtDni.getValue());
            paci.setNombre(txtNombreYApellido.getText());
            paci.setNumeroCelular((long) txtNCelular.getValue());
            paci.setObraSocial(txtObraSocial.getText());
            Date turno = txtTurno.getDate();
            String turnito = formatoFecha.format(turno);
           Date date = Date.from(Instant.now());
           String fechaHoy = formatoFecha.format(date);
            int decision = turnito.compareTo(fechaHoy);
            if (decision >= 0) {

                try {
                    Date fecha  = formatoHora.parse(txtHora.getText());
                    Time hora = new Time(fecha.getTime());
                     paci.setHora((hora));
                     paci.setTurno((Date)formatoFecha.parse(turnito));
                     if(!isEdition){
                        control.crearTurno(paci);                    
                     } else{
                        control.editarTurno(paci);
                     }
                } catch (ParseException ex) {
                    Logger.getLogger(Alta.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null,"Fecha en el pasado seleccione otra","FECHA EN EL PASADO",JOptionPane.INFORMATION_MESSAGE);

            }
        }
         
        
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombreYApellido.setText("");
        txtDni.setText("");
        txtNCelular.setText("");
        txtObraSocial.setText("");
        txtHora.setValue(0);
        txtTurno.setDate(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCelularActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel camposGestiTurn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JFormattedTextField txtDni;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JFormattedTextField txtNCelular;
    private javax.swing.JTextField txtNombreYApellido;
    private javax.swing.JTextField txtObraSocial;
    private com.toedter.calendar.JDateChooser txtTurno;
    // End of variables declaration//GEN-END:variables
}
