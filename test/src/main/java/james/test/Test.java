/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package james.test;

/**
 *
 * @author DELL
 */
public class Test {
String bookTitle = ""; // Efficient and uses the String Pool
String authorName = new String(); // Less efficient, creates a new object
public class Book {
    String title = "";              // method 1
    String author = new String();   // method 2
}

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
