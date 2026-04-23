package me.apppersonasfx;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import me.apppersonasfx.model.Persona;


public class PersonasController {

    private Persona pp;

    private ObservableList<Persona> personas = FXCollections.observableArrayList();


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}