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
Write a program to print all Natural numbers from 1 to N where you have to take N as input from user

Example Input
Input 1:5
Input 2:10

Example Output
Output 1:1 2 3 4 5 
Output 2:1 2 3 4 5 6 7 8 9 10 
*/

public class print1toN {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        
        for(int i=1;i<=N;i++){
            System.out.print(i+" ");
        }
        
    }
    
}
