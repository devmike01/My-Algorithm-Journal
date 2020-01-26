/**

Problem can be found here: https://www.hackerrank.com/challenges/contacts/problem?isFullScreen=true

This solution works but needs some improvements.

**/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the contacts function below.
     */
    static int[] contacts(String[][] queries) {
        ArrayList<Integer> ad = new ArrayList();
       // int[] intArr = new int[a];
        /*
         * Write your code here.
         */
        int count =0;
        String sb = "";
         //List<String> sb = new ArrayList<String>();
         for(String[] query: queries){
            String q = query[0]; //command
            String r = query[1]; // keyword
        
            //System.out.println(q);

            if(q.equals("add")){
                //sb.add(r);
                sb +=r +",";
                //sb.append(",");

            }

            if(q.equals("find")){
                String[] arr = sb.split(",");
                //intArr = new int[arr.length];
                //list = new int[arr.length];
                for (String arr1 : arr) {
                    if (arr1.contains(r)) {
                        count +=1;
                    } else {
                        count =0;
                    }
                }
        
                ad.add(count);
                //System.out.println("result: "+count);
            }
         }

         
        /*int[] intArr = new int[a];
        for(int i =0; i < intArr.length; i++){
            intArr[i] = count;
        }
        System.out.print(count);*/
        int[] re = new int[ad.size()];
        for(int e =0; e < ad.size(); e++){
            re[e] = ad.get(e);
        }
        return re;// ad.stream().mapToInt(Integer::intValue).toArray();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
