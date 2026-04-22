module me.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.demo to javafx.fxml;
    exports me.demo;
}