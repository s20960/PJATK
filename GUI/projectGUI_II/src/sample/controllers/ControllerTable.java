package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.FileOperations;
import sample.TableViewScene;
import sample.models.PasswordModel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerTable implements Initializable {
    List<PasswordModel> passwordList;
    List<PasswordModel> resultList;
    FileOperations fileOperations =new FileOperations();

    public TableView<PasswordModel> tableView;
    public Button searchButton;
    public TextField filterField;
    public Label timeStampLabel;
    public static PasswordModel changedModel=null;

    public TextField nameAddField;
    public TextField passAddField;
    public TextField categoryAddField;
    public TextField URLAddField;
    public Button addButton;

    public Button deleteButton;
    public TextField deleteField;
    public TextField deleteCategory;

    public TableColumn<PasswordModel,String> nameCol;
    public TableColumn<PasswordModel,String> URLCol;
    public TableColumn<PasswordModel,String> categoryCol;
    public TableColumn<PasswordModel,String> passwordCol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            String timeStamp=readTimeStamp();
            timeStampLabel.setText(timeStamp);
            writeTimeStamp();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        passwordList=getList();
        for(int i=0;i<passwordList.size();i++)
            passwordList.get(i).password=makeStringCezar(passwordList.get(i).password);
        ObservableList<PasswordModel> passwords=FXCollections.observableArrayList(passwordList);
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        URLCol.setCellValueFactory(new PropertyValueFactory<>("URL"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        tableView.setItems(passwords);
        TableView.TableViewSelectionModel<PasswordModel> selectionModel=tableView.getSelectionModel();
        ObservableList<PasswordModel> selectedItem=selectionModel.getSelectedItems();

        selectedItem.addListener(new ListChangeListener<PasswordModel>() {
            @Override
            public void onChanged(Change<? extends PasswordModel> change) {
                changedModel=change.getList().get(0);
                Stage stage;
                Parent root;

                try {

                    root = FXMLLoader.load(getClass().getResource("../editScene.fxml"));
                    stage= TableViewScene.secondStage;
                    Scene scene=new Scene(root,400,400);
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }
    public String readTimeStamp() throws FileNotFoundException {
        String timeStamp=fileOperations.readTimeStamp("src/sample/Data/timeStamp.txt");
        return timeStamp;
    }
    public List<PasswordModel> getList(){
        fileOperations.readFile();
        passwordList= fileOperations.getPasswordsList();
        return passwordList;
    }
    public void searchCategory(){
        String fromField=filterField.getText();
        if(!fromField.equals("")){
            getList();
            tableView.getItems().clear();
            for(int i=0;i<passwordList.size();i++){
                String category=passwordList.get(i).category;
                if(category.equals(fromField)){
                    passwordList.get(i).password=makeStringCezar(passwordList.get(i).password);
                    tableView.getItems().add(passwordList.get(i));
                }
            }
        }
    }
    public void deleteByName() throws IOException {
        String fromDelfield=deleteField.getText();
        int counter=0;
        if(!fromDelfield.equals("")){
            tableView.getItems().clear();
            passwordList=getList();
            resultList=new ArrayList<>();
            for(int i=0;i<passwordList.size();i++){
                String name=passwordList.get(i).name;
                System.out.println(name);
                if(!name.equals(fromDelfield) || counter!=0){
                    resultList.add(passwordList.get(i));

                    passwordList.get(i).password=makeStringCezar(passwordList.get(i).password);
                    tableView.getItems().add(passwordList.get(i));
                }else
                    counter++;

            }
            passwordList=new ArrayList<>(resultList);
            writeAppendToFile(null,false);
        }
    }
    public void deleteByCategory() throws IOException {
        String fromDelfield=deleteCategory.getText();
        if(!fromDelfield.equals("")){
            tableView.getItems().clear();
            passwordList=getList();
            resultList=new ArrayList<>();
            for(int i=0;i<passwordList.size();i++){
                String category=passwordList.get(i).category;
                if(!category.equals(fromDelfield)){
                    resultList.add(passwordList.get(i));

                    passwordList.get(i).password=makeStringCezar(passwordList.get(i).password);
                    tableView.getItems().add(passwordList.get(i));
                }
            }
            passwordList=new ArrayList<>(resultList);
            writeAppendToFile(null,false);
        }
    }
    public void addPassword() throws IOException {
        if(isPassCorrect()){
            PasswordModel newPassword=new PasswordModel(nameAddField.getText(),passAddField.getText(),categoryAddField.getText(),URLAddField.getText());
            tableView.getItems().add(newPassword);
            String newPass=decodeStringCezar(newPassword.password);
            PasswordModel pass=new PasswordModel(nameAddField.getText(),newPass,categoryAddField.getText(),URLAddField.getText());
            passwordList.add(pass);
            writeAppendToFile(pass,true);
        }
    }
    public boolean isPassCorrect(){
        if(!nameAddField.getText().equals("") && !passAddField.getText().equals("") && !categoryAddField.getText().equals("") && !URLAddField.getText().equals("")){
            return true;
        }
        return false;
    }
    public void writeTimeStamp(){
        try {
            fileOperations.writeTimeStamp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeAppendToFile(PasswordModel password,boolean append) throws IOException {
        fileOperations.writeAppendToFile(password,append,passwordList);
    }
    public String makeStringCezar(String password){
        int offset=3;

        StringBuilder result = new StringBuilder();
        for (char character : password.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();

    }
    public String decodeStringCezar(String password){
        int offset=3;

        StringBuilder result = new StringBuilder();
        for (char character : password.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character + 'a';
                int newAlphabetPosition = (originalAlphabetPosition - offset) % 26;
                char newCharacter = (char) ('a' - newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();

    }

}
