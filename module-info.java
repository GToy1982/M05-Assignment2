module com.colorchange {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.colorchange to javafx.fxml;
    exports com.colorchange;
}
