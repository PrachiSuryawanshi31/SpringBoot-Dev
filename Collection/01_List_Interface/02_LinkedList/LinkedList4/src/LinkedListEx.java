import java.util.LinkedList;

public class LinkedListEx  {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("LinkedList: " + fruits);

        // Add element at first and last
        fruits.addFirst("Grapes");
        fruits.addLast("Pineapple");

        System.out.println("After addFirst and addLast: " + fruits);

        // Get elements
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());

        // Remove element
        fruits.remove("Mango");
        System.out.println("After remove: " + fruits);

        // Size
        System.out.println("Size: " + fruits.size());

        // Loop using for-each
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}