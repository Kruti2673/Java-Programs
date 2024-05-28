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
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
*/

public class print_number_pattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        
        for(int row=1;row<=N;row++){
           
            for(int i=1;i<=row;i++){
                System.out.print(row+" ");
            }
            
            System.out.println();
        }
    }
    
}
