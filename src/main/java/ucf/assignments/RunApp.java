package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class RunApp extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        try {
            // set the parent to the Menu file, then set the scene with that parent and title
            // Have the window not be resizable
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Ex1Greeting.FXML")));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("GUI-Related Assignments");
            primaryStage.show();
            primaryStage.setResizable(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

