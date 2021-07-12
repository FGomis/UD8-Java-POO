
public class Serie {
	
//	Constantes
	private int NUMTEMPORADAS = 3;
	
	private boolean ENTREGADO = false;
	
//	Atributos
	private String titulo;
	
	private int numTemporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;

//	Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}
	
//	Constructor con título y creador como atributos pasados
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}
	
//	Constructor al que le pasamos todos los atributos menos entregado
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

//	Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

//	Método toString
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	

}
