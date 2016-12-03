package sample;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static double VIEWPORT_SIZE = 900;
    public static double ASPECT_RATIO = 6/9.0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Revenga");
        primaryStage.setScene(new Scene(root, VIEWPORT_SIZE, VIEWPORT_SIZE * ASPECT_RATIO));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
