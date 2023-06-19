package sample.model;

import java.util.ArrayList;

public class Salle {
    //declaration des variables
    private int id;
    private int nbrC;
    private ArrayList<Visite> visites;

    //sets gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNbrC() {
        return nbrC;
    }
    public void setNbrC(int nbrC) {
        this.nbrC = nbrC;
    }
    public ArrayList<Visite> getVisites() {
        return visites;
    }
    public void setVisites(ArrayList<Visite> visites) {
        this.visites = visites;
    }

    //ctr
    public Salle() {
    }

    public Salle(int id, int nbrC, ArrayList<Visite> visites) {
        setId(id);
        setNbrC(nbrC);
        setVisites(visites);
    }
}
