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
*****
 ****
  ***
   **
    *
*/

public class print_invertedPyramid_right_to_left {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        for(int row=1;row<=N;row++){
            
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            
            for(int star=N;star>=row;star--){
                System.out.print("*");
            }
            
            
            
            
            
            System.out.println();
        }
    }
    
}
