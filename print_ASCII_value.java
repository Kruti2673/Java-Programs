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
public class print_ASCII_value {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        for(int s=1;s<=N;s++)
	{
            System.out.print((char)s+" ");	
	}
    }
    
}
