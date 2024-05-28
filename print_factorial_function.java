/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package function;

/**
 *
 * @author Kruti Vadaliya
 */
public class print_factorial_function {

    /**
     * @param args the command line arguments
     */
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
        fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }
    
}
