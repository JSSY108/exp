/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author MelodyCloud
 */
public class first {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        int count = 0;
        
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
            count ++;
            
            if (num < 0){
                System.out.print("Number must be positive");
            }

        } while (num <= 0);
        System.out.println("You entered " + num );
        System.out.printf("You have entered %d numbers", count);

    }
}
