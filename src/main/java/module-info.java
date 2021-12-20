module com.example.fileparser {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.fileparser to javafx.fxml;
    exports com.example.fileparser;
}