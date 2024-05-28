/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

import java.util.Scanner;

/**
 *
 * @author Kruti Vadaliya
 */
public class print_personVote_eligible {

    /**
     * @param args the command line arguments
     */
    
    public static int voteEligible(int n){
        if(n>=18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
        return n;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        voteEligible(n);
    }
    
}
