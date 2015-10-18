
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input;
		Integer longitudBucle;
		Integer longitudPassword;
		Password[] contrasenas;
		Boolean[] results;
		input = new Scanner(System.in);

		System.out.print("Longitud del bucle: ");
		longitudBucle = input.nextInt();
		System.out.print("Longitud de contraseña: ");
		longitudPassword = input.nextInt();

		contrasenas = new Password[longitudBucle];
		results = new Boolean[longitudBucle];

		System.out.println("--------------------------------------------");
		System.out.println("Contraseñas");
		System.out.println("--------------------------------------------");
		for (int i=0; i < longitudBucle ; i++) {
			contrasenas[i] = new Password(longitudPassword);
			results[i] = contrasenas[i].esFuerte();
			System.out.println(contrasenas[i].getContrasena() + "\t" + (results[i] ? "SI" : "NO"));
		}

	}

}