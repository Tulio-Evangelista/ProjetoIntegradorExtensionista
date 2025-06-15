package br.com.petShop.view;


import br.com.petShop.dao.CustomersDAO;
import br.com.petShop.dao.ProductsDAO;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DashboardScreen extends JFrame {

    public String userLogin;


    public DashboardScreen() {
        initComponents();

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/images/icones/icone_pethub.png")));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/br/images/fundo_pethub.png"));
        Image image = icon.getImage();
        painel_desktop = new javax.swing.JDesktopPane(){

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jMenuBar1 = customizeJMenuBar(new javax.swing.JMenuBar());
        customerMenu = new javax.swing.JMenu();
        addCustomerMenu = new javax.swing.JMenuItem();
        searchCustomerMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        addAnimalMenu = new javax.swing.JMenuItem();
        searchAnimalMenu = new javax.swing.JMenuItem();
        employeeMenu = new javax.swing.JMenu();
        addEmployeeMenu = new javax.swing.JMenuItem();
        searchEmployeeMenu = new javax.swing.JMenuItem();
        supplierMenu = new javax.swing.JMenu();
        addSupplierMenu = new javax.swing.JMenuItem();
        searchSupplierMenu = new javax.swing.JMenuItem();
        productsMenu = new javax.swing.JMenu();
        stockManagementMenu = new javax.swing.JMenuItem();
        addProductsMenu = new javax.swing.JMenuItem();
        searchProductMenu = new javax.swing.JMenuItem();
        servicesMenu = new javax.swing.JMenu();
        servicesSchedule = new javax.swing.JMenuItem();
        addServices = new javax.swing.JMenuItem();
        listServices = new javax.swing.JMenuItem();
        vaccineMenu = new javax.swing.JMenu();
        vaccineControllerMenu = new javax.swing.JMenuItem();
        searchVaccineMenu = new javax.swing.JMenuItem();
        animalReportManu = new javax.swing.JMenuItem();
        salesMenu = new javax.swing.JMenu();
        pdvMenu = new javax.swing.JMenuItem();
        totalSalesDay = new javax.swing.JMenuItem();
        historySalesMenu = new javax.swing.JMenuItem();
        reportsMenu = new javax.swing.JMenu();
        productsList = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        changeUserMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PetHUB | Painel Administrativo");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário Logado:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tulio Evangelista");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data:");

        dateLabel.setBackground(new java.awt.Color(255, 255, 255));
        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("0/00/0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1004, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(dateLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                .addContainerGap(694, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 0));
        jMenuBar1.setBorder(null);

        customerMenu.setForeground(new java.awt.Color(255, 255, 255));
        customerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/Icone_cliente.png"))); // NOI18N
        customerMenu.setText("Clientes");

        addCustomerMenu.setForeground(new java.awt.Color(28, 74, 137));
        addCustomerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        addCustomerMenu.setText("Cadastro de Cliente");
        addCustomerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerMenuActionPerformed(evt);
            }
        });
        customerMenu.add(addCustomerMenu);

        searchCustomerMenu.setForeground(new java.awt.Color(28, 74, 137));
        searchCustomerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_buscar.png"))); // NOI18N
        searchCustomerMenu.setText("Consulta de Cliente");
        searchCustomerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerMenuActionPerformed(evt);
            }
        });
        customerMenu.add(searchCustomerMenu);

        jMenuBar1.add(customerMenu);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_pets.png"))); // NOI18N
        jMenu1.setText("Animais");

        addAnimalMenu.setForeground(new java.awt.Color(28, 74, 137));
        addAnimalMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        addAnimalMenu.setText("Cadastro de Animal");
        addAnimalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnimalMenuActionPerformed(evt);
            }
        });
        jMenu1.add(addAnimalMenu);

        searchAnimalMenu.setForeground(new java.awt.Color(28, 74, 137));
        searchAnimalMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_buscar.png"))); // NOI18N
        searchAnimalMenu.setText("Consulta de Animal");
        searchAnimalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAnimalMenuActionPerformed(evt);
            }
        });
        jMenu1.add(searchAnimalMenu);

        jMenuBar1.add(jMenu1);

        employeeMenu.setForeground(new java.awt.Color(255, 255, 255));
        employeeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/Icone_funcionario.png"))); // NOI18N
        employeeMenu.setText("Funcionarios");

        addEmployeeMenu.setForeground(new java.awt.Color(28, 74, 137));
        addEmployeeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        addEmployeeMenu.setText("Cadastro de  Funcionários");
        addEmployeeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeMenuActionPerformed(evt);
            }
        });
        employeeMenu.add(addEmployeeMenu);

        searchEmployeeMenu.setForeground(new java.awt.Color(28, 74, 137));
        searchEmployeeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_buscar.png"))); // NOI18N
        searchEmployeeMenu.setText("Consulta de Funcionários");
        searchEmployeeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeMenuActionPerformed(evt);
            }
        });
        employeeMenu.add(searchEmployeeMenu);

        jMenuBar1.add(employeeMenu);

        supplierMenu.setForeground(new java.awt.Color(255, 255, 255));
        supplierMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_fornecedores.png"))); // NOI18N
        supplierMenu.setText("Fornecedores");

        addSupplierMenu.setForeground(new java.awt.Color(28, 74, 137));
        addSupplierMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        addSupplierMenu.setText("Cadastro de Fornecedores");
        addSupplierMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierMenuActionPerformed(evt);
            }
        });
        supplierMenu.add(addSupplierMenu);

        searchSupplierMenu.setForeground(new java.awt.Color(28, 74, 137));
        searchSupplierMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_buscar.png"))); // NOI18N
        searchSupplierMenu.setText("Consulta de Fornecedores");
        searchSupplierMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSupplierMenuActionPerformed(evt);
            }
        });
        supplierMenu.add(searchSupplierMenu);

        jMenuBar1.add(supplierMenu);

        productsMenu.setForeground(new java.awt.Color(255, 255, 255));
        productsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_produtos.png"))); // NOI18N
        productsMenu.setText("Produtos");

        stockManagementMenu.setForeground(new java.awt.Color(28, 74, 137));
        stockManagementMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        stockManagementMenu.setText("Controle de Estoque");
        stockManagementMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockManagementMenuActionPerformed(evt);
            }
        });
        productsMenu.add(stockManagementMenu);

        addProductsMenu.setForeground(new java.awt.Color(28, 74, 137));
        addProductsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        addProductsMenu.setText("Cadastro de Produtos");
        addProductsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductsMenuActionPerformed(evt);
            }
        });
        productsMenu.add(addProductsMenu);

        searchProductMenu.setForeground(new java.awt.Color(28, 74, 137));
        searchProductMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_buscar.png"))); // NOI18N
        searchProductMenu.setText("Consulta de Produtos");
        searchProductMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductMenuActionPerformed(evt);
            }
        });
        productsMenu.add(searchProductMenu);

        jMenuBar1.add(productsMenu);

        servicesMenu.setForeground(new java.awt.Color(255, 255, 255));
        servicesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_servicos.png"))); // NOI18N
        servicesMenu.setText("Serviços");

        servicesSchedule.setForeground(new java.awt.Color(28, 74, 137));
        servicesSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_lista.png"))); // NOI18N
        servicesSchedule.setText("Agenda de Serviços");
        servicesSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesScheduleActionPerformed(evt);
            }
        });
        servicesMenu.add(servicesSchedule);

        addServices.setForeground(new java.awt.Color(28, 74, 137));
        addServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        addServices.setText("Cadastro de Serviços");
        addServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServicesActionPerformed(evt);
            }
        });
        servicesMenu.add(addServices);

        listServices.setForeground(new java.awt.Color(28, 74, 137));
        listServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_buscar.png"))); // NOI18N
        listServices.setText("Consulta de Serviços");
        listServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listServicesActionPerformed(evt);
            }
        });
        servicesMenu.add(listServices);

        jMenuBar1.add(servicesMenu);

        vaccineMenu.setForeground(new java.awt.Color(255, 255, 255));
        vaccineMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_vacina.png"))); // NOI18N
        vaccineMenu.setText("Vacinas");

        vaccineControllerMenu.setForeground(new java.awt.Color(28, 74, 137));
        vaccineControllerMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_adicionar.png"))); // NOI18N
        vaccineControllerMenu.setText("Controle de Vacinas");
        vaccineControllerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineControllerMenuActionPerformed(evt);
            }
        });
        vaccineMenu.add(vaccineControllerMenu);

        searchVaccineMenu.setForeground(new java.awt.Color(28, 74, 137));
        searchVaccineMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_buscar.png"))); // NOI18N
        searchVaccineMenu.setText("Consulta de Vacinas");
        searchVaccineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVaccineMenuActionPerformed(evt);
            }
        });
        vaccineMenu.add(searchVaccineMenu);

        animalReportManu.setForeground(new java.awt.Color(28, 74, 137));
        animalReportManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_relatorioprodutos.png"))); // NOI18N
        animalReportManu.setText("Ficha Animal");
        animalReportManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalReportManuActionPerformed(evt);
            }
        });
        vaccineMenu.add(animalReportManu);

        jMenuBar1.add(vaccineMenu);

        salesMenu.setForeground(new java.awt.Color(255, 255, 255));
        salesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_vendas.png"))); // NOI18N
        salesMenu.setText("Vendas");

        pdvMenu.setForeground(new java.awt.Color(28, 74, 137));
        pdvMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_pdv.png"))); // NOI18N
        pdvMenu.setText("Abrir PDV");
        pdvMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdvMenuActionPerformed(evt);
            }
        });
        salesMenu.add(pdvMenu);

        totalSalesDay.setForeground(new java.awt.Color(28, 74, 137));
        totalSalesDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_vendas_dia.png"))); // NOI18N
        totalSalesDay.setText("Total de Vendas no Dia");
        totalSalesDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSalesDayActionPerformed(evt);
            }
        });
        salesMenu.add(totalSalesDay);

        historySalesMenu.setForeground(new java.awt.Color(28, 74, 137));
        historySalesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_historico.png"))); // NOI18N
        historySalesMenu.setText("Histórico de Vendas");
        historySalesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historySalesMenuActionPerformed(evt);
            }
        });
        salesMenu.add(historySalesMenu);

        jMenuBar1.add(salesMenu);

        reportsMenu.setForeground(new java.awt.Color(255, 255, 255));
        reportsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_relatorio.png"))); // NOI18N
        reportsMenu.setText("Relatorios");

        productsList.setForeground(new java.awt.Color(28, 74, 137));
        productsList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_relatorioprodutos.png"))); // NOI18N
        productsList.setText("Lista de Produtos");
        productsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsListActionPerformed(evt);
            }
        });
        reportsMenu.add(productsList);

        jMenuItem1.setForeground(new java.awt.Color(28, 74, 137));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_relatorioprodutos.png"))); // NOI18N
        jMenuItem1.setText("Lista de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        reportsMenu.add(jMenuItem1);

        jMenuBar1.add(reportsMenu);

        settingsMenu.setForeground(new java.awt.Color(255, 255, 255));
        settingsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_configuracoes.png"))); // NOI18N
        settingsMenu.setText("Configurações");

        changeUserMenu.setForeground(new java.awt.Color(28, 74, 137));
        changeUserMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_trocarusuario.png"))); // NOI18N
        changeUserMenu.setText("Trocar de Usuário");
        changeUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUserMenuActionPerformed(evt);
            }
        });
        settingsMenu.add(changeUserMenu);

        jMenuBar1.add(settingsMenu);

        exitMenu.setForeground(new java.awt.Color(255, 255, 255));
        exitMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/images/icones/icone_sair.png"))); // NOI18N
        exitMenu.setText("Sair");
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerMenuActionPerformed
        // TODO add your handling code here:

        CustomersScreen customer = new CustomersScreen();
        customer.jTabbedPane1.setSelectedIndex(0);
        customer.setVisible(true);

    }//GEN-LAST:event_addCustomerMenuActionPerformed

    private void addEmployeeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeMenuActionPerformed
        // TODO add your handling code here:

        WorkersScreen workers = new WorkersScreen();
        workers.jTabbedPane1.setSelectedIndex(0);
        workers.setVisible(true);

    }//GEN-LAST:event_addEmployeeMenuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.setExtendedState(this.MAXIMIZED_BOTH);
        jLabel3.setText(userLogin);
        this.setVisible(true);

        Date date_now = new Date();
        SimpleDateFormat dateBrazil = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String formattedDate = dateBrazil.format(date_now);
        dateLabel.setText(formattedDate);

    }//GEN-LAST:event_formWindowActivated

    private void addAnimalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnimalMenuActionPerformed
        // TODO add your handling code here:

        PetScreen pet = new PetScreen();
        pet.jTabbedPane1.setSelectedIndex(0);
        pet.setVisible(true);

    }//GEN-LAST:event_addAnimalMenuActionPerformed

    private void vaccineControllerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineControllerMenuActionPerformed
        // TODO add your handling code here:

        VacineScreen vaccine = new VacineScreen();
        vaccine.jTabbedPane1.setSelectedIndex(0);
        vaccine.setVisible(true);

    }//GEN-LAST:event_vaccineControllerMenuActionPerformed

    private void searchProductMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductMenuActionPerformed
        // TODO add your handling code here:

        ProductsScreen products = new ProductsScreen();
        products.jTabbedPane1.setSelectedIndex(1);
        products.setVisible(true);

    }//GEN-LAST:event_searchProductMenuActionPerformed

    private void searchCustomerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerMenuActionPerformed
        // TODO add your handling code here:
        CustomersScreen customer = new CustomersScreen();
        customer.jTabbedPane1.setSelectedIndex(1);
        customer.setVisible(true);
    }//GEN-LAST:event_searchCustomerMenuActionPerformed

    private void searchAnimalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAnimalMenuActionPerformed
        // TODO add your handling code here:

        PetScreen pet = new PetScreen();
        pet.jTabbedPane1.setSelectedIndex(1);
        pet.setVisible(true);

    }//GEN-LAST:event_searchAnimalMenuActionPerformed

    private void searchEmployeeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmployeeMenuActionPerformed
        // TODO add your handling code here:

        ProvidersScreen providers = new ProvidersScreen();
        providers.jTabbedPane1.setSelectedIndex(0);
        providers.setVisible(true);

    }//GEN-LAST:event_searchEmployeeMenuActionPerformed

    private void searchSupplierMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupplierMenuActionPerformed
        // TODO add your handling code here:

        ProvidersScreen providers = new ProvidersScreen();
        providers.jTabbedPane1.setSelectedIndex(1);
        providers.setVisible(true);

    }//GEN-LAST:event_searchSupplierMenuActionPerformed

    private void addSupplierMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierMenuActionPerformed
        // TODO add your handling code here:

       ProvidersScreen supplier = new ProvidersScreen();
        supplier.jTabbedPane1.setSelectedIndex(0);
        supplier.setVisible(true);

    }//GEN-LAST:event_addSupplierMenuActionPerformed

    private void addProductsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductsMenuActionPerformed


        ProductsScreen products = new ProductsScreen();
        products.jTabbedPane1.setSelectedIndex(0);
        products.setVisible(true);

    }//GEN-LAST:event_addProductsMenuActionPerformed

    private void stockManagementMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockManagementMenuActionPerformed


        StockManagementScreen stock = new StockManagementScreen();
        stock.setVisible(true);

    }//GEN-LAST:event_stockManagementMenuActionPerformed

    private void searchVaccineMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVaccineMenuActionPerformed
        // TODO add your handling code here:

        VacineScreen vaccine = new VacineScreen();
        vaccine.jTabbedPane1.setSelectedIndex(1);
        vaccine.setVisible(true);

    }//GEN-LAST:event_searchVaccineMenuActionPerformed

    private void pdvMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdvMenuActionPerformed


        PdvScreen pdv = new PdvScreen();
        pdv.setVisible(true);

    }//GEN-LAST:event_pdvMenuActionPerformed

    private void totalSalesDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSalesDayActionPerformed


        TotalSalesScreen totalSales = new TotalSalesScreen();
        totalSales.setVisible(true);

    }//GEN-LAST:event_totalSalesDayActionPerformed

    private void historySalesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historySalesMenuActionPerformed


        HistorySalesScreen history = new HistorySalesScreen();
        history.setVisible(true);

    }//GEN-LAST:event_historySalesMenuActionPerformed

    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked


        int op;

        op = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_exitMenuMouseClicked

    private void changeUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUserMenuActionPerformed

        LoginScreen loginScreen = new LoginScreen();
        this.dispose();
        loginScreen.setVisible(true);

    }//GEN-LAST:event_changeUserMenuActionPerformed

    private void productsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsListActionPerformed


        ProductsDAO dao = new ProductsDAO();
        dao.productsReport();

    }//GEN-LAST:event_productsListActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed


        CustomersDAO dao = new CustomersDAO();
        dao.clientsReport();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void addServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServicesActionPerformed


        AddServicesScreen addServicesScreen = new AddServicesScreen();
        addServicesScreen.setVisible(true);

    }//GEN-LAST:event_addServicesActionPerformed

    private void listServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listServicesActionPerformed


        AddServicesScreen addServicesScreen = new AddServicesScreen();
        addServicesScreen.jTabbedPane1.setSelectedIndex(1);
        addServicesScreen.setVisible(true);

    }//GEN-LAST:event_listServicesActionPerformed

    private void servicesScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesScheduleActionPerformed


        ServicesToDoScreen servicesScheduleScreen = new ServicesToDoScreen();
        servicesScheduleScreen.setVisible(true);

    }//GEN-LAST:event_servicesScheduleActionPerformed

    private void animalReportManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalReportManuActionPerformed


        PetReportScreen petReport = new PetReportScreen();
        petReport.setVisible(true);

    }//GEN-LAST:event_animalReportManuActionPerformed


    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardScreen().setVisible(true);
            }
        });
    }

    public JMenuBar customizeJMenuBar(JMenuBar menuBar) {
        return new JMenuBar() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(28, 74, 137));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addAnimalMenu;
    private javax.swing.JMenuItem addCustomerMenu;
    public javax.swing.JMenuItem addEmployeeMenu;
    public javax.swing.JMenuItem addProductsMenu;
    private javax.swing.JMenuItem addServices;
    public javax.swing.JMenuItem addSupplierMenu;
    public javax.swing.JMenuItem animalReportManu;
    private javax.swing.JMenuItem changeUserMenu;
    private javax.swing.JMenu customerMenu;
    private javax.swing.JLabel dateLabel;
    public javax.swing.JMenu employeeMenu;
    private javax.swing.JMenu exitMenu;
    public javax.swing.JMenuItem historySalesMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listServices;
    private javax.swing.JDesktopPane painel_desktop;
    private javax.swing.JMenuItem pdvMenu;
    private javax.swing.JMenuItem productsList;
    public javax.swing.JMenu productsMenu;
    public javax.swing.JMenu reportsMenu;
    public javax.swing.JMenu salesMenu;
    private javax.swing.JMenuItem searchAnimalMenu;
    private javax.swing.JMenuItem searchCustomerMenu;
    public javax.swing.JMenuItem searchEmployeeMenu;
    public javax.swing.JMenuItem searchProductMenu;
    public javax.swing.JMenuItem searchSupplierMenu;
    private javax.swing.JMenuItem searchVaccineMenu;
    private javax.swing.JMenu servicesMenu;
    private javax.swing.JMenuItem servicesSchedule;
    private javax.swing.JMenu settingsMenu;
    public javax.swing.JMenuItem stockManagementMenu;
    public javax.swing.JMenu supplierMenu;
    public javax.swing.JMenuItem totalSalesDay;
    private javax.swing.JMenuItem vaccineControllerMenu;
    public javax.swing.JMenu vaccineMenu;
    // End of variables declaration//GEN-END:variables
}
