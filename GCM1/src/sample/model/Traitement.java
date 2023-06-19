package sample.model;

public class Traitement {

    public Traitement(int id, Medicament m, Dose d, Protocole p, Ordonnoce o) {
        setId(id);
        setM(m);
        setD(d);
        setP(p);
        setP(p);
        setO(o);
    }

    //declaration des variables
    private int id;
    private Medicament m;
    private Dose d;
    private Protocole p;
    private Ordonnoce o;

    //gets sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Medicament getM() {
        return m;
    }
    public void setM(Medicament m) {
        this.m = m;
    }
    public Dose getD() {
        return d;
    }
    public void setD(Dose d) {
        this.d = d;
    }
    public Protocole getP() {
        return p;
    }
    public void setP(Protocole p) {
        this.p = p;
    }
    public Ordonnoce getO() {
        return o;
    }
    public void setO(Ordonnoce o) {
        this.o = o;
    }
    //ctr
    public Traitement() {
    }
}
