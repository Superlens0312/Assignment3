/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3;
import java.util.Scanner;
/**
 *
 * @author Lenny Manset
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number and a base, separated by a space");
        String number = input.nextLine();
        int spaceIndex = number.indexOf(" ");
        String number1 = number.substring(0, spaceIndex);
        String number2 = number.substring(spaceIndex + 1);
        int num1 = Integer.parseInt(number1);
        int base = Integer.parseInt(number2);
       
        boolean result1 = isDivisible(num1, base);
        boolean result2 = isDivisible(num1);
        if (result1 && result2 == true) {
            System.out.println(num1 + " is divisible by " + base);
        }
       
        System.out.println();
        System.out.println("Please enter an English letter:");
        String letter = input.nextLine();
        char letter1 = letter.charAt(0);
        int let = letterToNumber(letter1);
       
        System.out.println("Please enter a number base and an English letter base, separated by a space");
        String doubleBase = input.nextLine();
        spaceIndex = doubleBase.indexOf(" ");
        String number3 = doubleBase.substring(0, spaceIndex);
        String baseLetter = doubleBase.substring(spaceIndex + 1);
        int num3 = Integer.parseInt(number3);
        char letter2 = baseLetter.charAt(0);
        System.out.println();
       
        boolean result3 = isDivisible(letter1);
        boolean result4 = isDivisible(letter1, num3);
        boolean result5 = isDivisible(letter1, letter2);
         
        if (result3 && result4 && result5 == true) {
            System.out.println("'" + letter1 + "'" + " is divisible by " + num3);
            System.out.println("'" + letter1 + "'" + " is divisible by " + "'" + baseLetter + "'");
        }
    }
 
    public static int letterToNumber(char ch) {
        int i = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (ch == letter) {
                return i;
            }
            i++;
        }
        i = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (ch == letter) {
                return i;  
            }
            i++;
        }
        return i;
    }

    public static boolean isDivisible(int num) {
        return num % 3 == 0;
    }

    public static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }

    public static boolean isDivisible(char letter) {
        int num = letterToNumber(letter);
        return num % 3 == 0;
    }

    public static boolean isDivisible(char letter, int base) {
        int num = letterToNumber(letter);
        return num % base == 0;
    }

    public static boolean isDivisible(char letter, char base) {
        int num1 = letterToNumber(letter);
        int num2 = letterToNumber(base);
        return num1 % num2 == 0;
    }
}
