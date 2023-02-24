module com.hiramchavez.conversor.conversor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.hiramchavez.conversor.controlador to javafx.fxml;
    exports com.hiramchavez.conversor;
}