
public class Persona {

	public static final Integer DESNUTRICION = -1;
	public static final Integer NORMAL = 0;
	public static final Integer SOBREPESO = 1;

	public static final Integer MAYOR_EDAD = 18;

	public static final Character HOMBRE = 'H';
	public static final Character MUJER = 'M';

	public static final Integer DNI_LENGTH = 8;

	public static final Double MIN_IMC_IDEAL = 18.5;
	public static final Double MAX_IMC_IDEAL = 25.0;

	private String nombre;
	private Integer edad;
	private String dni;
	private Character sexo;
	private Double peso;
	private Double altura;


	public Persona(){
		this.nombre = "";
		this.edad = 0;
		this.dni = generaDni();
		this.sexo = HOMBRE;
		this.altura = 0.0;
		this.peso = 0.0;
	}

	public Persona(String nombre, Integer edad, Character sexo){
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;

	}

	public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura){
		this(nombre, edad, sexo);
		this.peso = peso;
		this.altura = altura;
	}

	public Integer calcularIMC(){
		Double imc = this.peso / Math.pow(this.altura, 2);

		if (imc < MIN_IMC_IDEAL) {
			return DESNUTRICION;
		}

		if (imc >= MAX_IMC_IDEAL) {
			return SOBREPESO;
		}

		return NORMAL;
	}

	public Boolean esMayorDeEdad(){
		return this.edad >= MAYOR_EDAD;
	}

	private Boolean comprobarSexo(Character sexo){
		return Character.toUpperCase(sexo) == HOMBRE || Character.toUpperCase(sexo) == MUJER;
	}

	private String generaDni(){
		String numbers = "";

		for (int i=0; i< DNI_LENGTH ; i++) {
			numbers += (int)(Math.random()*10);
		}
		return numbers;
	}

	public String getNombre(){
		return this.nombre;
	}

	public Integer getEdad(){
		return this.edad;
	}

	public String getDni(){
		return this.dni;
	}

	public Character getSexo(){
		return this.sexo;
	}

	private Double getPeso(){
		return this.peso;
	}

	private Double getAltura(){
		return this.altura;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setEdad(Integer edad){
		this.edad = edad;
	}

	public void setSexo(Character sexo){
		if(comprobarSexo(sexo)){
			this.sexo = sexo;
		} else {
			this.sexo = HOMBRE;
		}
	}

	public void setPeso(Double peso){
		this.peso = peso;
	}

	public void setAltura(Double altura){
		this.altura = altura;
	}

	public String toString(){
		return "{Nombre: " + this.nombre + ", Edad: " + this.edad + 
				", DNI: " + this.dni + ", Sexo: " + this.sexo + 
				", Peso: " + this.peso + ", Altura: " + this.altura  + " }";
	}

}