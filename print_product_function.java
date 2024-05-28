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

//print the product

public class print_product_function {

    /**
     * @param args the command line arguments
     */
    static void product(int a,int b){
        int product=a*b;
        System.out.println(product);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int a=scn.nextInt();
        int b=scn.nextInt();
        
        product(a,b);
    }
    
}
