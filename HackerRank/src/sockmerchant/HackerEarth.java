package sockmerchant;

class HackerEarth{
    public static void main(String args[])
    {
        int arr[][] = {{ 1, 2, 3},{4,5,6}};
        int total = 0;
        for (int x = 0; x < 2; ++x)
            for (int y = 0; y <  2; ++y)
                total = total + arr[x][y];
        System.out.print(total / 5);
    }
}