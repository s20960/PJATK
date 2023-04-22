package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TableViewScene {
    public static Stage secondStage;
    public TableViewScene() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tableView.fxml"));
        secondStage=new Stage();
        secondStage.setTitle("Login Scene");
        secondStage.setScene(new Scene(root, 800, 600));
        secondStage.show();
    }
}
