package org.example.javafxej1;

import Modelo.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainControler {
    @FXML
    private Button ButtonHelo;

    @FXML
    private Label welcomeText;

    @FXML
    private void onHelloButtonClick() {
        System.out.println("Hola!");
    }
}