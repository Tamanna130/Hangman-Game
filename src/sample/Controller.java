package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;

public class Controller {
    @FXML
    private void onclick(ActionEvent event)throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(new Scene(parent, 850, 550));
        window.show();

    }
}
