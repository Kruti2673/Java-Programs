/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */

/*
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 ..... 
*/

public class print_fibbonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        int a=0, b=1, c=0;
        
	for(int i=1; i<=N; i++)
	{
            System.out.print(c+" ");
		a = b;
		b = c; 
		c = a + b; 
	}
    }
    
}
