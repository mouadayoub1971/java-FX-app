module com.example.brocode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocode to javafx.fxml;
    exports com.example.brocode;
}