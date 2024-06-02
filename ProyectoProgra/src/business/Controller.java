package business;
import domain.BoardGame;
import presentation.GUI;
import data.FilesXML;
public class Controller {
	private BoardGame board;
	private GUI gui;
	private FilesXML files;
	public Controller(GUI gui) {
		this.gui= gui;
		this.files= new FilesXML();
	}
	
	public void generateBoard() {
		int edificios = gui.getValue("Numero de Edificios:");
		int arboles = gui.getValue("Numeo de arboles");
		int aliens = gui.getValue("Numero de Aliens");
		int zombies = gui.getValue("Numero de zombies");
		int humanos = gui.getValue("Ingrese humanos");
		int pocima= gui.getValue("Ingrese pocima");
		this.board= new BoardGame(edificios,arboles,aliens,zombies,humanos,pocima);
		files.createXML("BoardGame", "Document Descripcion de ciudad.xml");
		files.writeXML("Document Descripcion de ciudad.xml", "BoardGame",board.getDataName(),board.getData());
		
	}

}
