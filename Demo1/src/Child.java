
public class Child extends Parrent {

	@Override
    void run() {
        System.out.println("Child run");
        super.run();  // Calls Parent's run()
    }

    @Override
    void walk() {
        System.out.println("Child walk");
        super.walk(); // Calls Parent's walk()
    }
}
