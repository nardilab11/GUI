/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class InterfazGráfica extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Number 1");
        Button button2 = new Button("Number 2");
        Label label1 = new Label("Prueba");
        Label label3 = new Label("Ok");
        Label label4 = new Label("Cancelar");
        Label label5 = new Label("Salir");
        FileInputStream input = null;
        try {
            input = new FileInputStream("resources/images/ejemplo.png");
        } catch (FileNotFoundException ex) {
            System.out.println("  ");
        }
        Image image = new Image(input);
        Label label2 = new Label("Search", new ImageView(image));
        TextField textfield = new TextField();
        VBox vbox = new VBox(label1, button1);
        HBox hbox = new HBox(label3, label2, label5);
        vbox.getChildren().add(hbox);
        vbox.getChildren().add(button2);
        vbox.getChildren().add(textfield);
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new TextField(), 2, 0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        pane.add(new TextField(), 0, 3, 3, 1);
        // Este TextField ocupa 3 columnas, no se expande hacia abajo porque es texto, en otros sí se puede
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        BorderPane root = new BorderPane();
        root.setTop(new Button("Top"));
        root.setRight(new Button("Right"));
        root.setBottom(new Button("Bottom"));
        root.setLeft(new Button("Left"));
        root.setCenter(new Button("Center"));

        Scene scene = new Scene(root, 200, 250);
        // contenedor, dimensiones; el boton ocupa toda la escena, es el contenedor.
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
