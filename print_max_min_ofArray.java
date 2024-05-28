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
public class print_max_min_ofArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];

        
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }
       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);


    }
    
}
