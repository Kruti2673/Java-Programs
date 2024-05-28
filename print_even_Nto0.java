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
Write a program to print all even numbers from N to 0 where you have to take N as input from the user.

Example Input
Input 1:5
Input 2:10

Example Output
Output 1:4 2 0
Output 2:10 8 6 4 2 0
*/

public class print_even_Nto0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        
        for(int i=N;i>=0;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
