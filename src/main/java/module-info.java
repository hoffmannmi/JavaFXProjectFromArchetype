module de.pta.programming.edu {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.pta.programming.edu to javafx.fxml;
    exports de.pta.programming.edu;
}