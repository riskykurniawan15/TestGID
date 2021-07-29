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
public class ConvertWaktu {
    public static void main(String[] args) {
        ConvertWaktu.konv_tgl("12:00:00 PM");
        ConvertWaktu.konv_tgl("12:00:00 AM");
    }
    
    public static void konv_tgl(String waktu){
        char[] cw = waktu.toCharArray();
        String hour = "";
        String minute = "";
        String second = "";
        
        String temp="";
        for(int i=0;i<cw.length;i++){
            if(cw[i]==':'){
                if(hour.equals("")){
                    hour=temp;
                }else if(minute.equals("")){
                    minute=temp;
                }
                
                temp="";
                continue;
            }
            
            if(cw[i]==' '){
                second=temp;
                temp="";
                continue;
            }
            temp+=cw[i];
        }
        
        if(temp.equals("AM")){
            int h=Integer.parseInt(hour);
            if(h==12){
                h-=12;
            }
            
            if(h<10){
                hour = "0"+String.valueOf(h);
            }else{                
                hour = String.valueOf(h);
            }
        }else if(temp.equals("PM")){
            int h=Integer.parseInt(hour);
            if(h<12){
                h+=12;
            }
            
            hour = String.valueOf(h);
        }
        
        System.out.println(waktu + " => " + hour + ":" + minute);
    }
}
