import java.util.Scanner;

public class CalculadoraMain {

	public void showMenu() {

		Scanner scan = new Scanner(System.in);
		Operacoes calc = new Operacoes();

		int option = 0;

		do {
			System.out.println();
			System.out.println("--- Calculator ---");
			System.out.println("  1. Sum two numbers.");
			System.out.println("  2. Subtract two numbers.");
			System.out
					.println("  3. Multiply two numbers.");
			System.out
					.println("  4. Quotient two numbers.");

			System.out.println("  5. Quit");
			System.out.println("------------------------------");
			System.out.println("Type the option:");
			option = scan.nextInt();

			switch (option) {
			case 1: {
				System.out.print("Type the first number:");
				int a = scan.nextInt();
				System.out.print("Type the second number:");
				int b = scan.nextInt();
				System.out.println(a + "+" + b + "=" + calc.soma(a, b));
				break;

			}
			case 2: {

				System.out.print("Type the first number:");
				int a = scan.nextInt();
				System.out.print("Type the second number:");
				int b = scan.nextInt();
				System.out.println(a + "-" + b + "=" + calc.subtracao(a, b));
				break;
			}
			case 3: {
				System.out.print("Type the first number:");
				int a = scan.nextInt();
				System.out.print("Type the second number:");
				int b = scan.nextInt();
				System.out.println(a + "*" + b + "=" + calc.multiplicacao(a, b));
				break;
			}

			case 4: {
				System.out.print("Type the first number:");
				int a = scan.nextInt();
				System.out.print("Type the second number:");
				int b = scan.nextInt();
				System.out.println(a + "/" + b + "=" + calc.divisao(a, b));
				break;
			}
			
			case 5: {
				break;
			}
			}
		} while (option != 5);
	}

	public static void main(String[] args) {

		CalculadoraMain menu = new CalculadoraMain();
		menu.showMenu();
	}
}
