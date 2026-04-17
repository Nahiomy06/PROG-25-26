module me.fruitmarket {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.fruitmarket to javafx.fxml;
    exports me.fruitmarket;
    exports me.fruitmarket.Controllers;
    opens me.fruitmarket.Controllers to javafx.fxml;
}