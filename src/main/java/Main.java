public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addLast("green");
		list.addLast("magenta");
		list.addLast("blue");
		list.addFirst("Beans");
		list.removeLast();
		System.out.println(list.contains("green"));
	}
}
