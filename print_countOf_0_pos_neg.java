/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */

/*
Write a program to enter the numbers till the user wants and
at the end it should display the count of positive, negative and zeros entered.
*/

public class print_countOf_0_pos_neg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        int T=scn.nextInt();
        int Pcount=0;
        int Ncount=0;
        int Zcount=0;
        
        for(int i=1;i<=T;i++){
            int N=scn.nextInt();
            
            if(N>0){
                Pcount++;
            }
            else if(N<0){
                Ncount++;
            }
            else{
                Zcount++;
            }
            
        }
        System.out.println("Positive count : "+Pcount);
        System.out.println("Negative count : "+Ncount);
        System.out.println("Zero count : "+Zcount);
    }
    
}
