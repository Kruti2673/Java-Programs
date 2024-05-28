/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */
public class print_arrayOfString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of cases: ");
       int size = sc.nextInt();
       String numbers[] = new String[size];


       for(int i=0; i<size; i++) {
           numbers[i] = sc.next();
       }
       
       System.out.println("Elements are: ");
       
       for(int i=0; i<numbers.length; i++) {
           System.out.print(numbers[i]+" ");
       }
    }
    
}
