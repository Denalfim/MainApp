package sample;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller{
    @FXML
    private TextField fieldText;
    @FXML
    private TextArea areaText;

    public void clicBtn1(ActionEvent actionEvent) {
        areaText.appendText(fieldText.getText() + "\n");
        fieldText.clear();
        fieldText.requestFocus();
    }

    public void clicBtn2(ActionEvent actionEvent) {

        areaText.clear();
        fieldText.requestFocus();
    }


    public void keyPress(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.ENTER){
            areaText.appendText(fieldText.getText() + "\n");
            fieldText.clear();
            fieldText.requestFocus();
        }
    }
}
