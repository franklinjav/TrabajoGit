module com.example.trabajogit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabajogit to javafx.fxml;
    exports com.example.trabajogit;
}