/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author steve
 */
public class ModelProduit {
    
    private String id;
    private String nomProduit;
    private String categorie;
    private int quantite;
    private double prix;

    public ModelProduit() {
    }

    public ModelProduit(String id, String nomProduit, String categorie, int quantite, double prix) {
        this.id = id;
        this.nomProduit = nomProduit;
        this.categorie = categorie;
        this.quantite = quantite;
        this.prix = prix;
    }

    public String getId() {
        return id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
    
    
    
}
