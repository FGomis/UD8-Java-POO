
public class Electrodomestico {
	
//	Constantes para el constructor por defecto
	private final float PRECIOBASE = 100;
	
	private final String COLOR = "blanco";
	
	private final char CONSUMOENERGETICO = 'F';
	
	private final float PESO = 5;
	
	
//	Atributos
	private float precioBase;
	
	private String color;
	
	private char consumoEnergetico;
	
	private float peso;

//	Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}
	
//	Constructor al que pasamos los atributos de precio y peso
	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = peso;
	}
	
//	Constructor al que pasamos todos los atributos
	public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
		this.precioBase = precioBase;
		this.color = filtroColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
//	Método para filtrar color
	public static String filtroColor(String color) {
//		String con todos los colores disponibles
		String[] colores = {"blanco", "negro", "azul", "gris"};
		for (int i = 0; i < colores.length; i++) {
//			Comparamos el input con los colores disponibles en el array, si coinciden devolvemos el input original
			if(color.toLowerCase().equals(colores[i])) {
				return color;
			}
		}
//		En caso de no coincidir ninguno devolvemos el color por defecto
		return "blanco";
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
