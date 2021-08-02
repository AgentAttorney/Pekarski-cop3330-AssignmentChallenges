package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Ex1GreetController implements Initializable {
    @FXML Label greeting;
    @FXML TextField UserInput;

    public void EnterButtonPushed(ActionEvent event){
        String greeting_type = Greetings.greet(UserInput.getText());
        if(greeting_type.isEmpty()){
            greeting.setText("You can't have an empty name, the CIA won't accept that.");
        }
        else{
            greeting.setText(greeting_type);
        }
        greeting.setVisible(true);
    }
    public void NextAssignmentPushed(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Ex2Challenge.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        greeting.setVisible(false);
    }
}
