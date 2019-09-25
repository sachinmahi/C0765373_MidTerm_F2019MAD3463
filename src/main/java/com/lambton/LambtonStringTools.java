package com.lambton;

public class LambtonStringTools
{
    public static void main(String[] args)
    {
        String s1 = "sachin";
        char R[] = s1.toCharArray();
        char rev[] = new char[R.length];
        int cnt = 0;
        for (int i = R.length - 1; i >= 0; i--) {
            rev[cnt++] = R[i];
        }
        String reverseString = new String(rev);
        System.out.println("Reverse String = " + reverseString);
    }

}