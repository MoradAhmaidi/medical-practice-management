package sample.model;

import java.sql.Date;

public class Conges {
    //declaration des variables
    private int id;
    private Date dateS;
    private int Dure;

    //sets gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDateS() {
        return dateS;
    }
    public void setDateS(Date dateS) {
        this.dateS = dateS;
    }
    public int getDure() {
        return Dure;
    }
    public void setDure(int dure) {
        Dure = dure;

    }

    //ctr
    public Conges() {
    }
    public Conges(int id, Date dateS, int dure) {
        setId(id);
        setDateS(dateS);
        setDure(dure);
    }
}
