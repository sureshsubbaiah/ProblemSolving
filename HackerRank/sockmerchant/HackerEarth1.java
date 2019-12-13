package sockmerchant;

class HackerEarth1{
    public static void main(String args[])
    {
        byte varA[] = { 71, 72, 73, 74, 75, 76 };
        byte varB[] = { 65, 66, 67, 68, 69, 70 };
        System.arraycopy(varA, 2, varB, 1, varA.length-3);
        System.out.print(new String(varA) + " " + new String(varB));
    }
}

