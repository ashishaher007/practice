//singleton class
public class S {

	private static S s;

	private S() {

	}

	public static S getSinstance() {
		if (s == null) {
			s = new S();
		}
		return s;

	}
	
	public static void main(String[] args) {
		S s1 = new S();
		S s2 = new S();
		System.out.println(s1.getSinstance()==s2.getSinstance());
		
		
	}
}
