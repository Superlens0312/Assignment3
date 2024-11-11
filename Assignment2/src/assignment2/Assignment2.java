/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2;
import java.util.Scanner;
/**
 *
 * @author Lenny Manset
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.nextLine();
        System.out.println("Please chose what case you want to convert");
        System.out.println(" 1. \'l' or \'L' for lowercase\n 2. \'u' or \'U' for upercase\n 3. \'t' or \'T' for titlecase");
        char caseType = input.next().charAt(0);
        
        String titleCaseWord = convertCase(word);
        String convertedWord = convertCase(word, caseType); 
        
         System.out.printf("%-37s : %s%n" , "Original word" , word);
         System.out.printf("%-25s : %s%n" , "Calling the first converCase method  " , titleCaseWord);
         System.out.printf("%-10s : %s%n" , "Calling the second convertCase method" , convertedWord);
    }

 
    public static String toTitleCase(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
     }
   
      
     public static String convertCase(String word){
        return toTitleCase(word);
    }
     
     public static String convertCase(String word, char caseType){
    
        switch (caseType) {
            case 'u':
            case 'U':
                return word.toUpperCase();
            case 'l': 
            case 'L':
                return word.toLowerCase();
            case 't': 
            case 'T':
                return toTitleCase(word);
            default:
                return word;     
         }
    }
     
}
