package sample.model;

public class Certificate {

    //declaration des variables
    private int id;
    private int duree;
    private Visite v;

    //sets gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDuree() {
        return duree;
    }
    public void setDuree(int duree) {
        this.duree = duree;
    }
    public Visite getV() {
        return v;
    }
    public void setV(Visite v) {
        this.v = v;
    }

    //ctr
    public Certificate() {
    }
    public Certificate(int id, int duree, Visite v) {
        setId(id);
        setDuree(duree);
        setV(v);
    }
}
