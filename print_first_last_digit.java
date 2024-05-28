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
Write a program that asks the user to input a number T, indicating the number of test cases.
Then, for each test case, ask for input a number N and print the first and last digits of N.

Example Input
Input 1:
2
5
1001
Input 2:

2
10023
1589


Example Output
Output 1:
5 5
1 1

Output 2:
1 3
1 9

*/

public class print_first_last_digit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int T=scn.nextInt();
        
        for(int i=1;i<=T;i++){
            int N=scn.nextInt();
            int last=N%10;
            int first=0;
            while(N>0){
            first=N%10;
            N/=10;
            }
            System.out.print(first+" ");
            System.out.println(last);
        }
    }
    
}
