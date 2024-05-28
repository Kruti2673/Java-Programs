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
Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
*/

public class print_pos_neg_even_odd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of cases: ");
       int size = sc.nextInt();
       int numbers[] = new int[size];
       int pos=0;
       int neg=0;
       int even=0;
       int odd=0;
       int zero=0;


       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }
       
       for(int i=0;i<size;i++){
           if(numbers[i]>0){
               pos++;
           }
           if(numbers[i]<0){
               neg++;
           }
           if(numbers[i]%2==0){
               even++;
           }
           if(numbers[i]%2!=0){
               odd++;
           }
           if(numbers[i]==0){
               zero++;
           }
       }
       System.out.println("positive numbers: "+pos);
       System.out.println("negative numbers: "+neg);
       System.out.println("even numbers: "+even);
       System.out.println("odd numbers: "+odd);
       System.out.println("zero numbers: "+zero);
    }
    
}
