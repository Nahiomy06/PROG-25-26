module org.example.javafxej1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxej1 to javafx.fxml;
    exports org.example.javafxej1;
}