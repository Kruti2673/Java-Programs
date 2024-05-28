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
Given a number N, Print all digits of number (from right to left) in new line.

Example Input
Input 1 :2001
Input 2 :-6985


Example Output
Output 1 :
1
0
0
2
Output 2 :
5
8
9
6

*/
public class print_right_to_left {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        
        if(N==0){
            System.out.print("0");
        }
        if(N<0){
            N*=-1;
        }
        
        for(int i=0;i<=N;i++){
            int digit=N%10;
            System.out.println(digit);
            N/=10;
        }
    }
    
}
