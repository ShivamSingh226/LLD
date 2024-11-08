package lldtictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import lldtictactoe.model.Board;
import lldtictactoe.model.PieceType;
import lldtictactoe.model.Player;
import lldtictactoe.model.PlayingPieceO;
import lldtictactoe.model.PlayingPieceX;

public class TicTacToeGame {
	Board gameBoard;
	Deque<Player> players;
	public void initializeGame() {
		players=new LinkedList<>();
		PlayingPieceX crossPiece=new PlayingPieceX();
		Player player1=new Player("Player1",crossPiece);
		
		 PlayingPieceO noughtsPiece = new PlayingPieceO();
         Player player2 = new Player("Player2", noughtsPiece);

         players.add(player1);
         players.add(player2);

        //initializeBoard
         gameBoard = new Board(3);

	}
	public String startGame() {
		boolean noWinner=true;
		while(noWinner) {
			Player playerTurn=players.removeFirst();
			gameBoard.printBoard();
			List<Pair<Integer, Integer>> freeSpaces =  gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }
            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner=new Scanner(System.in);
            String s=inputScanner.nextLine();
            String[] values=s.split(",");
            int inputRow=Integer.valueOf(values[0]);
            int inputCol=Integer.valueOf(values[1]);
            boolean pieceAdd=gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
            if(!pieceAdd) {
            	System.out.println("Incorrect position. Please select other position.");
            	players.addFirst(playerTurn);
            	continue;
            }
            players.addLast(playerTurn);
            boolean winner=isThereWinner(inputRow,inputCol,playerTurn.playingPiece.pieceType);
            if(winner) {
            	return playerTurn.name;
            }
           
		}
		 return "tie";
		
		
		
	}
	public boolean isThereWinner(int row, int col, PieceType pieceType) {
		// TODO Auto-generated method stub
		boolean rowMatch=false;
		boolean colMatch=false;
		boolean diagonalMatch=false;
		boolean antiDiagonalMatch=false;
		for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType) {
                colMatch = false;
            }
        }
        for(int i=0,j=0;i<gameBoard.size;i++,j++) {
        	if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }
        for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--) {
        	if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;

	}
}
