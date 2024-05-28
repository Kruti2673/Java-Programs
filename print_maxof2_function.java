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

//return max of 2

public class print_maxof2_function {

    /**
     * @param args the command line arguments
     */
    
    static int max(int a,int b){
        int max=0;
        if(a>b){
            return a;
        }
        else{
            return b;
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        
        int a=scn.nextInt();
        int b=scn.nextInt();
        
        System.out.println(max(a,b));
    }
    
}
