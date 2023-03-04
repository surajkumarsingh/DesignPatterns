package lsp;

public class Square extends Rectangle {
	public Square(int side) {
		super(side, side);
	}

	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}
