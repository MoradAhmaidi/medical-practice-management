package sample.model;

import java.util.Date;

public class Rendez_vous {

    //declaration des variables
    private int id;
    private Date date_rv;
    private String motif;
    private float pois;
    private float longure;
    private float p_a;
    private float p_s;
    private  float t;
    private Patient p;
    private Malade m;
    private Staf_Infirmiere s_i;
    private Staf_Medecin s_m;
    private Salle s;

    //sets gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate_rv() {
        return date_rv;
    }
    public void setDate_rv(Date date_rv) {
        this.date_rv = date_rv;
    }
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
    public float getPois() {
        return pois;
    }
    public void setPois(float pois) {
        this.pois = pois;
    }
    public float getLongure() {
        return longure;
    }
    public void setLongure(float longure) {
        this.longure = longure;
    }
    public float getP_a() {
        return p_a;
    }
    public void setP_a(float p_a) {
        this.p_a = p_a;
    }
    public float getP_s() {
        return p_s;
    }
    public void setP_s(float p_s) {
        this.p_s = p_s;
    }
    public float getT() {
        return t;
    }
    public void setT(float t) {
        this.t = t;
    }
    public Patient getP() {
        return p;
    }
    public void setP(Patient p) {
        this.p = p;
    }
    public Malade getM() {
        return m;
    }
    public void setM(Malade m) {
        this.m = m;
    }
    public Staf_Infirmiere getS_i() {
        return s_i;
    }
    public void setS_i(Staf_Infirmiere s_i) {
        this.s_i = s_i;
    }
    public Staf_Medecin getS_m() {
        return s_m;
    }
    public void setS_m(Staf_Medecin s_m) {
        this.s_m = s_m;
    }
    public Salle getS() {
        return s;
    }
    public void setS(Salle s) {
        this.s = s;
    }

    //ctr
    public Rendez_vous() {
    }

    public Rendez_vous(int id, Date date_rv, String motif, float pois, float longure, float p_a, float p_s, float t, Patient p, Malade m, Staf_Infirmiere s_i, Staf_Medecin s_m,Salle s) {
        setId(id);
        setDate_rv(date_rv);
        setMotif(motif);
        setPois(pois);
        setLongure(longure);
        setP_a(p_a);
        setP_s(p_s);
        setT(t);
        setP(p);
        setM(m);
        setS_i(s_i);
        setS_m(s_m);
        setS(s);
    }


}
