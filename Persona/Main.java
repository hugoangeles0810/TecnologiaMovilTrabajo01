
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input;
		String nombre;
		Integer edad;
		Character sexo;
		Double peso, altura;

		input = new Scanner(System.in);

		System.out.print("Nombre: ");
		nombre = input.nextLine();

		System.out.print("Edad: ");
		edad = input.nextInt();

		System.out.print("Sexo (H/M): ");
		sexo = input.next().charAt(0);

		System.out.print("Peso: ");
		peso = input.nextDouble();

		System.out.print("Altura: ");
		altura = input.nextDouble();

		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona();
		persona2.setPeso(68.9);
		persona2.setAltura(1.90);

		persona3.setNombre("Juan");
		persona3.setEdad(40);
		persona3.setSexo('H');
		persona3.setPeso(79.9);
		persona3.setAltura(1.72);

		Persona[] personas  = {persona1, persona2, persona3};
		for (int i=0; i < personas.length ; i++ ) {
			Integer p = personas[i].calcularIMC();
			String estado = "";

			if (p == Persona.DESNUTRICION) {
				estado = "DESNUTRICION";
			} else if (p == Persona.SOBREPESO) {
				estado = "SOBREPESO";
			} else {
				estado = "NORMAL";
			}

			System.out.println("-------------------------------------------");
			System.out.println("Persona " + (i+1));
			System.out.println("-------------------------------------------");
			System.out.println("Mayor de edad: "  
				+ (personas[i].esMayorDeEdad()? "SI" : "NO"));
			System.out.println("Peso: " + estado);
			System.out.println(personas[i]);
		}
	}

}