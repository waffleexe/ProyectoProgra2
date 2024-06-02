module clase {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.graphics;
	
	opens business to javafx.graphics, javafx.fxml;
}