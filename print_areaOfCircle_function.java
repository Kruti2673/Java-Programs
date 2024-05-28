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
public class print_areaOfCircle_function {

    /**
     * @param args the command line arguments
     */
    static double area(double r){
		double area=1;
		area=Math.PI*r*r;
		return area;
	}
	
	 public static void main(String args[]) {
		 
		 Scanner scn=new Scanner(System.in);
		
		double r=scn.nextInt();
		
		System.out.println(area(r));
		 
	 }
    
}
