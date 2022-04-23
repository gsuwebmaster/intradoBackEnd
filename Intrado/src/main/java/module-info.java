module com.intrado.intrado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.intrado.intrado to javafx.fxml;
    exports com.intrado.intrado;
}