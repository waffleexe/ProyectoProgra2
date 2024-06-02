package presentation;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;
import javafx.stage.Stage;

public class GUI {
	/*private Scene myScene;
	private Pane pcontainer;
	private Label lSize;
	private Label lSizec;
	private TextField tfSize;
	private TextField tfSizec;
	private Button bCreate;
	private GridPane gpMatrix;
	private Button buttonMatrix[][];
	public GUI() {
		setLSize("Pisos");
		setTfSize();
		setLSizec("Habitaciones");
		setTfSizec();
		setBCreate("Crear");
		setPContainer();
		setMyScene(pcontainer);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Matriz de componente");
		primaryStage.setMinHeight(400);
		primaryStage.setMinWidth(500);
		primaryStage.setScene(getMyScene());
		primaryStage.show();
		
	}
	public void setMyScene(Pane container) {
		this.myScene= new Scene(container);
	}
	public Scene getMyScene() {
		return this.myScene;
	}
	public void setPContainer() {
		this.pcontainer = new Pane();
		this.pcontainer.getChildren().add(lSize);
		this.pcontainer.getChildren().add(tfSize);
		this.pcontainer.getChildren().add(lSizec);
		this.pcontainer.getChildren().add(tfSizec);
		this.pcontainer.getChildren().add(bCreate);
		//this.pcontainer.getChildren().add(createBuilding);
	}
	public Pane getPcontainer() {
		return this.pcontainer;
	}
	public void setLSize(String nameTicket) {
		this.lSize = new Label();
		this.lSize.setText(nameTicket);
		this.lSize.setPrefSize(100, 20);
		this.lSize.setTranslateX(35);
		this.lSize.setTranslateY(20);
	}
	public Label getLSize() {
		return this.lSize;
	}
	public void setTfSize() {
		this.tfSize = new TextField();
		this.tfSize.setPrefSize(100, 20);		
		this.tfSize.setTranslateX(65);		
		this.tfSize.setTranslateY(20);		
	}
	public TextField getTfSize() {
		return this.tfSize;
	}
	
	public void setLSizec(String nameT) {
		this.lSizec = new Label();
		this.lSizec.setText(nameT);
		this.lSizec.setPrefSize(100, 20);
		this.lSizec.setTranslateX(180);
		this.lSizec.setTranslateY(20);
	}
	public Label getLSizec() {
		return this.lSizec;
	}
	public void setTfSizec() {
		this.tfSizec = new TextField();
		this.tfSizec.setPrefSize(100, 20);		
		this.tfSizec.setTranslateX(250);		
		this.tfSizec.setTranslateY(20);		
	}
	public TextField getTfSizec() {
		return this.tfSizec;
	}
	
	public void setBCreate(String name) {
		this.bCreate = new Button();
		this.bCreate.setPrefSize(70, 20);
		this.bCreate.setTranslateX(400);
		this.bCreate.setTranslateY(20);
	}
	public Button getBCreate() {
		return this.bCreate;
	}
	
	public void setCreateButtonMatrix(int crows, int columns) {
		this.buttonMatrix = new Button[crows][columns];
		if(crows >= 3 && crows <= 5) {
			if(columns > 2 && columns <= 4) {
				for (int i = 0 ; i< crows;i++) {
					for(int j= 0 ; j< columns; j++) {
						buttonMatrix[i][j] = new Button();
						buttonMatrix[i][j].setPrefSize(50, 50);
					}
				}
			}else {
				this.notify("No es la cantidad de pisos adecuada");
			}
		}else {
			this.notify("No es la cantidad de habitaciones adecuadas");
		}
	}
	
	public Button[][] getButtonMatrix() {
		return this.buttonMatrix;
	}
	
public void setPgMatrix(Button buttonMatrix[][]) {
		//Contenedor para organizar la matriz
		this.gpMatrix = new GridPane(buttonMatrix.length,buttonMatrix[0].length);
		gpMatrix.setPrefSize(100, 260);
		gpMatrix.setTranslateX(20);
		gpMatrix.setTranslateY(60);
		
		
		for(int i=0;i<buttonMatrix.length;i++) {
			for(int j=0; j < buttonMatrix[0].length; j++) {
				gpMatrix.add(buttonMatrix[i][j], i, j);
			}
		}
	}

	public GridPane getGpMatrix() {
	return this.gpMatrix;
}
	public void notify(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	*/
	public int getValue(String message) {//Patra llenar el XML de el tablero
		 
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Ingrese un numero", JOptionPane.QUESTION_MESSAGE));
		return number;
	 }
}
