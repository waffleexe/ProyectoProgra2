package domain;

public class BoardGame {
	private int edificios;
	private int arboles;
	private int aliens;
	private int zombies;
	private int humanos;
	private int pocima;
	
	public BoardGame() {}
	
	public BoardGame(int edificios, int arboles, int aliens, int zombies, int humanos, int pocima) {
		this.edificios = edificios;
		this.arboles = arboles;
		this.aliens = aliens;
		this.zombies = zombies;
		this.humanos = humanos;
		this.pocima = pocima;
	}
	public int getEdificios() {
		return edificios;
	}
	public void setEdificios(int edificios) {
		this.edificios = edificios;
	}
	public int getArboles() {
		return arboles;
	}
	public void setArboles(int arboles) {
		this.arboles = arboles;
	}
	public int getAliens() {
		return aliens;
	}
	public void setAliens(int aliens) {
		this.aliens = aliens;
	}
	public int getZombies() {
		return zombies;
	}
	public void setZombies(int zombies) {
		this.zombies = zombies;
	}
	public int getHumanos() {
		return humanos;
	}
	public void setHumanos(int humanos) {
		this.humanos = humanos;
	}
	
	public int getPocima() {
		return pocima;
	}
	public void setPocima(int pocima) {
		this.pocima = pocima;
	}
public String[] getDataName() {
		
		String dataName[] = {"Edificios", "Arboles", "Aliens","Zombies","Humanos","Pocimas"};
		
		return dataName;
	}
	
	public String[] getData() {
		
		String data[] = { String.valueOf(this.edificios),String.valueOf(this.arboles),String.valueOf(this.aliens),String.valueOf(this.zombies),String.valueOf(this.humanos),String.valueOf(this.pocima)};
		
		return data;
	}
	@Override
	public String toString() {
		return " La ciudad posee" + edificios + " edifios\n"+
				"La ciudad posee "+ arboles+ " arboles\n"+
				"La ciudad posee "+ aliens+ " aliens\n"+
				"La ciudad posee "+zombies+" zombies\n"+
				"La ciudad posee "+ humanos+ "humanos\n"+
				"La ciudad posee "+pocima+ " pocimas\n";
	}
				
				
}

