
public class Actividad1App {
	public static void main (String[] args) {
		
		Persona p1 = new Persona();
		
		System.out.println(p1);
		
		Persona p2 = new Persona("Felipe Gomez", 24, "12345678C", 'M');
		
		System.out.println(p2);
		
		Persona p3 = new Persona("David", 59, "87654321T", 'M', 75.6, 1.79);
		
		System.out.println(p3);
	}
}
