import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		char gameBoard[][] = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
			
		//for...each loop (Enhanced...for loop)
		/*for(char[] row:gameBoard)
		{
			for(char c:row)
			{
				System.out.print(c);
			}
			System.out.println();
			
		}   */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your placement (1-9):");
		int pos=scan.nextInt();
		System.out.println(pos);
		
		switch(pos) {
		
		case 1: gameBoard[0][0]='X';break;
		case 2: gameBoard[0][2]='X';break;
		case 3: gameBoard[0][4]='X';break;
		case 4: gameBoard[2][0]='X';break;
		case 5: gameBoard[2][2]='X';break;
		case 6: gameBoard[2][4]='X';break;
		case 7: gameBoard[4][0]='X';break;
		case 8: gameBoard[4][2]='X';break;
		case 9: gameBoard[4][4]='X';break;
		
		default: System.out.println("Position not correct");
		}
	
		//Classic for loop OR can use enhanced... for loop (see below)
				for(char i=0;i<=4;i++)
				{
					for(char j=0;j<=4;j++)
					{
						System.out.print(gameBoard [i][j]);
					}
					System.out.println();
				}
	
			
	}

}
