package adapter;

public class Student {

	
	public static void main(String[] args) {
		Pen op = new  PenAdapter();
		
		AssignmentWork aw = new AssignmentWork();	
		aw.setPen(op);
		aw.wirteAssignment("WWWWWWWWw");
		
	}
}
