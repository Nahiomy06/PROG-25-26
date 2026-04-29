module me.apppersonasfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens me.apppersonasfx to javafx.fxml;
    exports me.apppersonasfx;
}