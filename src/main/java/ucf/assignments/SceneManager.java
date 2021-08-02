package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneManager {
    public static void changeScene(ActionEvent event, String name) throws IOException
    { // Same regardless of event so static
            // make a new parent using the ToDoListMainMenuController fxml file
            Parent new_root = FXMLLoader.load(Objects.requireNonNull(SceneManager.class.getResource(name)));
            // make a new scene using this parent
            Scene main_scene = new Scene(new_root);
            // make and set a new Stage by getting the Source, Scene, and Window of the event
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            // set scene of new Stage with our new scene
            window.setScene(main_scene);
            //  display the window
            window.show();
        }
    }

