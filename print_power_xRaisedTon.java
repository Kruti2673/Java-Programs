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
public class print_power_xRaisedTon {

    /**
     * @param args the command line arguments
     */
    public static int power(int x,int n){
        int mul=1;
        for(int i=1;i<=n;i++){
            mul*=x;
        }
        
        return mul;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        
        System.out.println("Power of x raised to n is: "+power(x,n)+"\n");
    }
    
}
