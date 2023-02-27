package com.hiramchavez.conversor.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ConversorController {
    private Stage stage;

    @FXML
    private Button btnCurrency;

    @FXML
    private Button btnTemperature;

    @FXML
    void showWindowCurrency(ActionEvent event) throws IOException {
        this.stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/hiramchavez/conversor/vista/Currency.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        CurrencyController controller = fxmlLoader.getController();
        Stage stage = new Stage();
        stage.setTitle("Convertir monedas");
        stage.setScene(scene);
        controller.init(stage, this);
        stage.show();
    }

    @FXML
    void showWindowTemperature(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/hiramchavez/conversor/vista/Temperature.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        TemperatureController controller = fxmlLoader.getController();
        Stage stage = new Stage();
        stage.setTitle("Convertir temperaturas");
        stage.setScene(scene);
        controller.init(stage, this);
        stage.show();
        this.stage.close();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}

