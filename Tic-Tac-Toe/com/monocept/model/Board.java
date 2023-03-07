package com.monocept.model;

public class Board {
	Cell[] cells = new Cell[9];

	public Board() {
		for(int i=0;i<9;i++) {
			cells[i] = new Cell();
			cells[i].setMark(MarkType.EMPTY);
		}
	}
	
	public boolean isBoardFull() {
		for(int i=0;i<9;i++) {
			if(cells[i].getMark()==MarkType.EMPTY)
				return false;
		}
		return true;
	}
	
	public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException {
		if(loc<0 || loc>8)
		throw new InvalidLocationException("Invalid Location.....");
		cells[loc].setMark(mark);
	}

	public Cell[] getCells() {
		return cells;
	}
}
