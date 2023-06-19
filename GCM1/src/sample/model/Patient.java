package sample.model;

import java.util.ArrayList;
import java.util.Date;

public class Patient  extends Personne{

    //declaration des variables
    private int mutuelle;
    private ArrayList<Allergie> allergies;
    private ArrayList<Malade> malades;
    private ArrayList<Visite> visites;
    private Civilite c;
    private Group_sanguin g_s;

    //gets Sets
    public int getMutuelle() {
        return mutuelle;
    }
    public void setMutuelle(int mutuelle) {
        this.mutuelle = mutuelle;
    }
    public ArrayList<Allergie> getAllergies() {
        return allergies;
    }
    public void setAllergies(ArrayList<Allergie> allergies) {
        this.allergies = allergies;
    }
    public ArrayList<Malade> getMalades() {
        return malades;
    }
    public void setMalades(ArrayList<Malade> malades) {
        this.malades = malades;
    }
    public ArrayList<Visite> getVisites() {
        return visites;
    }
    public void setVisites(ArrayList<Visite> visites) {
        this.visites = visites;
    }
    public Civilite getC() {
        return c;
    }
    public void setC(Civilite c) {
        this.c = c;
    }
    public Group_sanguin getG_s() {
        return g_s;
    }
    public void setG_s(Group_sanguin g_s) {
        this.g_s = g_s;
    }

    public Patient(String cin, String nom, String prenom, int mutuelle) {
        super(cin, nom, prenom);
        this.mutuelle = mutuelle;
    }

    //ctr
    public Patient() {
    }

    public Patient(String cin, String nom, String prenom, char sexe, Date dateNaiss, String telephone, String addresse, String username, String password, int mutuelle, ArrayList<Allergie> allergies, ArrayList<Malade> malades, ArrayList<Visite> visites, Civilite c, Group_sanguin g_s) {
        super(cin, nom, prenom, sexe, dateNaiss, telephone, addresse, username, password);
        setMutuelle(mutuelle);
        setAllergies(allergies);
        setMalades(malades);
        setVisites(visites);
        setC(c);
        setG_s(g_s);
    }

}
