package examples.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] b= new int[a.length];

        for(int i=0;i<a.length;i++){
            System.out.println((i+d)%a.length);
            b[i]=a[(i+d)%a.length];
        }

        for(int i=0;i<b.length;i++){
                System.out.println(b[i]);
            }

//        for(int rotation=0 ; rotation<d ;rotation++){
//            int temp = a[0];
//            for(int j=0;j<a.length;j++){
////                System.out.println("temp"+temp);
//                if(j+1==a.length){
//                    a[j] = temp;
//                    break;
//                }
//                a[j]=a[j+1];
//            }
//            for(int i=0;i<a.length;i++){
//                System.out.println(a[i]);
//            }
//        }
        return b;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        System.out.println(a);

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

}
