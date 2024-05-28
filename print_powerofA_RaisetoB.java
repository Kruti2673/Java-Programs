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
You are given two integers A and B. You have to find the value of AB.
NOTE: The value of AB will always be less than or equal to 109.

Example Input

Input 1:
 2
 3 
Input 2:
 1
 10 

Example Output

Output 1:8 
Output 2:1 
*/

public class print_powerofA_RaisetoB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int A=scn.nextInt();
        int B=scn.nextInt();
        int mul=1;
        
        for(int i=1;i<=B;i++){
            mul=mul*A;
        }
        System.out.println(mul);
    }
    
}
