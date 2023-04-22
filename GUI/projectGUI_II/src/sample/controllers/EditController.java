package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.TableViewScene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditController implements Initializable {

    public TextField nameField;
    public TextField passField;
    public TextField URLField;
    public TextField categoryField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameField.setText(ControllerTable.changedModel.getName());
        passField.setText(ControllerTable.changedModel.getPassword());
        categoryField.setText(ControllerTable.changedModel.getCategory());
        URLField.setText(ControllerTable.changedModel.getURL());
    }
    public void editPassword(){
        if(isPassCorrect()){
            ControllerTable.changedModel.setPassword(passField.getText());
            ControllerTable.changedModel.setCategory(categoryField.getText());
            ControllerTable.changedModel.setURL(URLField.getText());
            ControllerTable.changedModel.setName(nameField.getText());
            try {
                Stage stage;
                Parent root;
                root = FXMLLoader.load(getClass().getResource("../tableView.fxml"));
                stage = TableViewScene.secondStage;
                Scene scene = new Scene(root,800, 600);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
    public boolean isPassCorrect(){
        if(!nameField.getText().equals("") && !passField.getText().equals("") && !categoryField.getText().equals("") && !URLField.getText().equals("")){
            return true;
        }
        return false;
    }
}
