package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Ex2Controller implements Initializable {
    @FXML Label char_count;
    @FXML Label Error;
    @FXML TextField Input;
    public void NextAssignmentPushed(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Ex5Challenge.fxml");
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Input.setOnKeyTyped(
            event -> {
                int count = Input.getText().length();
                char_count.setText(count + " characters");
                if(count == 0){
                    Error.setVisible(true);
                }
                else{
                    Error.setVisible(false);
                }
            }
        );


        }
    }

