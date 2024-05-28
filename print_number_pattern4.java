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
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/

public class print_number_pattern4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        
        for(int row=N;row>=1;row--){
           
            for(int i=N;i>=row;i--){
                System.out.print(i+" ");
            }
            
            System.out.println();
        }
    }
    
}
