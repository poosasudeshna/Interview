package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;
   

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    	if(MAX_BOARD_HEIGHT<=xCoordinate || MAX_BOARD_WIDTH<=yCoordinate) {
    		pawn.setXCoordinate(-1);
    		pawn.setYCoordinate(-1);
    		return;
    	}
    	Pawn p= pieces[xCoordinate][yCoordinate];
    	if(p!=null && p.getPieceColor()==pieceColor && p.getXCoordinate()==xCoordinate && p.getYCoordinate()==yCoordinate)
    	{
    		pawn.setXCoordinate(-1);
    		pawn.setYCoordinate(-1);
    	}else
    	{
    		pawn.setXCoordinate(xCoordinate);
    		pawn.setYCoordinate(yCoordinate);
    		pawn.setPieceColor(pieceColor);
    		pieces[xCoordinate][yCoordinate]=pawn;
    	}
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
   
    	if(xCoordinate <=MAX_BOARD_WIDTH && yCoordinate<=MAX_BOARD_HEIGHT && xCoordinate>=0 && yCoordinate>=0) {
    		return true;
    	}else{
    		return false;  
    	}
   
    //throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
       
    }
}
