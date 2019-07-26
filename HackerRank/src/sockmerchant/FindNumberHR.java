package sockmerchant;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FindNumberHR {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        // String in_ = Integer.parseInt(br.readLine().trim());
        int N = sc.nextInt();
        int X = sc.nextInt();
        long K = sc.nextLong();
        String S = sc.next();
        String out_ = Find_It(X, K, S, N);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static String Find_It(int X, long K, String S, int N){


//        List blocks = new ArrayList();
//        int k=0;
//        List block  = new ArrayList();
//        for(int i=0; i<S.length(); i++){
//            block.add(S.charAt(i));
//            k++;
//            if(k==X){
//                k=0;
//                blocks.add(block);
//                block = new ArrayList();
//            }
//        }

        List blocks = new ArrayList();

        for(int i=0; i<S.length(); i=i+X){
            System.out.println(i);
            if (i+X<S.length()) {
                blocks.add(S.substring(i,i+X).chars().mapToObj(c -> (char)c).collect(Collectors.toList()));
            }else {
                blocks.add(S.substring(i,S.length()).chars().mapToObj(c ->  (char)c).collect(Collectors.toList()));
            }
        }

//        System.out.println("abcd");






//        System.out.println(S);
//
//        String[] result = IntStream
//                .iterate(0, i -> i + X)
//                .limit((int) Math.ceil(S.length() / X))
//                .mapToObj(i ->
//                        S.substring(i, Math.min(i + X, S.length()))).toArray(String[]::new);
//
//
//
////        Arrays.stream(result).forEach(System.out::println);
//
//
//
//
//        List<Character> characters = new ArrayList<Character>();
//        List<List<Character>> blocks = new ArrayList<List<Character>>();
//
//        for(int i=0;i<result.length;i++){
//            for (int block=0;block<result[i].length();block++) {
//                characters.add(result[i].charAt(block));
//            }
//            blocks.add(characters);
//        }
//
//
//
//
//        System.out.println(blocks.size());

//        characters.forEach(System.out::println);

//        blocks.forEach(o -> { o.foreach()});

        return "test";
    }
}
