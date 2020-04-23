package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FXEventHandler {
    @FXML
    private TextField display;
    @FXML
    private Button b;
    @FXML
    private TextArea text;


    public String readFile() throws FileNotFoundException {
        var inputText = display.getText();
        File file = new File(inputText);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();

    }

    public void buttonPressed(ActionEvent event) throws FileNotFoundException {
        var butonPressed = (Button)event.getSource();
        text.setText(readFile());

    }
}
