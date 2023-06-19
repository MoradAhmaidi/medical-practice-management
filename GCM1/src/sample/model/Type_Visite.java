package sample.model;

import java.util.ArrayList;

public class Type_Visite {
    //declaration des variables
    private int id;
    private String libelle;
    private ArrayList<Visite> visites;

    //sets gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public ArrayList<Visite> getVisites() {
        return visites;
    }
    public void setVisites(ArrayList<Visite> visites) {
        this.visites = visites;
    }

    //ctr
    public Type_Visite() {
    }

    public Type_Visite(int id, String libelle, ArrayList<Visite> visites) {
        setId(id);
        setLibelle(libelle);
        setVisites(visites);
    }
}
