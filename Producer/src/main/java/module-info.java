module org.Producer {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.Producer to javafx.fxml;
    exports org.Producer;
}