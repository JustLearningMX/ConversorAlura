package com.hiramchavez.conversor.controlador;

import com.hiramchavez.conversor.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class TemperatureController {
    private ConversorController conversorController;
    private Stage stage;

    @FXML
    private Button btnConvertTemperature;

    @FXML
    private Button btnReturn;

    @FXML
    private ComboBox<?> cbxTemperature1;

    @FXML
    private ComboBox<?> cbxTemperature2;

    @FXML
    private TextField inputTemperature;

    @FXML
    private Label txtResult;

    @FXML
    void convertCurrency(ActionEvent event) {

    }

    @FXML
    void showMenu(ActionEvent event) throws IOException {
        this.stage.close();
        Stage stageMain = new Stage();
        Main main = new Main();
        main.start(stageMain);
    }

    public void init(Stage stage, ConversorController conversorController) {
        this.stage = stage;
        this.conversorController = conversorController;
    }

}