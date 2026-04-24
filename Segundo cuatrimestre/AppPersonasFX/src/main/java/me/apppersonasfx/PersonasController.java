package me.apppersonasfx;


import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import me.apppersonasfx.model.Persona;

import java.net.URL;
import java.util.ResourceBundle;


public class PersonasController implements Initializable {

    private Persona pp;
    private ObservableList<Persona> personas = FXCollections.observableArrayList();

    @FXML
    private AnchorPane MainView;

    @FXML
    private AnchorPane formView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //que se ejecute la pagina principal
        this.formView.setVisible(false);
        this.MainView.setVisible(true);
    }



    //BOTONES main
    @FXML
    public void onbtnInserarClick(ActionEvent actionEvent) {
        this.MainView.setVisible(false);
        this.formView.setVisible(true);
    }

    @FXML
    public void onbtnListadoClick(ActionEvent actionEvent) {

    }

    @FXML
    public void onbtnBuscarClick(ActionEvent actionEvent) {

    }

    @FXML
    public void onbtnSalirClick(ActionEvent actionEvent) {
        Platform.exit();
        this.clearTFCamps();
    }


    //form
    @FXML
    public void onbtnCancelarClick(ActionEvent actionEvent) {
        this.formView.setVisible(false);
        this.MainView.setVisible(true);

        this.clearTFCamps();
    }

    public void onbtnGuardarClick(ActionEvent actionEvent) {

    }

    private void clearTFCamps() {
        this.TFDni.clear();
        this.TFNombre.clear();
        this.TFApellido.clear();
        this.TFEmail.clear();
        this.TFEdad.clear();
        this.TFTelefono.clear();
    }


    //Campos de tecto formulario
    @FXML
    private TextField TFDni;
    @FXML
    private TextField TFNombre;
    @FXML
    private TextField TFApellido;
    @FXML
    private TextField TFEmail;
    @FXML
    private TextField TFEdad;
    @FXML
    private TextField TFTelefono;







}