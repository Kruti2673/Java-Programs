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
public class print_sumof2_function {

    /**
     * @param args the command line arguments
     */
    
    static int sum(int a,int b){
        return (a+b);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int a=scn.nextInt();
        int b=scn.nextInt();
        
        System.out.println(sum(a,b));
    }
    
}
