package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EventHandler {
    @FXML
    private TextField display;
    @FXML
    private Button b;
    @FXML
    private TextArea text;


    public void readFile(ActionEvent event) throws IOException {
        var inputText = display.getText();
        File file = new File(inputText);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        var buttonPressed = (Button)event.getSource();
        text.setText(sc.next());

    }
}
