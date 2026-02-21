import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Prachi");
		names.add("Prathmesh");
		names.add("Sakshi");
		names.add("Siya");
		names.add("Kiya");
		
		// Display list
		System.out.println("ArrayList: "+ names);
		
		// Get element
		System.out.println("Second Element: " + names.get(1));
		
		// Update element
		names.set(2, "Pihuu");
		System.out.println("After Update: " + names);
		
		// Remove element
		names.remove("Siya");
		System.out.println("After Remove: " + names);
		
		
		 // Size of list
		System.out.println("Size : "+ names.size());
		
		
		// Loop through ArrayList
		System.out.println("Using For Loop:");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
	}
}
