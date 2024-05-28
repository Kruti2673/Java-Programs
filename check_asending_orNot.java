/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */
public class check_asending_orNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter the number of cases: ");
        
        int size=scn.nextInt();
        int number[]=new int[size];
        int res=0,i;
        
        for(i=0;i<size;i++){
            number[i]=scn.nextInt();
        }
    
        for(i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                
                if(number[i]<number[j]){
                    res++;
                }
            }
            
        }
        
        
        System.out.println();
    }
}
    
