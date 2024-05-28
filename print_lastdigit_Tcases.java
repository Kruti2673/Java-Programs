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
For each test case, take integer N as input and Print the last digit of that number.

Example Input
Input 1:
2
94
512

Input 2:
2
4987
264


Example Output
Output 1:
4
2

Output 2:
7
4
*/

public class print_lastdigit_Tcases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int T=scn.nextInt();
        
        for(int i=1;i<=T;i++){
            
            int N=scn.nextInt();
            
                System.out.println(N%10);
            
        }
    }
    
}
