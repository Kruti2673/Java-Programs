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
Take 10 integer inputs from user and store them in an array. 
Now, copy all the elements in an another array but in revrse order.
*/

public class print_reverse_order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter the number of cases: ");
        
        int size=scn.nextInt();
        int number[]=new int[size];
        int digit=0;
        int n[]=new int[size];
        
        for(int i=0;i<size;i++){
            number[i]=scn.nextInt();
        }
        
        System.out.println("array before reversing ");
        
        for(int i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }
        
        System.out.println();
        System.out.println("array after reversing ");
        
        for(int i=0;i<size;i++){
           
            while(number[i]>0){
                int rem=number[i]%10;
                digit=digit*10+rem;
                number[i]/=10;
            }
            
            n[i]=digit;
        
        }
        
        for(int i=0;i<size;i++){
        System.out.println(n[i]+" ");
        }
        
 
        System.out.println();
    }
    
}
