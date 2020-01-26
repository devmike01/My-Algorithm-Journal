/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Solution2 {
   
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String msg;
        
        if(N%2 >0){
            //odd
            msg = "Weird";
        }else{
            //even
          
            if(N <= 20 && N > 6){
                msg = "Weird";
            }else{
                msg = "Not Weird";
            }
        }
        
        System.out.print(msg);

        scanner.close();
    }
    
}
