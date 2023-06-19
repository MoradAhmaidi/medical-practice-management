package sample.model;

import java.util.ArrayList;

public class Visite {

    //declaration des variables
    private int id;
    private String diag;
    private Type_Staf v;
    private Staf s;
    private Rendez_vous rv;
    private ArrayList<Ordonnoce> ordonnoces;
    private  ArrayList<Certificate> certificates;

    //gets sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDiag() {
        return diag;
    }
    public void setDiag(String diag) {
        diag = diag;
    }
    public Staf getS() {
        return s;
    }
    public void setS(Staf s) {
        this.s = s;
    }
    public Rendez_vous getRv() {
        return rv;
    }
    public void setRv(Rendez_vous rv) {
        this.rv = rv;
    }

    //ctr
    public Visite() {
    }
    public Visite(int id, String diag, Staf s, Rendez_vous rv) {
        setId(id);
        setDiag(diag);
        setS(s);
        setRv(rv);
    }

}
