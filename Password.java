
public class Password {
	
//	Constante que indica la longitud por defecto
	private final int LONGITUD = 8;
	
//	Atributos
	private int longitud;
	
	private String contrase�a;

//	Constructor por defecto
	public Password() {
		this.longitud = LONGITUD;
		this.contrase�a = "";
	}
	
//	Constructor con atributos
	public Password(int longitud) {
		
		this.longitud = longitud;
		this.contrase�a = crearPassword(longitud);
		}
	
//	M�todo que genera una contrase�a aleatoria de una longitud determinada que pasamos como atributo
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

//	M�todo toString
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	
}

