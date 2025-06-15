package br.com.petShop.view;


import br.com.petShop.dao.WorkersDAO;
import br.com.petShop.model.Workers;
import br.com.petShop.utils.CPFUtils;
import br.com.petShop.utils.CleanFields;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;


public class WorkersScreen extends javax.swing.JFrame {

    public void listTable() {

        WorkersDAO dao = new WorkersDAO();
        List<Workers> listEmployees = dao.listEmployees();
        DefaultTableModel data = (DefaultTableModel) table.getModel();
        data.setNumRows(0);

        for (Workers c : listEmployees) {
            data.addRow(new Object[]{
                    c.getId(),
                    c.getName(),
                    c.getRg(),
                    c.getCpf(),
                    c.getEmail(),
                    c.getResponsibility(),
                    c.getAccess_level(),
                    c.getLandline(),
                    c.getPhone(),
                    c.getCep(),
                    c.getAddress(),
                    c.getNumber(),
                    c.getComplement(),
                    c.getDistrict(),
                    c.getCity(),
                    c.getState()
            });
        }
    }


    public WorkersScreen() {
        initComponents();

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/images/icones/icone_pethub.png")));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        complementField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        districtField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ufField = new javax.swing.JComboBox<>();
        cepField = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        findCep = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneField = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        landlineField = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        rgField = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        cpfField = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        responsibilityField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        acess_levelField = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBnt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PetHUB | Cadastro de Funcionários");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Funcionários");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/logo_icone.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel22)
                                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel22))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("*Nome:");

        nameField.setForeground(new java.awt.Color(28, 74, 137));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(28, 74, 137));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("*CEP:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("*N°:");

        numberField.setForeground(new java.awt.Color(28, 74, 137));
        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Complemento");

        complementField.setForeground(new java.awt.Color(28, 74, 137));
        complementField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("*Bairro:");

        districtField.setForeground(new java.awt.Color(28, 74, 137));
        districtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtFieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("*Cidade:");

        cityField.setForeground(new java.awt.Color(28, 74, 137));
        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("*UF:");

        ufField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ufField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        cepField.setForeground(new java.awt.Color(28, 74, 137));
        try {
            cepField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepFieldActionPerformed(evt);
            }
        });
        cepField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cepFieldKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("*Endereço:");

        addressField.setForeground(new java.awt.Color(28, 74, 137));
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        findCep.setText("Preencher CEP");
        findCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cepField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(findCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(districtField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ufField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addressField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(complementField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46))))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(complementField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel13)
                                                .addComponent(districtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14)
                                                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15)
                                                .addComponent(ufField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(findCep))
                                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("*Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("*Celular:");

        try {
            phoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefone (fixo)");

        try {
            landlineField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("*RG:");

        rgField.setForeground(new java.awt.Color(28, 74, 137));
        try {
            rgField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("*CPF:");

        cpfField.setForeground(new java.awt.Color(28, 74, 137));
        try {
            cpfField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Dados de Faturamento ");

        emailField.setForeground(new java.awt.Color(28, 74, 137));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Informações de Acesso");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("*Senha:");

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(28, 74, 137));

        responsibilityField.setForeground(new java.awt.Color(28, 74, 137));
        responsibilityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsibilityFieldActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("*Cargo:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("*Nível de Acesso:");

        acess_levelField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        acess_levelField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Veterinário", "Administrador", " " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(responsibilityField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acess_levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(responsibilityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21)
                                        .addComponent(acess_levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(28, Short.MAX_VALUE))
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
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel6)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(landlineField))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel16)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel17)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel18))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)
                                        .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)
                                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(landlineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
                        "Código", "Nome", "RG", "CPF", "E-mail", "Cargo", "Nível Acesso", "Telefone", "Celular", "Cep", "Endereço", "N°", "Comp", "Bairro", "Cidade", "UF"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 194, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Funcionarios", jPanel3);

        addBtn.setForeground(new java.awt.Color(28, 74, 137));
        addBtn.setText("NOVO");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setForeground(new java.awt.Color(28, 74, 137));
        editBtn.setText("EDITAR");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
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
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBnt)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBtn, deleteBnt, editBtn});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editBtn)
                                        .addComponent(deleteBnt)
                                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addBtn, deleteBnt, editBtn});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed

    }//GEN-LAST:event_emailFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed

    }//GEN-LAST:event_addressFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed

    }//GEN-LAST:event_cityFieldActionPerformed

    private void districtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtFieldActionPerformed

    }//GEN-LAST:event_districtFieldActionPerformed

    private void complementFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementFieldActionPerformed

    }//GEN-LAST:event_complementFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed

    }//GEN-LAST:event_numberFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed

    }//GEN-LAST:event_idFieldActionPerformed

    private void responsibilityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsibilityFieldActionPerformed

    }//GEN-LAST:event_responsibilityFieldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed


        if (nameField.getText().trim().isEmpty()
                || rgField.getText().trim().isEmpty()
                || emailField.getText().trim().isEmpty()
                || phoneField.getText().trim().isEmpty()
                || cepField.getText().trim().isEmpty()
                || addressField.getText().trim().isEmpty()
                || numberField.getText().trim().isEmpty()
                || districtField.getText().trim().isEmpty()
                || cityField.getText().trim().isEmpty()
                || ufField.getSelectedItem() == null
                || responsibilityField.getText().trim().isEmpty()
                || passwordField.getText().trim().isEmpty()
                || acess_levelField.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar um funcionário.");
        } else {

            if (!emailField.getText().trim().contains("@")) {
                JOptionPane.showMessageDialog(null, "O email informado é inválido.");
            } else if (!nameField.getText().matches("^[a-zA-Z\\s]*$")) {
                JOptionPane.showMessageDialog(null, "O nome informado é inválido. Ele deve conter apenas letras.");
            } else {
                CPFUtils cpfUtils = new CPFUtils();
                String cpf = cpfField.getText().trim().replaceAll("\\D", "");
                if (!cpfUtils.isCPFValid(cpf)) {
                    JOptionPane.showMessageDialog(null, "O CPF informado é invalido.");
                } else {

                    try {

                        Workers obj = new Workers();
                        obj.setName(nameField.getText());
                        obj.setRg(rgField.getText());
                        obj.setCpf(cpfField.getText());
                        obj.setEmail(emailField.getText());
                        obj.setPassword(passwordField.getText());
                        obj.setResponsibility(responsibilityField.getText());
                        obj.setAccess_level(acess_levelField.getSelectedItem().toString());
                        obj.setLandline(landlineField.getText());
                        obj.setPhone(phoneField.getText());
                        obj.setAddress(addressField.getText());
                        obj.setCep(cepField.getText());
                        obj.setNumber(Integer.parseInt(numberField.getText()));
                        obj.setComplement(complementField.getText());
                        obj.setDistrict(districtField.getText());
                        obj.setCity(cityField.getText());
                        obj.setState(ufField.getSelectedItem().toString());

                        WorkersDAO dao = new WorkersDAO();
                        dao.addEmployees(obj);

                        new CleanFields().cleanFields(jPanel2, jPanel4);

                    } catch (Exception e) {
                    }

                }
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded

    }//GEN-LAST:event_tableAncestorAdded

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed

    }//GEN-LAST:event_tableKeyPressed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed

        String name = "%" + searchField.getText() + "%";

        WorkersDAO dao = new WorkersDAO();
        List<Workers> listEmployees = dao.searchEmployees(name);
        DefaultTableModel data = (DefaultTableModel) table.getModel();
        data.setNumRows(0);

        for (Workers c : listEmployees) {
            data.addRow(new Object[]{
                    c.getId(),
                    c.getName(),
                    c.getRg(),
                    c.getCpf(),
                    c.getEmail(),
                    c.getResponsibility(),
                    c.getAccess_level(),
                    c.getLandline(),
                    c.getPhone(),
                    c.getCep(),
                    c.getAddress(),
                    c.getNumber(),
                    c.getComplement(),
                    c.getDistrict(),
                    c.getCity(),
                    c.getState()
            });
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        listTable();
    }//GEN-LAST:event_formWindowActivated

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked


        jTabbedPane1.setSelectedIndex(0); //Ao clicar na tabela, enviar para a tela 1

        idField.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        nameField.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        rgField.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        cpfField.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
        emailField.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
        responsibilityField.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
        acess_levelField.setSelectedItem(table.getValueAt(table.getSelectedRow(), 6).toString());
        landlineField.setText(table.getValueAt(table.getSelectedRow(), 7).toString());
        phoneField.setText(table.getValueAt(table.getSelectedRow(), 8).toString());
        cepField.setText(table.getValueAt(table.getSelectedRow(), 9).toString());
        addressField.setText(table.getValueAt(table.getSelectedRow(), 10).toString());
        numberField.setText(table.getValueAt(table.getSelectedRow(), 11).toString());
        complementField.setText(table.getValueAt(table.getSelectedRow(), 12).toString());
        districtField.setText(table.getValueAt(table.getSelectedRow(), 13).toString());
        cityField.setText(table.getValueAt(table.getSelectedRow(), 14).toString());
        ufField.setSelectedItem(table.getValueAt(table.getSelectedRow(), 15).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed


        if (nameField.getText().trim().isEmpty()
                || rgField.getText().trim().isEmpty()
                || emailField.getText().trim().isEmpty()
                || phoneField.getText().trim().isEmpty()
                || cepField.getText().trim().isEmpty()
                || addressField.getText().trim().isEmpty()
                || numberField.getText().trim().isEmpty()
                || districtField.getText().trim().isEmpty()
                || cityField.getText().trim().isEmpty()
                || ufField.getSelectedItem() == null
                || responsibilityField.getText().trim().isEmpty()
                || acess_levelField.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de editar um funcionário.");
        } else {

            if (!emailField.getText().trim().contains("@")) {
                JOptionPane.showMessageDialog(null, "O email informado é inválido.");
            } else if (!nameField.getText().matches("^[a-zA-Z\\s]*$")) {
                JOptionPane.showMessageDialog(null, "O nome informado é inválido. Ele deve conter apenas letras.");
            } else {
                CPFUtils cpfUtils = new CPFUtils();
                String cpf = cpfField.getText().trim().replaceAll("\\D", "");
                if (!cpfUtils.isCPFValid(cpf)) {
                    JOptionPane.showMessageDialog(null, "O CPF informado é invalido.");
                } else {

                    try {

                        Workers obj = new Workers();
                        obj.setName(nameField.getText());
                        obj.setRg(rgField.getText());
                        obj.setCpf(cpfField.getText());
                        obj.setEmail(emailField.getText());
                        if (passwordField != null) {
                            obj.setPassword(passwordField.getText());
                        }
                        obj.setResponsibility(responsibilityField.getText());
                        obj.setAccess_level(acess_levelField.getSelectedItem().toString());
                        obj.setLandline(landlineField.getText());
                        obj.setPhone(phoneField.getText());
                        obj.setAddress(addressField.getText());
                        obj.setCep(cepField.getText());
                        obj.setNumber(Integer.parseInt(numberField.getText()));
                        obj.setComplement(complementField.getText());
                        obj.setDistrict(districtField.getText());
                        obj.setCity(cityField.getText());
                        obj.setState(ufField.getSelectedItem().toString());

                        obj.setId(Integer.parseInt(idField.getText()));

                        WorkersDAO dao = new WorkersDAO();
                        dao.editEmployees(obj);

                        new CleanFields().cleanFields(jPanel2, jPanel4);

                    } catch (Exception e) {
                    }

                }
            }
        }


    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBntActionPerformed
        // TODO add your handling code here:
        try {

            Workers obj = new Workers();

            obj.setId(Integer.parseInt(idField.getText()));

            WorkersDAO dao = new WorkersDAO();
            dao.deleteEmployees(obj);

            new CleanFields().cleanFields(jPanel2, jPanel4);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_deleteBntActionPerformed

    private void cepFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepFieldKeyPressed




    }//GEN-LAST:event_cepFieldKeyPressed

    private void findCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCepActionPerformed


    }//GEN-LAST:event_findCepActionPerformed

    private void cepFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepFieldActionPerformed

    }//GEN-LAST:event_cepFieldActionPerformed


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
            java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new WorkersScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acess_levelField;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressField;
    private javax.swing.JFormattedTextField cepField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField complementField;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JButton deleteBnt;
    private javax.swing.JTextField districtField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton findCep;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField landlineField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField numberField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JFormattedTextField phoneField;
    private javax.swing.JTextField responsibilityField;
    private javax.swing.JFormattedTextField rgField;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> ufField;
    // End of variables declaration//GEN-END:variables
}

