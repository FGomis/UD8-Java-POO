
public class Persona {
	
//	Constante que indica el sexo por defecto
	private final char SEXO = 'H';
	
//	Atributos
	private String nombre;
	
	private int edad;
	
	private String dni;
	
	private char sexo;
	
	private int peso;
	
	private int altura;

//	Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
	}
	
//	Constructor al que pasamos los atributos de nombre, edad y sexo
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

//	Constructor al que pasamos todos los atributos
	public Persona(String nombre, int edad, String dni, char sexo, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
//	Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

//	Método toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}


}
