package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import sample.DataBaseCnx;

import java.io.IOException;
import java.sql.ResultSet;


public class LoginController   {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private DataBaseCnx db;
    @FXML
    private Button btn_login;
    @FXML
    private Label txt_res;
    @FXML
    private PasswordField txt_password;
    @FXML
    private TextField txt_username;


    //login
    public void Btn_loginOnAction(ActionEvent event)
    {
        if(txt_username.getText().isBlank()==false && txt_password.getText().isBlank()==false)
        {
            String Requite="Select count(*) from Staf where username='"+txt_username.getText()+"' and password='"+txt_password.getText()+"'";
            db=new DataBaseCnx();
            ResultSet resultSet = db.GetRow(Requite);
            try{
                while (resultSet.next())
                {
                   if( resultSet.getInt(1)==1)
                    {
                        GoToDashboard(event);
                    }else
                    {
                        txt_res.setText("Invalide login,Pease try agin!");
                    }

                }
            }catch (Exception e)
            {
                e.printStackTrace();
                e.getCause();
            }

        }else {
            txt_res.setText("Please enter username and password!");
        }
    }

    private void GoToDashboard(ActionEvent event)
    {
        try {
            root = FXMLLoader.load(getClass().getResource("../interface/Accueil/Dashboard.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root,1080,700);
        stage.setScene(scene);
        stage.show();
    }

}
