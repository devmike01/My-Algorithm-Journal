/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author apple
 */
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        int c =0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String inp = sc.next().replaceAll("[^A-Za-z]+", "");
            String sb ="";
            String oldS= "";
            //int i = 0;
       
            //System.out.println(sb.concat(" "+inp.length()));
            for(int i=0; i < inp.length(); i++){
                if((i % 2) ==0){
                    char ch = inp.charAt(i);
                    sb += String.valueOf(ch);
                }else{
                    char ch = inp.charAt(i);
                    oldS += String.valueOf(ch);
                }
            }
            if(!sb.equals("")){
                System.out.println(sb.concat(" "+oldS));
            }
        
    }
   }


}


