module com.example.grid_pane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.grid_pane to javafx.fxml;
    exports com.example.grid_pane;
}