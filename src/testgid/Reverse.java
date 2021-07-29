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
public class Reverse {
    public static void main(String[] args) {
        
//        Metode ambil dari input (ketikan)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukan sebuah karakter : ");        
//        String karakter = sc.next();
        
//        Metode variabel statis
        String karakter = "Aplikasi";
        char[] ck = karakter.toCharArray();
        
        for(int i=(ck.length-1);i>=0;i--){
            System.out.print(ck[i]);
        }

    }
}
