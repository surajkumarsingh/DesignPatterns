package adapter;

public class PenAdapter implements Pen {

	OtherPen op = new OtherPen();
	@Override
	public void write(String s) {
	op.mark(s);
		
	}
}
