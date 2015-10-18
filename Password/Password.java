
public class Password {

	public static final Integer LONGITUD = 8;

	public static final Integer MAYUSCULAS = 2;
	public static final Integer MINUSCULAS = 1;
	public static final Integer DIGITOS = 5;

	private static final String VALUES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";


	private Integer longitud;
	private String contrasena;

	public Password() {
		this.longitud = LONGITUD;
		generarPassword();
	}

	public Password(Integer longitud){
		this.longitud = longitud;
		generarPassword();
	}

	public Boolean esFuerte(){
		int mayusculas, minusculas, digitos;
		mayusculas = minusculas = digitos = 0;

		int size = this.contrasena.length();
		for (int i=0; i<size ; i++) {
			char car = this.contrasena.charAt(i);

			if (Character.isDigit(car)) {
				digitos++;
			} else if (Character.isLowerCase(car)) {
				minusculas++;
			} else {	
				mayusculas++;
			}
		}
		return mayusculas > MAYUSCULAS && minusculas > MINUSCULAS && digitos > DIGITOS;
	}

	public void generarPassword(){
		StringBuilder pass = new StringBuilder("");
		for (int i=0; i<this.longitud; i++) {
			int which = (int)(Math.random()*(VALUES.length()-1));
			pass.append(VALUES.charAt(which));
		}

		this.contrasena = pass.toString();
	}

	public Integer getLongitud(){
		return this.longitud;
	}

	public String getContrasena(){
		return this.contrasena;
	}

	public void setLongitud(Integer longitud){
		this.longitud = longitud;
	}

}