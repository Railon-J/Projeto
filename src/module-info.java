module Projeto {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires java.desktop;
	requires java.xml;
	requires javafx.base;

    opens view to javafx.fxml;

    exports view;
    exports application;
}
