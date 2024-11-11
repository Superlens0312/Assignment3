/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Lenny Manset
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;
        int choice;
     do{   
        System.out.println("1. Toss Coin");
        System.out.println("2. Exit");
        choice = input.nextInt();
         System.out.println("Choice: " + choice);
        if(choice ==1){
            boolean isHeads = random.nextBoolean();
        if(isHeads){
            headsCount++;
            System.out.println("Heads!");
        }else{
            tailsCount++;
            System.out.println("Tails!");
        }
        System.out.println("Heads:" + headsCount + "," + "Tails:" + tailsCount);  
        }
       } while(choice != 2 );
             System.out.println("Goodbye!");
       
      }
     }
