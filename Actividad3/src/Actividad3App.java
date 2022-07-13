
public class Actividad3App {
	public static void main (String[] args) {
		
		Electrodomestico e1 = new Electrodomestico();
		
		System.out.println(e1);
		
		Electrodomestico e2 = new Electrodomestico(1200, 35);
		
		System.out.println(e2);
		
		Electrodomestico e3 = new Electrodomestico(800, "gris", 'g', 40);
		
		System.out.println(e3);
	}
}
