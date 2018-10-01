package lab4;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Huto huto = new Huto();
		huto.add("kobanyai", "hideg", "6");
		huto.add("jager", "eros", "40");
		huto.add("jager", "gyenge", "2");
		huto.add("tatra", "egy", "23");
		
		
		huto.save("boii");
		
		huto.add("boi", "oi", "5");
		
		
		
		huto.load("boii");
		
		huto.list("str");

	}
	

}
