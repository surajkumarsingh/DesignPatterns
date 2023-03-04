package adapter;

public class AssignmentWork {

	
	private Pen p;
	
	public void setPen(Pen p) {
		 this.p = p; 
	}
	
	public Pen getPen() {
		return this.p;
	}
	
	
	public void wirteAssignment(String s) {		
		p.write(s);
	}
}
