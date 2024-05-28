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
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/

public class print_number_pattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        
        int count=1;
        for(int row=1;row<=N;row++){
            
            for(int i=1;i<=row;i++){
                System.out.print(count+" ");
                count++;
            }
            
            System.out.println();
        }
    }
    
}
