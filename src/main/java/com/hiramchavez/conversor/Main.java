package com.hiramchavez.conversor;

import com.hiramchavez.conversor.controlador.ConversorController;
import com.hiramchavez.conversor.controlador.CurrencyController;
import com.hiramchavez.conversor.controlador.TemperatureController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/hiramchavez/conversor/vista/Conversor.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("/com/hiramchavez/conversor/vista/application.css").toExternalForm());
        stage.setTitle("Conversor Alura");
        stage.setScene(scene);
        ConversorController controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}