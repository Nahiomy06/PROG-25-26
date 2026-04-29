package me.apppersonasfx;


import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import me.apppersonasfx.SQL.SQLAccessPersona;
import me.apppersonasfx.model.Persona;

import java.net.URL;
import java.util.ResourceBundle;


public class PersonasController implements Initializable {

    private Persona pp;
    private ObservableList<Persona> personas = FXCollections.observableArrayList();

    @FXML
    private Button btnGuardar;

    private boolean isDniValido = false, isNombreValido = false, isApellidoValido = false,
            isEmailValido = false, isEdadValido = false, isTelefonoValido = false;

    @FXML
    private AnchorPane MainView;

    @FXML
    private AnchorPane formView;

    @FXML
    private AnchorPane listView;

    @FXML
    private ListView<Persona> listViewPersonas;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //que se ejecute la pagina principal
        this.SelectPanelVisible(0);

        // Insertar listeners de Focus textFields

        this.TFDni.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!this.validateDNI(TFDni.getText())) {
                    this.TFDni.setText("");
                    this.TFDni.setPromptText("Debe ingresar un dni correcto");
                    this.TFDni.getStyleClass().add("Error");
                    this.isDniValido = false;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }else {
                    this.TFDni.getStyleClass().remove("Error");
                    this.isDniValido = true;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }
            }else  {
                this.TFDni.getStyleClass().remove("Error");
                this.isDniValido = true;
                this.btnGuardar.setDisable(!this.isFormularioValido());
            }
        });

        this.TFNombre.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!this.validateName(TFNombre.getText())) {
                    this.TFNombre.setText("");
                    this.TFNombre.setPromptText("Debe ingresar un nombre correcto");
                    this.TFNombre.getStyleClass().add("Error");
                    this.isNombreValido = false;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }else {
                    this.TFNombre.getStyleClass().remove("Error");
                    this.isNombreValido = true;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }
            }else  {
                this.TFNombre.getStyleClass().remove("Error");
                this.isNombreValido = true;
                this.btnGuardar.setDisable(!this.isFormularioValido());

            }
        });

        this.TFApellido.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!this.validateName(TFApellido.getText())) {
                    this.TFApellido.setText("");
                    this.TFApellido.setPromptText("Debe ingresar un apellido correcto");
                    this.TFApellido.getStyleClass().add("Error");
                    this.isApellidoValido = false;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }else {
                    this.TFApellido.getStyleClass().remove("Error");
                    this.isApellidoValido = true;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }
            }else  {
                this.TFApellido.getStyleClass().remove("Error");
                this.isApellidoValido = true;
                this.btnGuardar.setDisable(!this.isFormularioValido());
            }
        });

        this.TFEmail.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!this.validateEmail(TFEmail.getText())) {
                    this.TFEmail.setText("");
                    this.TFEmail.setPromptText("Debe ingresar un email correcto");
                    this.TFEmail.getStyleClass().add("Error");
                    this.isEmailValido = false;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }else {
                    this.TFEmail.getStyleClass().remove("Error");
                    this.isEmailValido = true;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }
            }else  {
                this.TFEmail.getStyleClass().remove("Error");
                this.isEmailValido = true;
                this.btnGuardar.setDisable(!this.isFormularioValido());
            }
        });

        this.TFEdad.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!this.validateAge(TFEdad.getText())) {
                    this.TFEdad.setText("");
                    this.TFEdad.setPromptText("Debe ingresar una edad correcto");
                    this.TFEdad.getStyleClass().add("Error");
                    this.isEdadValido = false;
                    this.btnGuardar.setDisable(!this.isFormularioValido());

                }else {
                    this.TFEdad.getStyleClass().remove("Error");
                    this.isEdadValido = true;
                    this.btnGuardar.setDisable(!this.isFormularioValido());

                }
            }else  {
                this.TFEdad.getStyleClass().remove("Error");
                this.isEdadValido = true;
                this.btnGuardar.setDisable(!this.isFormularioValido());
            }
        });

        this.TFTelefono.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                if (!this.validateTelefono(TFTelefono.getText())) {
                    this.TFTelefono.setText("");
                    this.TFTelefono.setPromptText("Debe ingresar un telefono correcto");
                    this.TFTelefono.getStyleClass().add("Error");
                    this.isTelefonoValido = false;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }else {
                    this.TFTelefono.getStyleClass().remove("Error");
                    this.isTelefonoValido = true;
                    this.btnGuardar.setDisable(!this.isFormularioValido());
                }
            }else  {
                this.TFTelefono.getStyleClass().remove("Error");
                this.isTelefonoValido = true;
                this.btnGuardar.setDisable(!this.isFormularioValido());
            }
        });


    }



    //BOTONES main
    @FXML
    public void onbtnInserarClick(ActionEvent actionEvent) {
        this.SelectPanelVisible(1);
    }

    @FXML
    public void onbtnListadoClick(ActionEvent actionEvent) {
        this.SelectPanelVisible(2);
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
        this.SelectPanelVisible(0);
        this.clearTFCamps();
    }

    public void onbtnGuardarClick(ActionEvent actionEvent) {

        try {
            this.pp = Persona.builder()
                    .dni(this.TFDni.getText())
                    .name(this.TFNombre.getText())
                    .surname(this.TFApellido.getText())
                    .email(this.TFEmail.getText())
                    .age(Integer.parseInt(this.TFEdad.getText()))
                    .phone(this.TFTelefono.getText())
                    .build();
            if (SQLAccessPersona.createPersona(pp)) {
                this.clearTFCamps();
                this.formView.setVisible(false);
                this.MainView.setVisible(true);
            }
        } catch (NumberFormatException e) {
            this.TFEdad.setText("");
            this.TFEdad.setPromptText("Introduce un numero");
        } catch (Exception e) {
            System.err.println("Error al guardar");
        }
    }

    private void clearTFCamps() {
        this.TFDni.setText("");
        this.TFNombre.setText("");
        this.TFApellido.setText("");
        this.TFEmail.setText("");
        this.TFEdad.setText("");
        this.TFTelefono.setText("");

        this.TFDni.setPromptText("12345678T");
        this.TFNombre.setPromptText("Miguel");
        this.TFApellido.setPromptText("Fernandez");
        this.TFEmail.setPromptText("miguel@example.com");
        this.TFEdad.setPromptText("años");
        this.TFTelefono.setPromptText("123456789");

        this.TFDni.getStyleClass().remove("error");
        this.TFNombre.getStyleClass().remove("error");
        this.TFApellido.getStyleClass().remove("error");
        this.TFEmail.getStyleClass().remove("error");
        this.TFEdad.getStyleClass().remove("error");
        this.TFTelefono.getStyleClass().remove("error");
    }

    private boolean isFormularioValido(){
        return (isDniValido && isNombreValido && isApellidoValido
                && isEmailValido && isEdadValido && isTelefonoValido);
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




    private boolean validateDNI(String dni) {
        return dni.matches("^[0-9]{8}[A-Za-z]$");
    }

    private boolean validateAge(String age) {
        return age.matches("[1-9]{1,3}");
    }

    private boolean validateEmail(String email) {
        return email.matches("^[a-z0-9_.-]+@[a-z]+\\.[a-z]{2,4}$");
    }

    private boolean validateTelefono(String telefono) {
        return telefono.matches("[1-9]{9}");
    }

    private boolean validateName(String name) {
        return (name.length() >= 3);
    }

    private void SelectPanelVisible(int Panel){
        switch (Panel){
            case 0: //Ver panel principal
                this.MainView.setVisible(true);
                this.formView.setVisible(false);
                this.listView.setVisible(false);
                break;
            case 1: //Insert
                this.formView.setVisible(true);
                this.listView.setVisible(false);
                this.MainView.setVisible(false);
                break;
            case 2: //List
                this.listView.setVisible(true);
                this.formView.setVisible(false);
                this.MainView.setVisible(false);
                break;
            case 3: //busqueda (despues)
                this.formView.setVisible(false);
                this.listView.setVisible(false);
                this.MainView.setVisible(false);
                break;
            default:
                this.MainView.setVisible(true);
                this.formView.setVisible(false);
                this.listView.setVisible(false);
        }
    }





    //List

    @FXML
    public void onbtnEditarListClick(ActionEvent actionEvent) {
    }
    @FXML
    public void onbtnEliminarListClick(ActionEvent actionEvent) {
    }
    @FXML
    public void onbtnCancelarListClick(ActionEvent actionEvent) {
        this.SelectPanelVisible(0);

    }




}