package boardgame;

public class Position {

	private Integer row;
	private Integer column;
	
	//Constructors
	
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	//Getters and Setters
	
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	//Actions
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
		
	public void setValues(int row, int column) {
		
	}
	
}
