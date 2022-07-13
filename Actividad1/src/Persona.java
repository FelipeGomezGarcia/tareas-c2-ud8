
public class Persona {
	private final char GENERO = 'M';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = GENERO;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, String dni, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
}
