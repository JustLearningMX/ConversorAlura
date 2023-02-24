package com.hiramchavez.conversor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/hiramchavez/conversor/vista/Conversor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 450);
        scene.getStylesheets().add(getClass().getResource("/com/hiramchavez/conversor/vista/application.css").toExternalForm());
        stage.setTitle("Conversor Alura");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}