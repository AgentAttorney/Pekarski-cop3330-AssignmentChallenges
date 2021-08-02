package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Ex7Controller implements Initializable {

    @FXML TextField Dim1;
    @FXML TextField Dim2;

    @FXML Label answer;

    @FXML ChoiceBox<String> Units;

    public void NextAssignmentPushed(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Ex9Challenge.fxml");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Units.getItems().addAll("feet","meters");
        Units.setValue("feet");

        Dim1.setOnKeyTyped(
                event -> {
                    double Dim1Val = 0;
                    double Dim2Val = 0;
                    boolean only_numbers = true;

                    if(!Dim1.getText().isEmpty()){
                        char[] chars = Dim1.getText().toCharArray();
                        for(char c: chars) {
                            if (!Character.isDigit(c)) {
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            Dim1Val = Double.parseDouble(Dim1.getText());
                        }
                    }
                    only_numbers = true;
                    if (!Dim2.getText().isEmpty()) {
                        char[] chars = Dim2.getText().toCharArray();
                        for(char c: chars){
                            if(!Character.isDigit(c)){
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            Dim2Val = Double.parseDouble(Dim2.getText());
                        }
                    }
                    String unitsValue;
                    if(!Units.getValue().isEmpty()){
                        unitsValue = Units.getValue();
                        String final_answer = Ex7Ops.multiply(Dim1Val,Dim2Val);
                        String conv_answer = Ex7Ops.convert(final_answer,unitsValue);
                        // answer was originally in feet
                        if(Double.parseDouble(final_answer) > Double.parseDouble(conv_answer)){
                            answer.setText(final_answer + " " + unitsValue + " or " + conv_answer + " meters.");
                        }
                        // answer was in meters
                        else{
                            answer.setText(final_answer + " " + unitsValue + " or " + conv_answer + " feet.");
                        }
                    }
                }
        );

        Dim2.setOnKeyTyped(
                event -> {
                    double Dim1Val = 0;
                    double Dim2Val = 0;
                    boolean only_numbers = true;

                    if(!Dim1.getText().isEmpty()){
                        char[] chars = Dim1.getText().toCharArray();
                        for(char c: chars) {
                            if (!Character.isDigit(c)) {
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            Dim1Val = Double.parseDouble(Dim1.getText());
                        }
                    }
                    only_numbers = true;
                    if (!Dim2.getText().isEmpty()) {
                        char[] chars = Dim2.getText().toCharArray();
                        for(char c: chars){
                            if(!Character.isDigit(c)){
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            Dim2Val = Double.parseDouble(Dim2.getText());
                        }
                    }
                    String unitsValue;
                    if(!Units.getValue().toString().isEmpty()){
                        unitsValue = Units.getValue().toString();
                        String final_answer = Ex7Ops.multiply(Dim1Val,Dim2Val);
                        String conv_answer = Ex7Ops.convert(final_answer,unitsValue);
                        // answer was originally in feet
                        if(Double.parseDouble(final_answer) > Double.parseDouble(conv_answer)){
                            answer.setText(final_answer + " " + unitsValue + " or " + conv_answer + " meters.");
                        }
                        // answer was in meters
                        else{
                            answer.setText(final_answer + " " + unitsValue + " or " + conv_answer + " feet.");
                        }
                    }
                }
        );
    }
}
