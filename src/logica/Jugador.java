package logica;

public class Jugador {

	private Genero genero;
	private int resistencia;
	private int experiencia;
	private int suerte;
	
	public Jugador(Genero genero, int resistencia, int experiencia, int suerte) {
		super();
		this.genero = genero;
		this.resistencia = resistencia;
		this.experiencia = experiencia;
		this.suerte = suerte;
	}
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getSuerte() {
		return suerte;
	}

	public void setSuerte(int suerte) {
		this.suerte = suerte;
	}

	@Override
	public String toString() {
		return "Jugador [genero=" + genero + ", resistencia=" + resistencia + ", experiencia=" + experiencia
				+ ", suerte=" + suerte + "]";
	}
	
}
