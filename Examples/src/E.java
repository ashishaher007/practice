//immutable design class

/*1. Create a final class
2. Set the values of the properties using only constructors
3. Make the properties final.
4. Do not provide any setters for these properties*/
public final class E {

	private final int age;
	private final String name;

	private E(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		E e1 = new E(25,"Raj");
		System.out.println(e1.getAge() + " "+ e1.getName());
	}
}
