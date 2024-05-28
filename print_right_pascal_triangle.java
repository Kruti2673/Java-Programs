/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patterns;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */

/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/

public class print_right_pascal_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        for(int row=1;row<=N;row++){
            
            for(int star=1;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=N;row++){
            
            for(int star=(N-row);star>=1;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
