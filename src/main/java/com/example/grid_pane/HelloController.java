package com.example.grid_pane;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField Jmeno;
    private TextField Prijmeni;
    private TextField Login;
    private TextField Heslo;
    private ColorPicker OblibenaBarva;
    private DatePicker DatumNarozeni;
    private TextArea Vypis;

    @FXML
    protected void onRegistreButtonClick() {
        Vypis.setText("Jmeno:"+Jmeno.getText());
    }
}