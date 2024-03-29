package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene windowContents = new Scene(root);
        primaryStage.setScene(windowContents);
        primaryStage.show();

    }
}
