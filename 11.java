import java.util.Scanner;

class App {
	public static double celcius(double f) {
		return (f - 32) / 1.8;
	}

	public static void main(String[] args) {
		Scanner readScanner = new Scanner(System.in);

		System.out.println("Valor para variar ate: ");
		int n = readScanner.nextInt();


		for(int i = 0; i != n; ++i) {
			System.out.println(celcius(i));
		}
	}
}