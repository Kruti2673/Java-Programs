/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testpackage;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */

/*
Problem Description
A frog is currently at position X, jump size (i.e. the distance covered in single jump by frog) is Y.
Print next 5 position when frog take 5 continuous jumps.

Example Input

Input 1 :
27
2

Input 2 :
-35
4


Example Output

Output 1 :
29 31 33 35 37

Output 2 :
-31 -27 -23 -19 -15
*/

public class print_nextjumpsgiven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int X=scn.nextInt();
        int Y=scn.nextInt();
        int count=1;
        
        for(int i=X;count<=5;i++){
            System.out.print((X+Y)+" ");
            X+=Y;
            count++;
        }
    }
    
}
