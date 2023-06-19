package sample.model;

import java.util.Date;

public abstract class Personne {


    //declaration des variables
    private String cin;
    private String nom;
    private String prenom;
    private char sexe;
    private Date dateNaiss;
    private String telephone;
    private String addresse;
    private String username;
    private String password;

    //gets Sets

    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public char getSexe() {
        return sexe;
    }
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
    public Date getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAddresse() {
        return addresse;
    }
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //ctr
    public Personne() {
    }

    public Personne(String cin, String nom, String prenom) {
        setCin(cin);
        setNom(nom);
        setPrenom(prenom);
    }

    public Personne(String cin, String nom, String prenom, char sexe, Date dateNaiss, String telephone, String addresse, String username, String password) {
        setCin(cin);
        setNom(nom);
        setPrenom(prenom);
        setSexe(sexe);
        setDateNaiss(dateNaiss);
        setTelephone(telephone);
        setAddresse(addresse);
        setUsername(username);
        setPassword(password);
    }


}
