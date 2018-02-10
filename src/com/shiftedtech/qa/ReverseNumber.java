package com.shiftedtech.qa;

public class ReverseNumber {

    public int reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }

    public static void main(String a[]){
        ReverseNumber reverse = new ReverseNumber();
        System.out.println("12345 reversed = "+ reverse.reverseNumber(12345));
        System.out.println("13 reversed = " + reverse.reverseNumber(13));
    }
}

