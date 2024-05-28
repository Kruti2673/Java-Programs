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
Take T (number of test cases) as input.
For each test case, take integer N as input and Check whether that number is Palindromic / Not Palindromic.

Example Input

Input 1:
2
101
51

Input 2:
2
741
2112


Example Output

Output 1:
Palindromic
Not Palindromic

Output 2:
Not Palindromic
Palindromic
*/

public class print_palindromeOrNot_Tcases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int T=scn.nextInt();
        int rev=0;
        
        for(int i=1;i<=T;i++){
            
            int N=scn.nextInt();
            int real=N;
            
            while(N>0){
                int digit=N%10;
                rev=rev*10+digit;
                N/=10;
            }
            if(rev==real){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
    }
    
}
