package business;

import javafx.application.Application;
import presentation.GUI;

import javafx.stage.Stage;

public class Main extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GUI gui = new GUI();
		//gui.start(primaryStage);
		
		Controller control = new Controller(gui);
		
		control.generateBoard();
	}
	public static void main(String[] args) {
		
		launch(args);
		//caca
		//ASADFGHJKL;
		//porwque no me ensenas nada mierda
	}

	
}