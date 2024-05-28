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
Take an input of a number A from the user. Print all perfect squares less than or equal to A.
Note - Perfect squares are integers whose square root is an integer. (For Example: 16 is perfect square as √16 = 4, or 42 = 16)

Example Input
Input 1:20
Input 2:100

Example Output
Output 1:1 4 9 16
Output 2:1 4 9 16 25 36 49 64 81 100
*/

public class print_perfectSquare_lessOrEqual_given {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int A=scn.nextInt();
        int square=0;
        
        for(int i=1;i<=A;i++){
            square=i*i;
            if(square<A){
            System.out.print(square+" ");
            }
            
        }
    }
    
}
