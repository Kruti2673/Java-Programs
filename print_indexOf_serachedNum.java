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
public class print_indexOf_serachedNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number of cases: ");
        int size=scn.nextInt();
        
        
        int[] arr=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        
        System.out.print("which Number u looking for: ");
        int x=scn.nextInt();
        
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.print("Number is foound on "+i+" index"+"\n");
            }
        }
        
    }
    
}
