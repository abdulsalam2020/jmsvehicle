module org.Consumer {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.Consumer to javafx.fxml;
    exports org.Consumer;
}