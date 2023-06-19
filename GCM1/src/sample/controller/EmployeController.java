package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.DataBaseCnx;
import sample.model.Staf;
import sample.model.Type_Staf;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeController  implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;



    @FXML
    private Button btn_ajoute;

    @FXML
    private Button btn_serch;

    @FXML
    private ComboBox<?> cmb_serch;

    @FXML
    private TableColumn<Staf, String> col_id;

    @FXML
    private TableColumn<Staf, String> col_nom;

    @FXML
    private TableColumn<Staf, String> col_prenom;

    @FXML
    private TableView<Staf> tv;

    @FXML
    private TextField txt_serch;

    ObservableList stafs=FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DataBaseCnx cnx= new DataBaseCnx();
        try (ResultSet rs = cnx.GetRow("select  * from Staf")) {
            while (rs.next()) {
                try {
                    stafs.add(new Staf(rs.getString("cin"), rs.getString("nom"), rs.getString("prenom")));
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

        tv.setItems(stafs);
    }

}
