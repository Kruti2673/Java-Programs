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
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/

public class print_number_pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        for(int row=1;row<=N;row++){
            for(int num=1;num<=row;num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    
}
