package sample.model;

import java.sql.Date;

public class Auth {

    //declaration des variables
    private int id;
    private Date dateE;
    private Date dateS;
    private Staf s;

    //sets gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDateE() {
        return dateE;
    }
    public void setDateE(Date dateE) {
        this.dateE = dateE;
    }
    public Date getDateS() {
        return dateS;
    }
    public void setDateS(Date dateS) {
        this.dateS = dateS;
    }
    public Staf getS() {
        return s;
    }
    public void setS(Staf s) {
        this.s = s;
    }

    //ctr
    public Auth() {
    }
    public Auth(int id, Date dateE, Date dateS, Staf s) {
        setId(id);
        setDateE(dateE);
        setDateS(dateS);
        setS(s);
    }
}
