package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el precio del articulo");
		float precio = scanner.nextFloat();
		
		System.out.println("Introduce la cantida del articulo");
		float cantidad = scanner.nextFloat();
		
		float total = scanner.nextFloat();
		
		System.out.println("El precio total0" + total);
	}

}
