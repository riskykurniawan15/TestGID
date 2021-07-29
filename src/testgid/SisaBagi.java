/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgid;

import java.util.Scanner;

/**
 *
 * @author RISKY
 */
public class SisaBagi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai berupa numerik ");
        int nilai = sc.nextInt();
        
        if((nilai%3)==0){
            System.out.print("Hello ");
        }
        
        if((nilai%5)==0){
            System.out.print("World");
        }
    }
}
