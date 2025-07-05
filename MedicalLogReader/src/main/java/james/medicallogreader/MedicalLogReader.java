/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package james.medicallogreader;
/**
 *
 * @author DELL
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class MedicalLogReader {
   public static void main(String[] args) {
        File medicalLogFile = new File("medical_log.txt"); 

        try (Scanner reader = new Scanner(medicalLogFile)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }  catch (IOException e) {
            System.err.println("Error reading the medical log file.");
        }
    }
}

    
    

