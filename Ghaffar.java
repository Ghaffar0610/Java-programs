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
public class Ghaffar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print("Enter the radius of the circle");
    Scanner sc= new Scanner(System.in);
    int rad= sc.nextInt();
    double area=(rad*rad)*3.14;
    System.out.println("Area of the circle is"+area);
       
    }
    
}
