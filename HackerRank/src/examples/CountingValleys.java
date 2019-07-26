package examples;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : s.toCharArray()){
            if(c == 'U') {
                System.out.println("before U level:"+lvl);
                ++lvl;
                System.out.println("after U level:"+lvl);
            }
            if(c == 'D') {
                System.out.println("before D level:"+lvl);
                --lvl;
                System.out.println("after D level:"+lvl);
            }

            // if we just came UP to sea level
            if(lvl == 0 && c == 'U') {
                System.out.println("tst");
                ++v;
            }
        }
        System.out.print(v);
        return v;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }

}
