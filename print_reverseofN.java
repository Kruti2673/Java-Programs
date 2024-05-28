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
Given a number N, print reversed of N.
Note : Create new reverse number, instead of printing number from right to left.

Example Input
Input 1 :
12054

Input 2 :
-12500

Input 3 :
0


Example Output
Output 1 :
45021

Output 2 :
-521

Output 3 :
0
*/

public class print_reverseofN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        int digit=0;
        int original=N;
        
        if(N==0){
            System.out.print("0");
        }
        
        if(N<0){
            N*=-1;
        }
        
        for(int i=1;i<=N;i++){
            while(N>0){
            int rem=N%10;
            digit=digit*10+rem;
            N/=10;
            }
        }
        if(original>0){
        System.out.println(digit);
        }
        if(original<0){
            System.out.println(digit*-1);
        }
    }
}
