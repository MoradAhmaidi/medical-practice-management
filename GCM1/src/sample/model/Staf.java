package sample.model;

import java.util.ArrayList;
import java.util.Date;

public class Staf extends Personne {

    //declaration des variables



    public Staf(String cin, String nom, String prenom) {
        super(cin, nom, prenom);

    }

    public Staf() {
    }

    public Staf(String cin, String nom, String prenom, char sexe, Date dateNaiss, String telephone, String addresse, String username, String password) {
        super(cin, nom, prenom, sexe, dateNaiss, telephone, addresse, username, password);

    }
}
