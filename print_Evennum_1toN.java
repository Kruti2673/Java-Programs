package testpackage;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kruti Vadaliya
 */

/*
Problem Description
Write a program to print all even numbers from 1 to N where you have to take N as input from the user.
Note: Use while-loop OR for-loop, according to session flow.

Example Input
Input 1:5
Input 2:10

Example Output
Output 1:2 4 
Output 2:2 4 6 8 10

*/
public class print_Evennum_1toN {
     public static void main(String[] args) {
        
         Scanner scn=new Scanner(System.in);
         
         int N=scn.nextInt();
         
         for(int i=2;i<=N;i=i+2){
             System.out.print(i+" ");
                   
         }
    }
    
}
