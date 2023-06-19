package sample.model;

public class Protocole {

    //declaration des variables
    private int id;
    private String libelle;

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
    public Protocole() {
    }

    public Protocole(int id, String libelle) {
        setId(id);
        setLibelle(libelle);
    }
}
