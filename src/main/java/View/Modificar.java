
package View;

import Controller.Controladora;
import Model.Paciente;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Modificar extends javax.swing.JPanel {
    //crea una instancia de la controladora para ABM de la DB

    Controladora control;
    TableRowSorter<DefaultTableModel> sorter;

    public Modificar() {
        initComponents();
    }

    // este metodo modifica la tabla con los valores de turnos de pacientes.
    private void setTableSort() {
        control = new Controladora();
        DefaultTableModel dtTable = new DefaultTableModel();
        String[] title = new String[]{"ID:", "Nombre:", "DNI", "Telefono:", "Obra social:", "Dia del turno", "Horario"};
        List<Paciente> listaPaciente = control.traerPacientes();
        int i = 0;
        Object personaa[][] = new Object[listaPaciente.size()][7];
        SimpleDateFormat formatoDia = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        Date fechahoy = new Date();

        for (Paciente a : listaPaciente) {
            if (fechahoy.compareTo(a.getTurno()) <= 0 ) {
                personaa[i][0] = a.getId();
                personaa[i][1] = a.getNombre();
                personaa[i][2] = a.getDNI();
                personaa[i][3] = a.getNumeroCelular();
                personaa[i][4] = a.getObraSocial();
                personaa[i][5] = formatoDia.format(a.getTurno());
                personaa[i][6] = formatoHora.format(a.getHora());
                i++;
            }

        }
        dtTable.setDataVector(personaa, title);
        tablaDeUsuarios.setModel(dtTable);
        tablaDeUsuarios.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(dtTable);
        tablaDeUsuarios.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modificar = new javax.swing.JPanel();
        tableroDeModificaicon = new javax.swing.JPanel();
        txtFilter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeUsuarios = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        dateText1 = new javax.swing.JLabel();
        fechaAModificar = new com.toedter.calendar.JDateChooser();
        btnAllTurnos = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1003, 604));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Modificar.setMinimumSize(new java.awt.Dimension(797, 521));

        tableroDeModificaicon.setOpaque(false);

        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilterKeyReleased(evt);
            }
        });

        tablaDeUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tablaDeUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID:","Nombre:", "DNI:", "Telefono:", "Obra Social:", "Dia del turno","Horario"
            }
        ));
        tablaDeUsuarios.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaDeUsuariosInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDeUsuarios);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Busqueda.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        dateText1.setBackground(new java.awt.Color(255, 255, 255));
        dateText1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateText1.setText("Filtro:");
        dateText1.setFocusable(false);

        fechaAModificar.setDateFormatString("dd-MMM-yyyy");

        btnAllTurnos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllTurnos.setText("TODOS");
        btnAllTurnos.setMaximumSize(new java.awt.Dimension(78, 38));
        btnAllTurnos.setMinimumSize(new java.awt.Dimension(78, 38));
        btnAllTurnos.setPreferredSize(new java.awt.Dimension(78, 38));
        btnAllTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllTurnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tableroDeModificaiconLayout = new javax.swing.GroupLayout(tableroDeModificaicon);
        tableroDeModificaicon.setLayout(tableroDeModificaiconLayout);
        tableroDeModificaiconLayout.setHorizontalGroup(
            tableroDeModificaiconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableroDeModificaiconLayout.createSequentialGroup()
                .addGroup(tableroDeModificaiconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tableroDeModificaiconLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(fechaAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAllTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(dateText1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tableroDeModificaiconLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        tableroDeModificaiconLayout.setVerticalGroup(
            tableroDeModificaiconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableroDeModificaiconLayout.createSequentialGroup()
                .addGroup(tableroDeModificaiconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableroDeModificaiconLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tableroDeModificaiconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateText1)))
                    .addGroup(tableroDeModificaiconLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tableroDeModificaiconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAllTurnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar);
        Modificar.setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModificarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tableroDeModificaicon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ModificarLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(tableroDeModificaicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );

        add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 765, -1));

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 103, 38));

        btnDelet.setText("Eliminar");
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });
        add(btnDelet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 103, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void tablaDeUsuariosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaDeUsuariosInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaDeUsuariosInputMethodTextChanged

    private void txtFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyReleased

        filtrarTexto();
    }//GEN-LAST:event_txtFilterKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (fechaAModificar.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccione la fecha");
        } else {

            setTableSort();
        }
        filtrarFecha();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAllTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllTurnosActionPerformed
        setTableSort();
    }//GEN-LAST:event_btnAllTurnosActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        for (int i : tablaDeUsuarios.getSelectedRows()) {
            if (tablaDeUsuarios.getSelectedRow() > -1) {
                int userId = (int) tablaDeUsuarios.getValueAt(i, 0);
                Paciente paci = control.findTurno(userId);

                try {
                    GestionDeTurnos.setJpanel(new Alta(paci));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una columna");
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablaDeUsuarios.getModel();

        for (int i : tablaDeUsuarios.getSelectedRows()) {
            try {
                int userId = (int) tablaDeUsuarios.getValueAt(i, 0);
                control.eliminarTurno(userId);
                model.removeRow(i);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }//GEN-LAST:event_btnDeletActionPerformed
    //metodo que filtra el texto de cualquier columna de la tabla
    private void filtrarTexto() {
        try {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtFilter.getText()));

        } catch (Exception e) {

        }
    }

    //metodo que filtra los turnos por fecha
    private void filtrarFecha() {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            String filtro = formato.format(fechaAModificar.getDate());
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filtro));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Modificar;
    private javax.swing.JButton btnAllTurnos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel dateText1;
    private com.toedter.calendar.JDateChooser fechaAModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDeUsuarios;
    private javax.swing.JPanel tableroDeModificaicon;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
