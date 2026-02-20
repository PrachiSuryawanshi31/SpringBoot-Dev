import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Prachi");
		names.add("Aditi");
		names.add("Komal");
		names.add("Shraddha");
		names.add("Prachi");
		
		//names.add(null);  //NullPointerException
		
		System.out.println(names);
	}
}
