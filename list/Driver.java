package list;

public class Driver {
	
	public static void main(String[] args) {
		List l = new List();
		System.out.println("add");
		l.add("Test String");
		System.out.println(l.size());
		l.display();

		System.out.println("add");
		l.add(10);
		System.out.println(l.size());
		l.display();

		System.out.println("add");
		l.add(4.20);
		System.out.println(l.size());
		l.display();

		System.out.println("add");
		l.add(true);
		System.out.println(l.size());
		l.display();

		System.out.println("delete");
		l.delete(0);
		System.out.println(l.size());
		l.display();

		System.out.println("update");
		l.update(2, 22);
		System.out.println(l.size());
		l.display();
	}
}
