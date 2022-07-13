
public class Password {
	
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}
	
	public String generarContraseña(int longitud) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String pwd = "";
		
		for (int i = 0; i < longitud; i++) {
			pwd += chars.charAt((int)(Math.random()*chars.length()));
		}
		
		return pwd;
	}

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

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	
}
