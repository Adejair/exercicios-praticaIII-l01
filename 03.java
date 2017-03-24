import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner readScanner = new Scanner(System.in);

		int quantidadePessoas = 0, idade, idadeAcumulador = 0;
		Double mediaIdade = 0.0, porcentagem = 0.0;

		int[] questoes = {0, 0, 0, 0, 0};

		do {
			int opcao;

			System.out.println("Digite sua idade\n");
			idade = readScanner.nextInt();

			// Para não terminar o questionario;
			if(idade == 0)
				break;

			do {
				System.out.println("1 - Muito ruim");
				System.out.println("2 - Ruim");
				System.out.println("3 - Normal");
				System.out.println("4 - Bom");
				System.out.println("5 - Ótimo");

				opcao = readScanner.nextInt();
			} while(opcao > 5 || opcao < 1);

			++questoes[opcao - 1];
			++quantidadePessoas;
			idadeAcumulador += idade;
		} while(idade != 0);

		mediaIdade = idadeAcumulador / (double)quantidadePessoas;

		System.out.println(quantidadePessoas + " responderam ao questionario");
		System.out.println(mediaIdade + " media da idade das pessoas");

		for(int i = 0; i != 5; ++i) {
			System.out.println((i + 1) + " - Porcentagem  - " + (100 * questoes[i]) / quantidadePessoas + "%");
		}

	}
}