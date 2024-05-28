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
Write a Program to print All Armstrong numbers between 1 to N
*/

public class print_armStrong_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int mul=1;
        int rem=0;
        
        for(int i=1;i<=N;i++){
            
           int num=i;
           int sum = 0;

            while (num > 0) {
                rem = num % 10;
                mul = rem * rem * rem;
                sum += mul;
                num /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
        
    }
    
}
