/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghaffar;

import java.util.Scanner;

/**
 *
 * @author Lab-5
 */
public class exercise2 {
    public static void main(String[] args)
    {
        System.out.println("Enter the values of a and b and c");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Value of a="+a);
         int b= sc.nextInt();
        System.out.println("Value of a="+b);
         int c= sc.nextInt();
        System.out.println("Value of a="+c);
           double quad;
        quad = (double)(-b + Math.sqrt(b* b - 4.0 * a *c));
       System.out.print("Solution of the following values is ="+quad);
       
    }
    
}
