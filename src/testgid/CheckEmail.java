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
public class CheckEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan email anda ");
        String email = sc.next();
        
        char[] ae = email.toCharArray();
        
        String name = "";
        String domain = "";
        Boolean ced = false;
        
        for(int i=0;i<ae.length;i++){            
            if(ae[i]=='@'){
                ced=true;
                continue;
            }
            
            if(ced==false){
                name+=ae[i];
            }else{
                domain+=ae[i];
            }
        }
        
        char[] LName = name.toCharArray();
        
        if(ced==false){
            System.out.println("Format email harus menggunakan '@' ");
        }else if(LName.length>20){
            System.out.println("Maksimal email name 20 karakter");
        }else{
            char[] cdomain = domain.toCharArray();
            Boolean dot = false;
            String subdom = "";
            String dom = "";
            
            for(int i=0;i<cdomain.length;i++){
                if(cdomain[i]=='.'){
                    dot=true;
                }
                
                if(dot==false){
                    subdom+=cdomain[i];
                }else{
                    dom+=cdomain[i];
                }
            }
                  
            
            if(dot==false){
                System.out.println("Domain harus menggunakan titik '.'");
            }else if(subdom==""){
                System.out.println("Tidak ada subdomain");
            }else{
                if(dom.equals(".co.id")||dom.equals(".id")){
                    System.out.println("Format Email benar, email anda : "+email);
                }else{
                    System.out.println("Domain yang diperbolehkan adalah (.co.id) dan (.id)");
                }
            }
        }
    }
}
