module org.example.hethongbanve.n4advancejava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.hethongbanve.n4advancejava to javafx.fxml;
    exports org.example.hethongbanve.n4advancejava;
}