/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package james.ugandacounter;
import java.util.Scanner;

public class UgandaCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book description:");
        String description = scanner.nextLine();

        // Normalize to lowercase and split into words
        String[] words = description.toLowerCase().split("\\W+");
        int count = 0;

        for (String word : words) {
            if (word.equals("uganda")) {
                count++;
            }
        }

        System.out.println("'Uganda' appears " + count + " time(s).");
    }
}

