package cz.spsmb.tomsa.programkotestik;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox vyberZaka;

    @FXML
    private ChoiceBox text1;

    @FXML
    private TextField cislicko;

    @FXML
    private TextField text2;

    @FXML
    protected void onUkazatButtonClick() {
        List<Integer> list = new ArrayList<>();
        String[] marks = cislicko.getText().split(",");
        for (int i = 0; i < marks.length; i++) {
            int val = Integer.parseInt(marks[i]);
            list.add(val);
        }
        System.out.println(list);
        double diameter = Subject.diameter(list);
        text2.setText("Prumer: " + diameter);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (vyberZaka.getItems().isEmpty()) {
            vyberZaka.getItems().add("Dezo Amongus");
            vyberZaka.getItems().add("Picnik Fukac");
            vyberZaka.getItems().add("Debilko Ridic");
            vyberZaka.getItems().add("Pawel Szukac");
            vyberZaka.getItems().add("Sus Amongus");
        }

        if (text1.getItems().isEmpty()) {
            text1.getItems().add("Math");
            text1.getItems().add("English");
            text1.getItems().add("Czech");
            text1.getItems().add("Deutsch");
            text1.getItems().add("Cooking");
        }
    }
}