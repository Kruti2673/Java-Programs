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
Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

Example Input
Input 1:5
Input 2:10

Example Output
Output 1:15
Output 2:55
*/

public class print_sum_of_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        int sum=0;
        
        for(int i=1;i<=N;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    
}
