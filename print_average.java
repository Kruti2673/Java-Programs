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
public class print_average {

    /**
     * @param args the command line arguments
     */
    public static int averageOf3(int a,int b,int c){
        
        return ((a+b+c)/3);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        
        System.out.print("Average of 3 is: "+averageOf3(a,b,c)+"\n");
        
    }
    
}
