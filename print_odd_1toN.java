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
Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

Example Input
Input 1:5
Input 2:10


Example Output
Output 1:1 3 5 
Output 2:1 3 5 7 9 
*/

public class print_odd_1toN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        
        for(int i=1;i<=N;i+=2){
            System.out.print(i+" ");
        }
        
    }
    
}
