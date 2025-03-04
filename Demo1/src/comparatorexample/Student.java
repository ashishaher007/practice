package comparatorexample;

public class Student {

	 String firstname;
	 String Lastname;
	 int age;

	public Student(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		Lastname = lastname;
		this.age = age;
	}

	public Student() {
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", Lastname=" + Lastname + ", age=" + age + "]";
	}

}
