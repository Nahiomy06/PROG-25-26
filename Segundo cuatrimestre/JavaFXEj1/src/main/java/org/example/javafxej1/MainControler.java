package org.example.javafxej1;

import Modelo.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainControler {

    private Producto producto;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("The orb");
    }
}