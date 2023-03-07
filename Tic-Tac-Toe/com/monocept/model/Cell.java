package com.monocept.model;

public class Cell {
	private MarkType mark;

	public Cell() {
		mark = MarkType.EMPTY;
	}
	
	public boolean isEmpty() {
		if(mark==mark.EMPTY)
			return true;
		return false;
	}
	
	public MarkType getMark() {
		return mark;
	}
	
	public void setMark(MarkType mark) throws CellAlreadyMarkedException {
		if(!isEmpty()) {
			throw new CellAlreadyMarkedException("Cell already Marked");
		}
		this.mark = mark;
	}
}
