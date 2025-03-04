
public class Parrent {

	void run() {
        System.out.println("Parent run");
        walk();  // Calls walk() inside Parent
    }

    void walk() {
        System.out.println("Parent walk");
    }
}
