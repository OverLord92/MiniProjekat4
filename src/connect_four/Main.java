package connect_four;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean player1Or2 = true;
		boolean gameOver = false;

		System.out.println("Igrate igricu spoji cetiri. Sretno.");
		BackEnd.printMatrix();

		while (gameOver == false || BackEnd.isFull()) {

			System.out
					.print(player1Or2 ? "IKS igrac je na redu.\nUnseite broj(od 0 do 6): "
							: "OKS igrac je na redu.\nUnseite broj(od 0 do 6): ");

			int choice = input.nextInt();

			do {

				if (BackEnd.isFree(choice) == false) {
					System.out.print("Red je pun. Probajte drugi: ");
					choice = input.nextInt();
				}

			} while (BackEnd.isFree(choice) == false);

			BackEnd.place(choice, player1Or2 ? 'X' : 'O');

			BackEnd.printMatrix();
			gameOver = BackEnd.isWinner(player1Or2 ? 'X' : 'O');
			player1Or2 = !player1Or2;
		}

		if (gameOver == true) {
			System.out.println(!player1Or2 ? "X igrac je pobjedio."
					: "O igrac je pobjedio.");
		} else {
			System.out.println("Nema pobjednika.");
		}
		
		input.close();
		}
}
