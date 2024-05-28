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
You are given a positive integer A. You have to print the sum of all even numbers in the range [1, A].

Example Input
Input 1:1 
Input 2:4 

Example Output
Output 1:0 
Output 2:6 
*/

public class print_sumofeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int A=scn.nextInt();
        int sum=0;
        
        for(int i=1;i<=A;i++){
            if(i%2==0){
            sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
