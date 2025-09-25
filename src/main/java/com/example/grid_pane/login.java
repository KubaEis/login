package com.example.grid_pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class login extends Application {
    @Override
    public void start(Stage stage) throws IOException {



        GridPane root = new GridPane();
        Label nadpis = new Label("Formular pro regidtraci novaho uzivatele");
        Label lbl1 = new Label("Jmeno:");
        Label lbl2 = new Label("Prijmeni:");
        Label lbl3 = new Label("Datum narozeni:");
        Label lbl4 = new Label("Oblibena barva:");
        Label lbl5 = new Label("Login:");
        Label lbl6 = new Label("Heslo:");
        Button btn = new Button("");
        ColorPicker barva = new ColorPicker();
        DatePicker date = new DatePicker();
        TextField Login = new TextField();
        TextField JmenoT = new TextField();
        TextField PrijmeniT = new TextField();
        PasswordField heslo  = new PasswordField();
        root.add(lbl1, 0, 1);
        root.add(JmenoT, 1, 1);
        root.add(lbl2, 2, 1);
        root.add(PrijmeniT, 3, 1);
        root.add(lbl3, 0, 2);
        root.add(date, 1, 2);
        root.add(lbl4, 2, 2);
        root.add(barva, 3, 2);
        root.add(lbl5, 0, 3);
        root.add(Login, 1, 3);
        root.add(lbl6, 2, 3);
        root.add(heslo, 3, 3);

        Label jazyky = new Label("Jazyky ktere ovladas:");
        CheckBox aj = new CheckBox("Anglictina");
        CheckBox cj = new CheckBox("Cestina");
        CheckBox nj = new CheckBox("Nemcina");
        CheckBox sp = new CheckBox("Spanelstina");
        HBox hb = new HBox(jazyky, aj, cj, nj, sp);

        RadioButton yes = new RadioButton("Yes");
        RadioButton no = new RadioButton("No");
        ToggleGroup group = new ToggleGroup();
        yes.setToggleGroup(group);
        no.setToggleGroup(group);
        Label souhlas = new Label("Souhlas s podminkami:");
        HBox hb1 = new HBox(souhlas, yes, no);

        TextArea poznamky = new TextArea("Prostor pro poznamky");

        Label podekovani = new Label("Dekujeme vam za registraci do sistemu");

        VBox vb = new VBox(nadpis, root, hb, hb1, poznamky, podekovani);

        Scene scene = new Scene(vb , 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}