package Java;
import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();

        // Populate the vector (you can modify this part as needed)
        vector.add(5);
        vector.add(2);
        vector.add(8);
        vector.add(5);
        vector.add(9);
        vector.add(5);

        System.out.print("Enter the element to find its frequency: ");
        int elementToFind = scanner.nextInt();

        int frequency = Collections.frequency(vector, elementToFind);

        System.out.println("Frequency of " + elementToFind + " is " + frequency);

        scanner.close();
    }
}
