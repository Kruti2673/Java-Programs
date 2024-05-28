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
public class print_nCr_que {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        
        int N=scn.nextInt();
        int R=scn.nextInt();
        int Nmul=1;
        int Rmul=1;
        int mul=1;
        
        for(int i=N;i>=1;i--){
        Nmul=Nmul*i;
      }
        for(int i=R;i>=1;i--){
        Rmul=Rmul*i;
      }
        for(int i=(N-R);i>=1;i--){
            mul=mul*i;
        }
        System.out.println(Nmul/(mul*(Rmul)));
    }
    
}
