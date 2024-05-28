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
Given a number N, print the last digit of Number.

Example Input
Input 1 :1973
Input 2 :530

Example Output
Output 1 :3
Output 2 :0
*/
public class printlastdigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        
        System.out.println(N%=10);
    }
    
}
