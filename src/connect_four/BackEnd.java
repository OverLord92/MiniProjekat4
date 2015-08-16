package connect_four;

public class BackEnd {

	static char[][] signs = new char[6][7];
	
	public static boolean isFull(){
		for(int i = 0; i < signs[0].length; i++){
			if(isFree(i))
				return false;
		}
		return true;
	}

	public static boolean isFree(int column) {
		return signs[0][column] != 'X' && signs[0][column] != 'O';
	}

	public static void place(int column, char c) {
		for (int i = signs.length - 1; i >= 0; i--) {
			if (signs[i][column] != 'X' && signs[i][column] != 'O') {
				signs[i][column] = c;
				break;
			}
		}
	}

	public static void printMatrix() {
		System.out.println();
		for (int i = 0; i < signs.length; i++) {
			System.out.print("|");
			for (int j = 0; j < signs[0].length; j++) {
				System.out.print(signs[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("\n---------------\n");

	}

	public static boolean isWinner(char c) {

		return isConsecutiveHorizontal(c) || isConsecutiveVertical(c)
				|| isConsecutiveDownRight(c) || isConsecutiveUpRight(c);

	}

	public static boolean isConsecutiveHorizontal(char c) {
		boolean isConHor = false;
		int count;
		for (int i = 0; i < signs.length; i++) {
			count = 0;
			for (int j = 0; j < signs[0].length; j++) {
				// ukoliko je broj isti povecavamo brojac za += 1
				if (c == signs[i][j]) {
					count++;
					// ako nije mijenjao vrijednost broja i postavljamo brojac
					// na 1
				} else {
					count = 0;
				}
				// ako je ovaj uslov ispunjen niz ima 4 uzastopno ista broja
				if (count == 4) {
					isConHor = true;
					break;
				}

			}
		}

		return isConHor;
	}

	public static boolean isConsecutiveVertical(char c) {
		boolean isConHor = false;
		int count;
		for (int i = 0; i < signs.length; i++) {
			count = 0;
			for (int j = 1; j < signs.length; j++) {
				// ukoliko je broj isti povecavamo brojac za += 1
				if (c == signs[j][i]) {
					count++;
					// ako nije mijenjao vrijednost broja i postavljamo brojac
					// na 1
				} else {
					count = 0;
				}
				// ako je ovaj uslov ispunjen niz ima 4 uzastopno ista broja
				if (count == 4) {
					isConHor = true;
					break;
				}

			}
		}

		return isConHor;
	}

	public static boolean isConsecutiveDownRight(char c) {

		boolean isConDownRight = false;
		int count;

		for (int i = 0; i < signs.length - 3; i++) {
			for (int j = 0; j < signs[0].length - 3; j++) {
				count = 0;

				for (int k = i, l = j, m = 0; m < 4; k++, l++, m++) {
					if (c == signs[k][l]) {
						count++;
						// ako nije mijenjao vrijednost broja i postavljamo
						// brojac na 1
					} else {
						count = 0;
					}
					// ako je ovaj uslov ispunjen niz ima 4 uzastopno ista broja
					if (count == 4) {
						isConDownRight = true;
						break;
					}

				}
			}
		}

		return isConDownRight;
	}

	public static boolean isConsecutiveUpRight(char c) {

		boolean isConUpRight = false;
		int count;

		for (int i = 3; i < signs.length; i++) {
			for (int j = 0; j < signs[0].length - 3; j++) {
				count = 0;
				for (int k = i, l = j, m = 0; m < 4; k--, l++, m++) {
					if (c == signs[k][l]) {
						count++;
						// ako nije mijenjao vrijednost broja i postavljamo
						// brojac na 1
					} else {
						count = 0;
					}
					// ako je ovaj uslov ispunjen niz ima 4 uzastopno ista broja
					if (count == 4) {
						isConUpRight = true;
						break;
					}

				}
			}
		}

		return isConUpRight;
	}

}
