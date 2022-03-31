module com.example.stage2go {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stage2go to javafx.fxml;
    exports com.example.stage2go;
}