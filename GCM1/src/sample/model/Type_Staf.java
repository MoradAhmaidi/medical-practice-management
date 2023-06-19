package sample.model;

import java.util.ArrayList;

public class Type_Staf {

    //declaration des variables
    private int id;
    private String libelle;
    private ArrayList<Staf> stafs;

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

    //ctr
    public Type_Staf() {
    }

    public Type_Staf(int id, String libelle) {
        setId(id);
        setLibelle(libelle);
    }
}
