package molesige;

class Hourglass {
	public static void main(String[] args) {
		int array[][] = new int[5][5];
		int row, col;
//		char[] Alphabet = new char[26];
		int A = 65;
		
		for(row=0; row<=4; row++) {
			if(row<=2) {
				for(col = row; col <= (4-row); col++) {
//					int i=0;
//					Alphabet[i] = (char)A;
					array[row][col] = A++;
				}
			} else {
				for(col = (4-row); col <= row; col++) {
					array[row][col] = A++;
				}
			}
		}

		for(row = 0; row <= 4; row++) {
			for(col = 0; col <= 4; col++) {
				System.out.printf("%3c", array[row][col]);
//				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}
}