package sample.model;

import java.util.ArrayList;

public class Medicament {

    //declaration des variables
    private int id;
    private String libelle;
    private ArrayList<Traitement> traitements;

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
    public ArrayList<Traitement> getTraitements() {
        return traitements;
    }
    public void setTraitements(ArrayList<Traitement> traitements) {
        this.traitements = traitements;
    }
    //ctr
    public Medicament() {
    }
    public Medicament(int id, String libelle, ArrayList<Traitement> traitements) {
        setId(id);
        setLibelle(libelle);
        setTraitements(traitements);
    }

}
