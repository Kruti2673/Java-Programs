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
public class print_circumference_of_circle {

    /**
     * @param args the command line arguments
     */
    
    public static double circle(int r){
        double area=2*(Math.PI)*r;
                
        return area;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        
        double r=scn.nextDouble();
        
        System.out.print("circumference od circle is: "+circle((int) r)+"\n");
    }
    
}
