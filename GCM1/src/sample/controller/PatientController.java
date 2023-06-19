package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.DataBaseCnx;
import sample.model.Patient;
import sample.model.Staf;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PatientController implements Initializable {
    @FXML
    private Button btn_ajoute;

    @FXML
    private Button btn_serch;

    @FXML
    private ComboBox<?> cmb_sech;

    @FXML
    private TableColumn<Patient, String> col_id;

    @FXML
    private TableColumn<Patient, String> col_nom;

    @FXML
    private TableColumn<Patient, String> col_prenom;

    @FXML
    private TableColumn<Patient, String> col_mutuelle;


    @FXML
    private TableView<?> tv;

    @FXML
    private TextField txt_serch;

    ObservableList patients= FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DataBaseCnx cnx= new DataBaseCnx();
        try (ResultSet rs = cnx.GetRow("select  * from Patient")) {
            while (rs.next()) {
                try {
                    patients.add(new Patient(rs.getString("cin"), rs.getString("nom"), rs.getString("prenom"),rs.getInt("mutuelle")));
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_id.setCellValueFactory(new PropertyValueFactory<>("cin"));
        col_nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        col_prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        col_prenom.setCellValueFactory(new PropertyValueFactory<>("mutuelle"));


        tv.setItems(patients);
    }
}
