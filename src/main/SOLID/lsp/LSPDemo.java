package lsp;

public class LSPDemo {
	 public static void main(String[] args) {
	        Rectangle r = new Rectangle(5, 10);
	        useRectangle(r);

	        Square s = new Square(5);
	        useRectangle(s); // violates LSP
	    }

	    public static void useRectangle(Rectangle r) {
	        int width = r.getWidth();
	        r.setHeight(10);
	        int expectedArea = width * 10;
	        int actualArea = r.area();
	        System.out.println("Expected area: " + expectedArea);
	        System.out.println("Actual area: " + actualArea);
	    }
}
