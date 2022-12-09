package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDao;
import entities.Employe;

public class EmployeService implements IDao<Employe> {

    @Override
    public boolean create(Employe o) {
        try {
            String sql = "insert into employe values (null, '" + o.getNom() + "', '" + o.getPrenom() + "', '" + o.getEmail() + "', '" + o.getPassword() + "', '" + o.getGenre() + "')";
            Statement st = Connexion.getConnection().createStatement();
            if (st.executeUpdate(sql) == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Employe o) {
        try {
            String sql = "delete from employe where id = " + o.getId();
            Statement st = Connexion.getConnection().createStatement();
            if (st.executeUpdate(sql) == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Employe o) {
        try {
            String sql = "update employe set nom='" + o.getNom() + "',prenom= '" + o.getPrenom() + "',email= '" + o.getEmail() + "', password='" + o.getPassword() + "',genre= '" + o.getGenre() + "' where id = "+ o.getId();
            Statement st = Connexion.getConnection().createStatement();
            if (st.executeUpdate(sql) == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Employe findById(int id) {
        Employe employe = null;
        try {
            String sql = "select * from employe where id = " + id;
            Statement st = Connexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return new Employe(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("password"), rs.getString("genre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employe> findAll() {
        List<Employe> employes = new ArrayList<Employe>();
        try {
            String sql = "select * from employe";
            Statement st = Connexion.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                employes.add(new Employe(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("password"), rs.getString("genre")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employes;
    }

}
