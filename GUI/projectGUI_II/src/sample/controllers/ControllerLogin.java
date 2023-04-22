package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import sample.TableViewScene;

import java.io.IOException;

public class ControllerLogin {
    final static String password="1234qwer";

    @FXML
    public PasswordField passwordField;


    public void checkPassword() throws IOException {
        String passwordSign=passwordField.getText();
        if(passwordSign.equals(password)){
            Stage stage= (Stage) passwordField.getScene().getWindow();
            stage.close();

            TableViewScene tableViewScene=new TableViewScene();
        }else{
            System.out.println("zle haslo");
        }
    }
}
