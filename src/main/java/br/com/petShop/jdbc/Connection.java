package br.com.petShop.jdbc;

import javax.swing.JOptionPane;


public class Connection {
    public static void main(String[] args) {
        try {

            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conetado com sucesso!");

        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao conectar! " + erro);
        }
    }
}
