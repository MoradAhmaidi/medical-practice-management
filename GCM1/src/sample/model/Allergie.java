package sample.model;

import java.util.ArrayList;

public class Allergie {

    //declaration des variables
    private int id;
    private String libelle;
    private ArrayList<Patient> patients;

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
    public ArrayList<Patient> getPatients() {
        return patients;
    }
    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    //ctr
    public Allergie() {
    }
    public Allergie(int id, String libelle, ArrayList<Patient> patients) {
        setId(id);
        setLibelle(libelle);
        setPatients(patients);
    }
}
