package projetoIntegrador.petShop.dao;

import projetoIntegrador.petShop.jdbc.ConnectionFactory;
import projetoIntegrador.petShop.model.Vacine;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import projetoIntegrador.petShop.model.Pets;
import projetoIntegrador.petShop.model.Customers;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacineDAO {

    private Connection con;

    public VacineDAO() {
        this.con = new ConnectionFactory().getConnection();
    }


    public void addVaccine(Vacine obj) {

        try {

            String sql = "insert into tb_vaccines (vaccine_name, vaccine_application, vaccine_expiration, note, for_id, for_pet)"
                    + "values (?,?,?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getVaccine_name());
            stmt.setString(2, obj.getVaccine_application());
            stmt.setString(3, obj.getVaccine_expiration());
            stmt.setString(4, obj.getNote());
            stmt.setInt(5, obj.getCustumers().getId());
            stmt.setInt(6, obj.getPets().getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Vacina cadastrada com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }


    public void editVaccine(Vacine obj) {

        try {

            String sql = "update tb_vaccines set vaccine_name = ?, vaccine_application = ?, vaccine_expiration = ?, note = ?, for_id = ?, for_pet = ? where id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getVaccine_name());
            stmt.setString(2, obj.getVaccine_application());
            stmt.setString(3, obj.getVaccine_expiration());
            stmt.setString(4, obj.getNote());
            stmt.setInt(5, obj.getCustumers().getId());
            stmt.setInt(6, obj.getPets().getId());
            stmt.setInt(7, obj.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Vacina alterada com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }


    public void deleteVaccine(Vacine obj) {

        try {

            String sql = "delete from tb_vaccines where id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Vacina excluída com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }


    public List<Vacine> listVaccines() {
        try {
            List<Vacine> listVaccines = new ArrayList<>();

            String sql = "SELECT v.id, v.vaccine_name, DATE_FORMAT(v.vaccine_application, '%d/%m/%Y') AS date_formatted_application, "
                    + "DATE_FORMAT(v.vaccine_expiration, '%d/%m/%Y') AS date_formatted_expiration, v.note, f.name, p.pet_name "
                    + "FROM tb_vaccines AS v "
                    + "INNER JOIN tb_customers AS f ON (v.for_id = f.id) "
                    + "INNER JOIN tb_pets AS p ON (v.for_pet = p.id)";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vacine obj = new Vacine();
                Customers f = new Customers();
                Pets p = new Pets();

                obj.setId(rs.getInt("v.id"));
                obj.setVaccine_name(rs.getString("v.vaccine_name"));
                obj.setVaccine_application(rs.getString("date_formatted_application"));
                obj.setVaccine_expiration(rs.getString("date_formatted_expiration"));
                obj.setNote(rs.getString("v.note"));

                f.setName(rs.getString("f.name"));
                p.setPet_name(rs.getString("p.pet_name"));

                obj.setCustumers(f);
                obj.setPets(p);

                listVaccines.add(obj);
            }

            return listVaccines;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }


    public List<Vacine> searchVaccines(String name) {
        try {
            List<Vacine> listVaccines = new ArrayList<>();

            String sql = "SELECT v.id, v.vaccine_name, DATE_FORMAT(v.vaccine_application, '%d/%m/%Y') AS date_formatted_application, "
                    + "DATE_FORMAT(v.vaccine_expiration, '%d/%m/%Y') AS date_formatted_expiration, v.note, f.name, p.pet_name "
                    + "FROM tb_vaccines AS v "
                    + "INNER JOIN tb_customers AS f ON (v.for_id = f.id) "
                    + "INNER JOIN tb_pets AS p ON (v.for_pet = p.id) "
                    + "WHERE f.name LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vacine obj = new Vacine();
                Customers f = new Customers();
                Pets p = new Pets();

                obj.setId(rs.getInt("v.id"));
                obj.setVaccine_name(rs.getString("v.vaccine_name"));
                obj.setVaccine_application(rs.getString("date_formatted_application"));
                obj.setVaccine_expiration(rs.getString("date_formatted_expiration"));
                obj.setNote(rs.getString("v.note"));

                f.setName(rs.getString("f.name"));
                p.setPet_name(rs.getString("p.pet_name"));

                obj.setCustumers(f);
                obj.setPets(p);

                listVaccines.add(obj);
            }

            return listVaccines;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }


    public void deleteVaccinesByCustomerId(int customerId) {
        try {
            String sql = "delete from tb_vaccines where for_id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, customerId);

            stmt.execute();
            stmt.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar vacinas: " + erro);
        }
    }


    public void deleteVaccinesByPetId(int petId) {
        try {
            String sqlVaccines = "DELETE FROM tb_vaccines WHERE for_pet = ?";
            PreparedStatement stmtVaccines = con.prepareStatement(sqlVaccines);
            stmtVaccines.setInt(1, petId);
            stmtVaccines.execute();
            stmtVaccines.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
}
