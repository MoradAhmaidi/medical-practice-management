package sample.controller;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DashboardController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private BorderPane bp;

    @FXML
    private AnchorPane ap;

    @FXML
    private Button btn_Accueil;

    @FXML
    private Button btn_Agenda;

    @FXML
    private Button btn_Deconnecte;

    @FXML
    private Button btn_Employe;

    @FXML
    private Button btn_Patient;

    @FXML
    private Button btn_parametrage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    void Accueil(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    void Agenda(MouseEvent event) {
        LoadPage("../interface/Public/Agenda");
    }


    @FXML
    void Employe(MouseEvent event) {
        LoadPage("../interface/Employe/ListeEmploye");
    }

    @FXML
    void Parametrage(MouseEvent event) {
        LoadPage("../interface/Parametrage/Parametrage");
    }

    @FXML
    void Patient(MouseEvent event) {
        LoadPage("../interface/Patient/ListePatient");
    }

    @FXML
    void Deconnecte(ActionEvent event) {
        GoToLogin(event);
    }

    private void GoToLogin(ActionEvent event)
    {
        try {
            root = FXMLLoader.load(getClass().getResource("../interface/Public/Login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();
    }

    private void LoadPage(String page)
    {
        root=null;
        try{
            root=FXMLLoader.load(getClass().getResource(page+".fxml"));
        }catch (IOException e)
        {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE,null,e);
        }
        bp.setCenter(root);
    }



}
