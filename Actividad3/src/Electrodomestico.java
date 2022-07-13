
public class Electrodomestico {
		
	protected double precio;
	protected String color;
	protected char consumo;
	protected double peso;
	
	public Electrodomestico() {
		this.precio = 100;
		this.color = "blanco";
		this.consumo = 'F';
		this.peso = 5;
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.color = "blanco";
		this.consumo = 'F';
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		if (validarColor(color)) {
			this.color = color;
		}else {
			this.color = "blanco";
		}
		if (validarConsumo(consumo)) {
			this.consumo = consumo;
		}else {
			this.consumo = 'F';
		}
		this.peso = peso;
	}
	
	public boolean validarColor (String color) {
		boolean valido = false;

		int i = 0;
		String[] colores = {"blanco","negro","rojo","azul","gris"};
		while (i < colores.length && !valido) {
			if (colores[i].equals(color.toLowerCase())) {
				valido = true;
			}
			i++;
		}
		return valido;
	}
	
	public boolean validarConsumo (char consumo) {
		boolean valido = false;
		int i = 0;
		
		String consum = "ABCDF";
		while (i < consum.length()) {
			if (consum.charAt(i) == consumo) {
				valido = true;
			}
			i++;
		}
		return valido;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
				+ "]";
	}
	
	
	
	
}
