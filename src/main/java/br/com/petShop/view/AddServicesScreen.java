package br.com.petShop.view;

import br.com.petShop.dao.ServicesDAO;
import br.com.petShop.model.Services;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;


public class AddServicesScreen extends javax.swing.JFrame {

    public void listTable() {

        ServicesDAO dao = new ServicesDAO();
        List<Services> list = dao.listServices();

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setNumRows(0);

        for (Services obj : list) {
            model.addRow(new Object[]{
                    obj.getId(),
                    obj.getService_name(),
                    obj.getService_description(),
                    obj.getPrice_large(),
                    obj.getPrice_medium(),
                    obj.getPrice_small()
            });
        }

    }


    public AddServicesScreen() {
        initComponents();

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/images/icones/icone_pethub.png")));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        serviceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        priceTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addBnt = new javax.swing.JButton();
        editBnt = new javax.swing.JButton();
        deleteBnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PetHUB | Cadastro de Serviços");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(28, 74, 137));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Serviços");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/logo_icone.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel24))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel1)))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 74, 137));
        jLabel2.setText("Código:");

        idField.setEditable(false);
        idField.setForeground(new java.awt.Color(28, 74, 137));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 74, 137));
        jLabel4.setText("Serviço:");

        serviceField.setForeground(new java.awt.Color(28, 74, 137));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 74, 137));
        jLabel5.setText("Descrição:");

        descriptionField.setForeground(new java.awt.Color(28, 74, 137));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preço Por Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(28, 74, 137))); // NOI18N

        priceTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Grande Porte", null},
                        {"Médio Porte", null},
                        {"Pequeno Porte", null}
                },
                new String[]{
                        "Categoria", "Preço (R$)"
                }
        ));
        jScrollPane2.setViewportView(priceTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(serviceField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(serviceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Serviço", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(28, 74, 137));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 74, 137));
        jLabel3.setText("Nome:");

        searchField.setForeground(new java.awt.Color(28, 74, 137));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Código", "Serviço", "Descrição", "Grande Porte", "Medio Porte", "Pequeno Porte"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Serviços", jPanel3);

        addBnt.setForeground(new java.awt.Color(28, 74, 137));
        addBnt.setText("NOVO");
        addBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBntActionPerformed(evt);
            }
        });

        editBnt.setForeground(new java.awt.Color(28, 74, 137));
        editBnt.setText("EDITAR");
        editBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBntActionPerformed(evt);
            }
        });

        deleteBnt.setForeground(new java.awt.Color(28, 74, 137));
        deleteBnt.setText("EXCLUIR");
        deleteBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(addBnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBnt)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{addBnt, deleteBnt, editBnt});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editBnt)
                                        .addComponent(deleteBnt)
                                        .addComponent(addBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{addBnt, deleteBnt, editBnt});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed


    }//GEN-LAST:event_searchFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed

    }//GEN-LAST:event_idFieldActionPerformed

    private void addBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBntActionPerformed


        if (serviceField.getText().trim().isEmpty()
                || descriptionField.getText().trim().isEmpty()
                || priceTable.getValueAt(0, 1) == null
                || priceTable.getValueAt(1, 1) == null
                || priceTable.getValueAt(2, 1) == null) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar um serviço.");
        } else {
            try {

                Services obj = new Services();

                obj.setService_name(serviceField.getText());
                obj.setService_description(descriptionField.getText());
                obj.setPrice_large(Double.parseDouble(priceTable.getValueAt(0, 1).toString().replace(',', '.')));
                obj.setPrice_medium(Double.parseDouble(priceTable.getValueAt(1, 1).toString().replace(',', '.')));
                obj.setPrice_small(Double.parseDouble(priceTable.getValueAt(2, 1).toString().replace(',', '.')));

                ServicesDAO dao = new ServicesDAO();
                dao.addServices(obj);

                serviceField.setText(null);
                descriptionField.setText(null);
                priceTable.setValueAt(null, 0, 1);
                priceTable.setValueAt(null, 1, 1);
                priceTable.setValueAt(null, 2, 1);

            } catch (Exception e) {
            }
        }


    }//GEN-LAST:event_addBntActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


        listTable();

    }//GEN-LAST:event_formWindowActivated

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked


        jTabbedPane1.setSelectedIndex(0);
        idField.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        serviceField.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        descriptionField.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        priceTable.setValueAt(table.getValueAt(table.getSelectedRow(), 3), 0, 1);
        priceTable.setValueAt(table.getValueAt(table.getSelectedRow(), 4), 1, 1);
        priceTable.setValueAt(table.getValueAt(table.getSelectedRow(), 5), 2, 1);


    }//GEN-LAST:event_tableMouseClicked

    private void editBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBntActionPerformed


        if (serviceField.getText().trim().isEmpty()
                || descriptionField.getText().trim().isEmpty()
                || priceTable.getValueAt(0, 1) == null
                || priceTable.getValueAt(1, 1) == null
                || priceTable.getValueAt(2, 1) == null) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de editar um serviço.");
        } else {
            try {

                Services obj = new Services();

                obj.setId(Integer.parseInt(idField.getText()));

                obj.setService_name(serviceField.getText());
                obj.setService_description(descriptionField.getText());
                obj.setPrice_large(Double.parseDouble(priceTable.getValueAt(0, 1).toString().replace(',', '.')));
                obj.setPrice_medium(Double.parseDouble(priceTable.getValueAt(1, 1).toString().replace(',', '.')));
                obj.setPrice_small(Double.parseDouble(priceTable.getValueAt(2, 1).toString().replace(',', '.')));

                ServicesDAO dao = new ServicesDAO();
                dao.editServices(obj);

                serviceField.setText(null);
                descriptionField.setText(null);
                priceTable.setValueAt(null, 0, 1);
                priceTable.setValueAt(null, 1, 1);
                priceTable.setValueAt(null, 2, 1);

            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_editBntActionPerformed

    private void deleteBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBntActionPerformed


        try {
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o serviço? A exclusão apagará todos agendamentos relacionados a esse serviço!", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (op == JOptionPane.YES_OPTION) {
                Services obj = new Services();
                obj.setId(Integer.parseInt(idField.getText()));

                ServicesDAO dao = new ServicesDAO();
                dao.deleteServices(obj);

                serviceField.setText(null);
                descriptionField.setText(null);
                priceTable.setValueAt(null, 0, 1);
                priceTable.setValueAt(null, 1, 1);
                priceTable.setValueAt(null, 2, 1);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_deleteBntActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed

        String name = "%" + searchField.getText() + "%";

        ServicesDAO dao = new ServicesDAO();
        List<Services> listServices = dao.searchServicesByName(name);
        DefaultTableModel data = (DefaultTableModel) table.getModel();
        data.setNumRows(0);

        for (Services s : listServices) {
            data.addRow(new Object[]{
                    s.getId(),
                    s.getService_name(),
                    s.getService_description(),
                    s.getPrice_large(),
                    s.getPrice_medium(),
                    s.getPrice_small(),});
        }

    }//GEN-LAST:event_searchFieldKeyPressed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddServicesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddServicesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddServicesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddServicesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AddServicesScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBnt;
    private javax.swing.JButton deleteBnt;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JButton editBnt;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable priceTable;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField serviceField;
    private javax.swing.JTable table;
}

