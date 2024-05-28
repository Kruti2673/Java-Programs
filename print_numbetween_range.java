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
Given two numbers A & B, print all the numbers from A to B in a single line.
Note : Try to solve this question using a while loop for learning purposes.

Example Input
5
9

Example Output
5 6 7 8 9

*/

public class print_numbetween_range {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int A=scn.nextInt();
        int B=scn.nextInt();
        
        for(int i=A;i<=B;i++){
            System.out.print(i+" ");
        }
    }
    
}
