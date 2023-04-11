package com.fp3.haras.view.screens.client;

import com.fp3.haras.utils.Colors;
import javax.swing.JOptionPane;

public class ClientScreen extends javax.swing.JPanel {

    public ClientScreen() {
        initComponents();
        
        this.setBackground(Colors.PRIMARYBG);
        jLabel1.putClientProperty("FlatLaf.styleClass", "h00");
    }
    
    private String getSelectedProgressCode() {
        if (tableProgress.getSelectedRow() != -1) {
            return String.valueOf(tableProgress.getModel().getValueAt(tableProgress.getSelectedRow(), 0));
        } else {
            return null;
        }
    }
    

    
    private Object getSelectedProgressValue() {
        return tableProgress.getModel().getValueAt(tableProgress.getSelectedRow(), tableProgress.getSelectedColumn());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tpaneInfo = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProgress = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 244, 244));
        setPreferredSize(new java.awt.Dimension(900, 585));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CLIENTES");

        jLabel2.setText("STATUS DE SERVIÇO");

        tpaneInfo.setBackground(new java.awt.Color(234, 234, 234));
        tpaneInfo.setForeground(new java.awt.Color(153, 153, 153));
        tpaneInfo.setOpaque(true);

        tableProgress.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "TELEFONE", "EMAIL", "DOCUMENTO", "ENDEREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProgress.getTableHeader().setResizingAllowed(false);
        tableProgress.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableProgress);

        tpaneInfo.addTab("", jScrollPane1);

        txtSearch.setText("Pesquisar...");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchMouseReleased(evt);
            }
        });

        btnCreate.setText("CRIAR");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEdit.setText("EDITAR");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        lblSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tpaneInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblSearch)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreate)
                        .addComponent(btnEdit))
                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tpaneInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseReleased
        if (txtSearch.getText().equals("Pesquisar..."))
            txtSearch.setText(null);
    }//GEN-LAST:event_txtSearchMouseReleased

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().equals(""))
            txtSearch.setText("Pesquisar...");
    }//GEN-LAST:event_txtSearchFocusLost

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        new ClientCreate().setVisible(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (tpaneInfo.getTitleAt(tpaneInfo.getSelectedIndex()).equals("") 
                    && getSelectedProgressCode() != null && getSelectedProgressValue() != null) {
                
                new ClientEdit().setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Nada foi selecionado.", null, JOptionPane.ERROR_MESSAGE, null);
            }
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tableProgress;
    private javax.swing.JTabbedPane tpaneInfo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
