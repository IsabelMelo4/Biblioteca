package codigodoprogama;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class iniciar implements Initializable {

    @FXML
    private  Label label;

    @FXML

    private void handleButtonAction(ActionEvent event){
        System.out.println("clique aqui");

        label.setText("hello word");
    }

    @Override

    public void initialize(URL url, ResourceBundle rb){

    }
}
