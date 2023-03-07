package com.monocept.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;
	public ResultAnalyzer(Board board) {
		this.board = board;
		this.result = ResultType.PROGRESS;
	}
	private void horizontalWinCheck() {
		Cell[] cells = board.getCells();
		if(cells[0].getMark().equals(cells[1].getMark()) && cells[1].getMark().equals(cells[2].getMark()) && !cells[0].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
		if(cells[3].getMark().equals(cells[4].getMark()) && cells[4].getMark().equals(cells[5].getMark()) && !cells[3].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
		if(cells[6].getMark().equals(cells[7].getMark()) && cells[7].getMark().equals(cells[8].getMark())&& !cells[6].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
	}
	
	private void verticalWinCheck() {
		Cell[] cells = board.getCells();
		if(cells[0].getMark().equals(cells[3].getMark()) && cells[3].getMark().equals(cells[6].getMark())&& !cells[0].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
		if(cells[1].getMark().equals(cells[4].getMark()) && cells[4].getMark().equals(cells[7].getMark())&& !cells[1].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
		if(cells[2].getMark().equals(cells[5].getMark()) && cells[5].getMark().equals(cells[8].getMark())&& !cells[2].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
	}
	
	private void diagonalWinCheck() {
		Cell[] cells = board.getCells();
		if(cells[0].getMark().equals(cells[4].getMark()) && cells[4].getMark().equals(cells[8].getMark())&& !cells[0].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
		if(cells[2].getMark().equals(cells[4].getMark()) && cells[4].getMark().equals(cells[6].getMark())&& !cells[2].getMark().equals(MarkType.EMPTY)) {
			result = ResultType.WIN;
		}
	}
	public ResultType getResult() {
		return result;
	}
	
	public ResultType analyzeResult() {
		horizontalWinCheck();
		verticalWinCheck();
		diagonalWinCheck();
		if(result!=ResultType.WIN) {
			if(board.isBoardFull()) {
				result = ResultType.DRAW;
			}
		}
		
		return result;
	}
	public Board getBoard() {
		return board;
	}
}
