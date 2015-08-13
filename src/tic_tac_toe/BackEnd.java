package tic_tac_toe;

public class BackEnd {
	public static char[][] signs = Main.signs;
	
	/** Metoda koja provjerava da li je birano polje slobodno */
	public static boolean isFree(char sign){
		return sign != 'X' && sign != 'O';
	}
	
	/** Metoda koj aprovjerava da li trenutno ima pobjednika */
	public static boolean isWinner(){
		
		int counterX;
		int counterO;
		
		// testiramo da li imamo tri jednaka znaka vodoravno
		for(int i = 0; i < 3; i++){
			counterX = 0;
			counterO = 0;
			for(int j = 0; j < 3; j++){
				if(signs[i][j] == 'X'){
					counterX++;
				}else if(signs[i][j] == 'O'){
					counterO++;
				}
			}
			
			if(counterX == 3 || counterO == 3){
				return true;
			}
		}
		
		// provjeravamo da li imamo tri jednaka znaka uspravno
		for(int i = 0; i < 3; i++){
			counterX = 0;
			counterO = 0;
			for(int j = 0; j < 3; j++){
				if(signs[j][i] == 'X'){
					counterX++;
				}else if(signs[j][i] == 'O'){
					counterO++;
				}
			}
			
			if(counterX == 3 || counterO == 3){
				return true;
			}
		}
		
		// provjerava dole-desno dijagonalu
		if((signs[0][0] == 'X' && signs[1][1] == 'X' && signs[2][2] == 'X')
				||(signs[0][0] == 'O' && signs[1][1] == 'O' && signs[2][2] == 'O')){
			return true;
		}
		
		// provjerava gore-desno dijagonalu
		if((signs[2][0] == 'X' && signs[1][1] == 'X' && signs[0][2] == 'X')
				||(signs[2][0] == 'O' && signs[1][1] == 'O' && signs[0][2] == 'O')){
			return true;
		}
		
		return false;
		
	}
	
	/** Metoda koja provjerava da li je matrica popunjena */
	public static boolean isFinished(){
		for(char[] znakovi: signs){
			for(char znak: znakovi){
				if(isFree(znak))
					return false;
			}
		}
		
		
		return true;
	}
	
	public static void resetSigns(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				signs[i][j] = ' ';
			}
		}
	}
}
