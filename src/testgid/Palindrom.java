/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgid;

/**
 *
 * @author RISKY
 */
public class Palindrom {
    public static void main(String[] args) {
        Palindrom.cekPalindrom("Katak");
        Palindrom.cekPalindrom("Ibu");
    }
    
    public static void cekPalindrom(String karakter){
        char[] ck = karakter.toCharArray();
        String balik = "";
        
        for(int i=(ck.length - 1);i>=0;i--){
            balik += ck[i];
        }
        
        if(karakter.toLowerCase().equals(balik.toLowerCase())){
            System.out.println(karakter + " di balik " + balik + " => Palindrom");
        }else{
            System.out.println(karakter + " di balik " + balik + " => Bukan Palindrom");
        }
    }
}
