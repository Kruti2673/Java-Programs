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
Given an integer input N, print all multiples of 4 less than or equal to N.

Example Input:22

Example Output:4 8 12 16 20
*/

public class printMultipleof4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        
        for(int i=1;i<=N;i++){
            int ans=i*4;
            if(ans<N){
            System.out.print(ans+" ");
            }
        }
    }
    
}
