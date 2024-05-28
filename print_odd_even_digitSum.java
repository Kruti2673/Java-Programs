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
You have a number N, you have to write a code to find odd digit sum and even digit sum from given number and print it.

Example Input
Input 1 :
8563724

Input 2 :
4524126


Example Output
Output 1 :
Sum of Odd Digit : 15
Sum of Even Digit : 20

Output 2 :
Sum of Odd Digit : 6
Sum of Even Digit : 18

*/

public class print_odd_even_digitSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        int OddSum=0;
        int EvenSum=0;
        
        for(int i=1;i<=N;i++){
            int digit=N%10;
            if(digit%2==0){
                EvenSum+=digit;
            }
            else{
                OddSum+=digit;
            }
            N/=10;
        }
        System.out.println("Sum of Odd Digit : "+OddSum);
        System.out.println("Sum of Even Digit : "+EvenSum);
    }
    
}
