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
For each test case, take integer N as input and Print the count of digits of that number.
Note: No of digits for number 0 is considered as 1.

Example Input

Input 1: 
2
0
1
Input 2:
2
100
10101

Example Output

Output 1:
1
1
Output 2:
3
5
*/

public class print_countOfDigit_Tcases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int T=scn.nextInt();
        
        for(int i=1;i<=T;i++){
            
            int N=scn.nextInt();
            int count=0;
            
            for(int j=1;j<=N;j++){
                N%=10;
                count++;
                N/=10;
            }
            System.out.print(count);
        }
    }
    
}
