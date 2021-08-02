package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Ex9Controller implements Initializable {
    @FXML ChoiceBox<String> shapes;

    @FXML TextField Length;
    @FXML TextField Width;

    @FXML Label ErrorMessage;
    @FXML Label AnswerMessage;

    @FXML Button FindGallons;

    public void FindGallonsPushed(ActionEvent event){
        int area;
        if(shapes.getValue().equalsIgnoreCase("circle")){
            area = Ex9Ops.multiplyCircle(Length.getText());
        }
        else if(shapes.getValue().equalsIgnoreCase("square")){
            area = Ex9Ops.multiplySquare(Length.getText());
        }
        else{
            area = Ex9Ops.multiplyRectangle(Length.getText(),Width.getText());
        }
        AnswerMessage.setText("You'll need " + area + " gallons to cover the area.");
        AnswerMessage.setVisible(true);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        shapes.getItems().addAll("Square","Rectangle","Circle");
        shapes.setValue("Square");

        ErrorMessage.setVisible(false);
        FindGallons.setDisable(false);

        Length.setVisible(true);
        Width.setVisible(false);

        AnswerMessage.setVisible(false);

        shapes.setOnAction(
                event->{
                    if(shapes.getValue().equalsIgnoreCase("Square") || shapes.getValue().equalsIgnoreCase("Circle")){
                        Width.setVisible(false);
                    }
                    else{
                        Width.setVisible(true);
                    }
                }
        );
        Length.setOnKeyTyped(
                event ->{

                    boolean only_numbers_length = true;
                    boolean only_numbers_width = true;

                    if(!Length.getText().isEmpty()) {
                        char[] chars = Length.getText().toCharArray();
                        for (char c : chars) {
                            if (!Character.isDigit(c)) {
                                only_numbers_length = false;
                            }
                        }
                        if (!only_numbers_length) {
                            FindGallons.setDisable(true);
                            ErrorMessage.setVisible(true);
                        }
                    }
                    char[] charsWidth = Width.getText().toCharArray();
                    for(char c: charsWidth){
                        if(!Character.isDigit(c)){
                            only_numbers_width = false;
                        }
                    }
                    if(!only_numbers_width){
                        FindGallons.setDisable(true);
                        ErrorMessage.setVisible(true);
                    }
                    if(only_numbers_length && only_numbers_width){
                        FindGallons.setDisable(false);
                        ErrorMessage.setVisible(false);
                    }
                }
        );
        Width.setOnKeyTyped(
                event ->{

                    boolean only_numbers_length = true;
                    boolean only_numbers_width = true;

                    if(!Length.getText().isEmpty()) {
                        char[] chars = Length.getText().toCharArray();
                        for (char c : chars) {
                            if (!Character.isDigit(c)) {
                                only_numbers_length = false;
                            }
                        }
                        if (!only_numbers_length) {
                            FindGallons.setDisable(true);
                            ErrorMessage.setVisible(true);
                        }
                    }
                    char[] charsWidth = Width.getText().toCharArray();
                    for(char c: charsWidth){
                        if(!Character.isDigit(c)){
                            only_numbers_width = false;
                        }
                    }
                    if(!only_numbers_width){
                        FindGallons.setDisable(true);
                        ErrorMessage.setVisible(true);
                    }
                    if(only_numbers_length && only_numbers_width){
                        FindGallons.setDisable(false);
                        ErrorMessage.setVisible(false);
                    }
                }
        );
    }
}
