/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author steve
 */
public class ModelProduitDao {
    
    Connection con;
Conexion cn = new Conexion();
PreparedStatement pst;
ResultSet rs;

public boolean enregistrer(ModelProduit mp) {
    String sql = "INSERT INTO gestion(id, produit, categorie, quantite, prix) VALUES" 
            + "(?, ?, ?, ?, ?)";
    
    try {
        con = cn.getConnection();
        pst = con.prepareStatement(sql);
        pst.setString(1, mp.getId());
        pst.setString(2, mp.getNomProduit());
        pst.setString(3, mp.getCategorie());
        pst.setInt(4, mp.getQuantite());
        pst.setDouble(5, mp.getPrix());
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Produit ajouté");
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public List<ModelProduit> liste() {
    List<ModelProduit> lis = new ArrayList<>();
    
    String sql = "SELECT * FROM gestion";
    try {
        con = cn.getConnection();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        
        while (rs.next()) {
            ModelProduit mo = new ModelProduit();
            mo.setId(rs.getString("id"));
            mo.setNomProduit(rs.getString("produit"));
            mo.setCategorie(rs.getString("categorie"));
            mo.setQuantite(rs.getInt("quantite"));
            mo.setPrix(rs.getDouble("prix"));
            lis.add(mo);
        } 
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return lis;
}
}
