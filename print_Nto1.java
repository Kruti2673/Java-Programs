/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testpackage;

/**
 *
 * @author Kruti Vadaliya
 */
/*
Problem Description
Write a program to print all Natural numbers from N to 1 where you have to take N as input from user

Example Input
Input 1:5
Input 2:10

Example Output
Output 1:5 4 3 2 1 
Output 2:10 9 8 7 6 5 4 3 2 1 
*/

import java.util.Scanner;

public class print_Nto1 {
     public static void main(String[] args) {
        
         Scanner scn=new Scanner(System.in);
         
         int N=scn.nextInt();
         
         for(int i=N;i>=1;i--){
             System.out.print(i+" ");
         }
    }
    
}