package sample.model;

import java.util.ArrayList;

public class Ordonnoce {

    //declaration des variables
    private int id;
    private Visite v;
    private ArrayList<Traitement> traitements;

    //sets gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Visite getV() {
        return v;
    }
    public void setV(Visite v) {
        this.v = v;
    }
    public ArrayList<Traitement> getTraitements() {
        return traitements;
    }
    public void setTraitements(ArrayList<Traitement> traitements) {
        this.traitements = traitements;
    }

    //ctr
    public Ordonnoce() {
    }
    public Ordonnoce(int id, Visite v, ArrayList<Traitement> traitements) {
        setId(id);
        setV(v);
        setTraitements(traitements);
    }
}
