/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package testpackage;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */

/*
Problem Description
Take a number A as input, print its multiplication table having the first 10 multiples.

Example Input
Input 1:2 
Input 2:3 


Example Output
Output 1:
 2 * 1 = 2 
 2 * 2 = 4 
 2 * 3 = 6 
 2 * 4 = 8 
 2 * 5 = 10 
 2 * 6 = 12 
 2 * 7 = 14 
 2 * 8 = 16 
 2 * 9 = 18 
 2 * 10 = 20 

Output 2:
 3 * 1 = 3 
 3 * 2 = 6 
 3 * 3 = 9 
 3 * 4 = 12 
 3 * 5 = 15 
 3 * 6 = 18 
 3 * 7 = 21 
 3 * 8 = 24 
 3 * 9 = 27 
 3 * 10 = 30 
*/

public class print_first10_multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int A=scn.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(A+" * "+i+" = "+A*i);
        }
    }
    
}
