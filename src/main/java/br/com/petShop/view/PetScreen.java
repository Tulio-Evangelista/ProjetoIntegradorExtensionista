package br.com.petShop.view;


import br.com.petShop.dao.CustomersDAO;
import br.com.petShop.dao.PetsDAO;
import br.com.petShop.model.Customers;
import br.com.petShop.model.Pets;
import br.com.petShop.utils.CleanFields;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class PetScreen extends javax.swing.JFrame {

    public void listTable() {

        PetsDAO dao = new PetsDAO();
        List<Pets> listPets = dao.listPets();
        DefaultTableModel data = (DefaultTableModel) table.getModel();
        data.setNumRows(0);

        for (Pets c : listPets) {
            data.addRow(new Object[]{
                    c.getId(),
                    c.getCustumers().getName(),
                    c.getPet_name(),
                    c.getGender(),
                    c.getBirth(),
                    c.getPet_weight(),
                    c.getSpecies(),
                    c.getBreed(),});
        }
    }


    public PetScreen() {
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
        jLabel18 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        pet_nameField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        birthField = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        searchClientField = new javax.swing.JTextField();
        breedField = new javax.swing.JTextField();
        CustomersField = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        speciesField = new javax.swing.JTextField();
        pet_weightField = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBnt = new javax.swing.JButton();
        deleteBnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Love Pet | Cadastro de Animal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Animal");

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
        jLabel2.setText("Código:");

        idField.setEditable(false);
        idField.setForeground(new java.awt.Color(28, 74, 137));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Cliente/Propríetario:");

        jButton6.setText("Buscar Cliente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Nome do Animal:");

        pet_nameField.setForeground(new java.awt.Color(28, 74, 137));
        pet_nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pet_nameFieldActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Sexo:");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MACHO", "FEMÊA" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Nascimento:");

        try {
            birthField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Peso Atual:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Raça:");

        CustomersField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CustomersFieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Especie:");

        try {
            pet_weightField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CustomersField, 0, 200, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel21)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel22)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(pet_weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel25)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(breedField))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel19)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(pet_nameField)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel20)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel23)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(speciesField)))))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18)
                                        .addComponent(jButton6)
                                        .addComponent(searchClientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(pet_nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20)
                                        .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel22)
                                        .addComponent(breedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23)
                                        .addComponent(speciesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pet_weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Animal", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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
                new Object [][] {

                },
                new String [] {
                        "Código", "Proprietário", "Nome do Animal", "Sexo", "Nascimento", "Peso", "Espécie", "Raça"
                }
        ));
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
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 158, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Animal", jPanel3);

        addBtn.setText("NOVO");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBnt.setText("EDITAR");
        editBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBntActionPerformed(evt);
            }
        });

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
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBnt)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBtn, deleteBnt, editBnt});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editBnt)
                                        .addComponent(deleteBnt)
                                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addBtn, deleteBnt, editBnt});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed

    }//GEN-LAST:event_idFieldActionPerformed

    private void pet_nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pet_nameFieldActionPerformed

    }//GEN-LAST:event_pet_nameFieldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed


        if (speciesField.getText().trim().isEmpty()
                || breedField.getText().trim().isEmpty()
                || pet_weightField.getText().trim().isEmpty()
                || birthField.getText().trim().isEmpty()
                || pet_nameField.getText().trim().isEmpty()
                || CustomersField.getSelectedItem() == null
                || cbGender.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar um pet.");
        } else {
            if (!pet_nameField.getText().matches("^[a-zA-Z\\s]*$")) {
                JOptionPane.showMessageDialog(null, "O nome informado é inválido. Ele deve conter apenas letras.");
            } else {
                String petWeight = pet_weightField.getText().trim();
                if (!petWeight.matches("[0-9]*\\.?[0-9]+")) {
                    JOptionPane.showMessageDialog(null, "O peso do animal deve ser um número.");
                } else {

                    try {

                        Pets obj = new Pets();
                        obj.setPet_name(pet_nameField.getText());
                        obj.setGender(cbGender.getSelectedItem().toString());
                        obj.setPet_weight(Double.parseDouble(pet_weightField.getText()));
                        obj.setSpecies(speciesField.getText());
                        obj.setBreed(breedField.getText());

                        SimpleDateFormat dateFormatBr = new SimpleDateFormat("dd/MM/yyyy");
                        Date birthDate = dateFormatBr.parse(birthField.getText());
                        SimpleDateFormat dateFormatMysql = new SimpleDateFormat("yyyy-MM-dd");
                        String dateMysql = dateFormatMysql.format(birthDate);
                        obj.setBirth(dateMysql);

                        Customers f = new Customers();
                        f = (Customers) CustomersField.getSelectedItem();
                        obj.setCustumers(f);

                        PetsDAO dao = new PetsDAO();
                        dao.addPets(obj);

                        new CleanFields().cleanFields(jPanel2, jPanel3);

                    } catch (Exception e) {
                    }
                }
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBntActionPerformed
        // TODO add your handling code here:
        try {
            Pets obj = new Pets();

            obj.setId(Integer.parseInt(idField.getText()));
            obj.setPet_name(pet_nameField.getText());
            obj.setGender(cbGender.getSelectedItem().toString());
            obj.setPet_weight(Double.parseDouble(pet_weightField.getText()));
            obj.setSpecies(speciesField.getText());
            obj.setBreed(searchClientField.getText());

            SimpleDateFormat dateFormatBr = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = dateFormatBr.parse(birthField.getText());
            SimpleDateFormat dateFormatMysql = new SimpleDateFormat("yyyy-MM-dd");
            String dateMysql = dateFormatMysql.format(birthDate);
            obj.setBirth(dateMysql);

            Customers f = new Customers();
            f = (Customers) CustomersField.getSelectedItem();

            obj.setCustumers(f);

            PetsDAO dao = new PetsDAO();
            dao.editPets(obj);

            new CleanFields().cleanFields(jPanel2, jPanel3);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_editBntActionPerformed

    private void deleteBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBntActionPerformed


        try {
            int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o pet? A exclusão apagará todos os registros no sistema relacionados a esse animal.", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (op == JOptionPane.YES_OPTION) {
                Pets obj = new Pets();

                obj.setId(Integer.parseInt(idField.getText()));

                PetsDAO dao = new PetsDAO();
                dao.deletePets(obj);

                new CleanFields().cleanFields(jPanel2, jPanel3);
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_deleteBntActionPerformed

    private void CustomersFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CustomersFieldAncestorAdded

        CustomersDAO dao = new CustomersDAO();
        List<Customers> listCustomers = dao.listCustomers();
        CustomersField.removeAll();

        CustomersField.addItem(null);
        for (Customers f : listCustomers) {
            CustomersField.addItem(f);
        }
    }//GEN-LAST:event_CustomersFieldAncestorAdded

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        listTable();
    }//GEN-LAST:event_formWindowActivated

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked


        Customers f = new Customers();
        CustomersDAO dao = new CustomersDAO();

        jTabbedPane1.setSelectedIndex(0);

        idField.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        f = dao.consultCustomers(table.getValueAt(table.getSelectedRow(), 1).toString());
        pet_nameField.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        cbGender.setSelectedItem(table.getValueAt(table.getSelectedRow(), 3).toString());
        birthField.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
        pet_weightField.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
        speciesField.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
        breedField.setText(table.getValueAt(table.getSelectedRow(), 7).toString());

        CustomersField.removeAllItems();
        CustomersField.getModel().setSelectedItem(f);
    }//GEN-LAST:event_tableMouseClicked

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed


        String name = "%" + searchField.getText() + "%";

        PetsDAO dao = new PetsDAO();
        List<Pets> listPets = dao.searchPets(name);
        DefaultTableModel data = (DefaultTableModel) table.getModel();
        data.setNumRows(0);

        for (Pets c : listPets) {
            data.addRow(new Object[]{
                    c.getId(),
                    c.getPet_name(),
                    c.getGender(),
                    c.getBirth(),
                    c.getPet_weight(),
                    c.getSpecies(),
                    c.getBreed(),
                    c.getCustumers().getName(),});
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed


        String searchTerm = searchClientField.getText().toLowerCase();

        CustomersField.removeAllItems();

        CustomersDAO dao = new CustomersDAO();
        List<Customers> listCustomers = dao.listCustomers();

        try {
            for (Customers f : listCustomers) {
                if (f.getName().toLowerCase().contains(searchTerm)) {
                    CustomersField.addItem(f);
                }
            }
            if (CustomersField.getItemCount() == 0) {
                throw new Exception("Cliente não localizado");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButton6ActionPerformed


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
            java.util.logging.Logger.getLogger(PetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CustomersField;
    private javax.swing.JButton addBtn;
    private javax.swing.JFormattedTextField birthField;
    private javax.swing.JTextField breedField;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton deleteBnt;
    private javax.swing.JButton editBnt;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField pet_nameField;
    private javax.swing.JFormattedTextField pet_weightField;
    private javax.swing.JTextField searchClientField;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField speciesField;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

