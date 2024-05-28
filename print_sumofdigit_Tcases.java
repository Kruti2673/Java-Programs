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
You take a number of test cases, denoted by T as input.For each test case, you should take integers N as input. 
Your task is to calculate and print the sum of the digits of the given number N.

Example Input

Input 1:
2
5
1001

Input 2:
2
123
1589
Example Output

Output 1:
5
2

Output 2:
6
23
*/

public class print_sumofdigit_Tcases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int T=scn.nextInt();
        
        
        for(int i=1;i<=T;i++){
            int N=scn.nextInt();
            int sum=0;
            while(N>0){
                sum=sum+(N%10);
                N/=10;
            }
            System.out.print(sum);
        }
        
    }
    
}
