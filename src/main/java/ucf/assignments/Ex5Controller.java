package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Ex5Controller implements Initializable {
    @FXML Label num_displayAdd;
    @FXML Label num_displaySub;
    @FXML Label num_displayMult;
    @FXML Label num_displayDiv;

    @FXML TextField f_num;
    @FXML TextField s_num;

    public void NextAssignmentPushed(ActionEvent event) throws IOException {
        SceneManager.changeScene(event,"Ex7Challenge.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        f_num.setOnKeyTyped(
                event-> {
                    double f_numVal = 0;
                    double s_numVal = 0;
                    boolean only_numbers = true;
                    if (!f_num.getText().isEmpty()) {
                        char[] chars = f_num.getText().toCharArray();
                        for(char c: chars){
                            if(!Character.isDigit(c)){
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            f_numVal = Double.parseDouble(f_num.getText());
                        }
                    }
                    only_numbers = true;
                    if (!s_num.getText().isEmpty()) {
                        char[] chars = s_num.getText().toCharArray();
                        for(char c: chars){
                            if(!Character.isDigit(c)){
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            s_numVal = Double.parseDouble(s_num.getText());
                        }
                    }
                    String add = Ex5Ops.add(f_numVal,s_numVal); ;
                    String sub = Ex5Ops.subtract(f_numVal,s_numVal);
                    String mult = Ex5Ops.multiply(f_numVal,s_numVal);
                    String div = Ex5Ops.divide(f_numVal,s_numVal);

                    num_displayAdd.setText(f_numVal + " + " + s_numVal + " = " + add);
                    num_displaySub.setText(f_numVal + " - " + s_numVal + " = " + sub);
                    num_displayMult.setText(f_numVal + " * " + s_numVal + " = " + mult);
                    num_displayDiv.setText(f_numVal + " / " + s_numVal + " = " + div);

        }
        );
        s_num.setOnKeyTyped(
                event-> {
                    double f_numVal = 0;
                    double s_numVal = 0;
                    boolean only_numbers = true;
                    if (!f_num.getText().isEmpty()) {
                        char[] chars = f_num.getText().toCharArray();
                        for(char c: chars){
                            if(!Character.isDigit(c)){
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            f_numVal = Double.parseDouble(f_num.getText());
                        }
                    }
                    only_numbers = true;
                    if (!s_num.getText().isEmpty()) {
                        char[] chars = s_num.getText().toCharArray();
                        for(char c: chars){
                            if(!Character.isDigit(c)){
                                only_numbers = false;
                            }
                        }
                        if(only_numbers){
                            s_numVal = Double.parseDouble(s_num.getText());
                        }
                    }
                    String add = Ex5Ops.add(f_numVal,s_numVal); ;
                    String sub = Ex5Ops.subtract(f_numVal,s_numVal);
                    String mult = Ex5Ops.multiply(f_numVal,s_numVal);
                    String div = Ex5Ops.divide(f_numVal,s_numVal);

                    num_displayAdd.setText(f_numVal + " + " + s_numVal + " = " + add);
                    num_displaySub.setText(f_numVal + " - " + s_numVal + " = " + sub);
                    num_displayMult.setText(f_numVal + " * " + s_numVal + " = " + mult);
                    num_displayDiv.setText(f_numVal + " / " + s_numVal + " = " + div);
                }
        );
    }
}
