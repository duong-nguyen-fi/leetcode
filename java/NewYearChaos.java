//Medium
//https://www.hackerrank.com/challenges/one-week-preparation-kit-new-year-chaos/problem
// inspriration https://www.youtube.com/watch?v=LgszjFykAbE

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    // Write your code here
        int totalBrides=0;
        int p1=1;
        int p2=2;
        int p3=3;

        for (int i=0; i<q.size();i++){
            if (q.get(i) == p1){
                // (1) 2 3 4
                p1=p2;
                p2=p3;
                p3++;
            }
            else if (q.get(i) == p2){
                // 2 1 3 4
                totalBrides++;
                p2=p3;
                p3++;
            }
            else if (q.get(i) == p3){
                
                totalBrides+=2;
                p3++;
            }
            else{
                //System.out.println("Comparing pos "+i +" q(i): "+q.get(i));
                //System.out.println("p1="+p1+",p2="+p2+",p3="+p3);
                System.out.println("Too chaotic");
                return;
            }
                
               
        }
        System.out.println(totalBrides);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
