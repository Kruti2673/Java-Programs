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

/*
Input: arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
*/

public class print_cyclicRotate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of cases: ");
       int size = sc.nextInt();
       int numbers[] = new int[size];


       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }
       
       System.out.println("Elements are: ");
       
       for(int i=0; i<numbers.length; i++) {
           System.out.print(numbers[i]+" ");
       }
        
    }
    
}
