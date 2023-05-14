module com.example.busbookingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.busbookingsystem to javafx.fxml;
    exports com.example.busbookingsystem;
}