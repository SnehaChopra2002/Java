package Java;
import java.util.Vector;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> shoppingList = new Vector<>();

        while (true) {
            System.out.println("Shopping List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Add item at a specified location");
            System.out.println("3. Delete item");
            System.out.println("4. Print shopping list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();
                    shoppingList.add(itemToAdd);
                    System.out.println(itemToAdd + " added to the shopping list.");
                    break;
                case 2:
                    System.out.print("Enter the item to add: ");
                    String itemToAddAtIndex = scanner.nextLine();
                    System.out.print("Enter the index where you want to add the item: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (index >= 0 && index <= shoppingList.size()) {
                        shoppingList.add(index, itemToAddAtIndex);
                        System.out.println(itemToAddAtIndex + " added to the shopping list at index " + index + ".");
                    } else {
                        System.out.println("Invalid index. Item not added.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the item to delete: ");
                    String itemToDelete = scanner.nextLine();
                    if (shoppingList.remove(itemToDelete)) {
                        System.out.println(itemToDelete + " removed from the shopping list.");
                    } else {
                        System.out.println(itemToDelete + " not found in the shopping list.");
                    }
                    break;
                case 4:
                    System.out.println("Shopping List:");
                    for (String item : shoppingList) {
                        System.out.println(item);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}