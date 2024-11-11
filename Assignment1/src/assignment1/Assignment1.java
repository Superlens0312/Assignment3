/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;
import java.util.Scanner;
/**
 *
 * @author Lenny Manset
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       
        System.out.println("Please enter two numbers, separated by a space: ");
          String number = input.nextLine();
          int spaceIndex = number.indexOf(" ");
        System.out.println("Please enter the operator (+, -, *, or /): ");
        String operator = input.nextLine();
        System.out.println("Please enter a formular. e.g: \"3.14 * 2\": ");
        String formular = input.nextLine();
    
        String number1 = number.substring(0,spaceIndex);
        String number2 = number.substring(spaceIndex + 1);
        double num1 = Double.valueOf(number1);
        double num2 = Double.valueOf(number2);
        char symbol = operator.charAt(0);  
        double result1 = calcResult(num1, num2); 
        double result2 = calcOperator(num1, num2, symbol);
        double result3 = calcFormular(formular);
        
        System.out.printf("%-25s : %.2f%s%.2f%s%.2f%n" , "Calling the first method  " , num1 , " + " , num2 , " = " , result1); 
        System.out.printf("%-25s : %.2f%s%s%s%.2f%s%.2f%n", "Calling the second method " , num1 , " " , operator , " " , num2 , " = " , result2);
        System.out.printf("%-25s : %s%s%.2f%n", "Calling the third method  " , formular , " = " , result3);
  }
    
    public static double calcResult(double num1, double num2){

        return num1 + num2;
    }

public static double calcOperator(double num1, double num2, char oper){
    double result =0;
    if (oper == '*' ){
       result = (num1 * num2);
    }
    if (oper == '/' ){
       result = (num1 / num2);
    }
    if (oper == '+' ){
       result = (num1 + num2);
   }
   if (oper == '-' ){
       result = (num1 - num2);
   }
    return result;
}

public static double calcFormular(String formular){
  
        int spaceindex = formular.indexOf(" ");
        int lastSpace = formular.lastIndexOf(" ");
        String number1 = formular.substring(0,spaceindex);
        String symbol = formular.substring(spaceindex + 1 ,lastSpace);
        String number2 = formular.substring(lastSpace + 1);
        double num1 = Double.valueOf(number1);
        double num2 = Double.valueOf(number2);
         
 
     double result =0;
    if ("*".equals(symbol) ){
       result = (num1 * num2);
   }
    if ("/".equals(symbol) ){
       result = (num1 / num2);
   }
   if ( "+".equals(symbol) ){
      result = (num1 + num2);
   }
    if ("-".equals(symbol) ){
      result = (num1 - num2);
    }
    return result ;
       }
   
    }