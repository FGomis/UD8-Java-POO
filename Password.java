
public class Password {
	
//	Constante que indica la longitud por defecto
	private final int LONGITUD = 8;
	
//	Atributos
	private int longitud;
	
	private String contraseña;

//	Constructor por defecto
	public Password() {
		this.longitud = LONGITUD;
		this.contraseña = "";
	}
	
//	Constructor con atributos
	public Password(int longitud) {
		
		this.longitud = longitud;
		this.contraseña = crearPassword(longitud);
		}
	
//	Método que genera una contraseña aleatoria de una longitud determinada que pasamos como atributo
	public String crearPassword(int longitud) {
		int min = 97;
		int max = 122;
		String pass = "";
		for (int i = 0; i < longitud; i++) {
			pass += (char) (Math.random() * (max - min) + min);
		}	
		return pass;
	}

//	Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

//	Método toString
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
}

