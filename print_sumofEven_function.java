/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */
public class print_sumofEven_function {

    /**
     * @param args the command line arguments
     */
    static void sum(int A){
		int sum=0;
		for(int i=2;i<=A;i+=2){
			sum+=i;
		}
		System.out.println(sum);
	}
    public static void main(String args[]) {
		
		Scanner scn=new Scanner(System.in);
		
		int A=scn.nextInt();
		
		sum(A);
	
	}
    
}
