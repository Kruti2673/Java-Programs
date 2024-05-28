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
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
*/

public class find_peakELE_notSmallerThanNeighbor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter the number of cases: ");
        
        int size=scn.nextInt();
        int number[]=new int[size];
        int i;
        
        for(i=0;i<size;i++){
            number[i]=scn.nextInt();
        }
        
        System.out.println();
        System.out.println("Simple array");
        
        for(i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }
         System.out.println();
         System.out.print("Answer is: ");
         
        for(i=1;i<size;i++){
            while(number[i]>number[i-1] && number[i]>number[i+1]){
                System.out.print(number[i]+" ");
                break;
            }
        }
        System.out.println();
    }
    
}
