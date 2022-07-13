
public class Actividad2App {
	public static void main (String[] args) {
		
		Password p1 =new Password(10);
		
		System.out.println(p1);
		
		Password p2 = new Password();
		String pwd = p2.generarContraseña(p2.getLongitud());
		p2.setContraseña(pwd);
		System.out.println(p2);
		
	}
}
