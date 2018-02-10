package com.shiftedtech.qa;

public class DoubleCharacter {
    public static void main(String[] arg) {
        DoubleCharacter name = new DoubleCharacter();
        System.out.println(name.doubleLetters(new char[]{'I', 'v', 'a', 'n'}));
        System.out.println(name.doubleLetters(new char[]{'A', 'n', 'e', 'e'}));
    }

    public boolean doubleLetters(char[] str) {
        for (int i = 0; i < str.length; i++) {
            char d = str[i];
            for (int j= i + 1; j < str.length; j++){
                if(d == str[j]){
                    return true;
                }
            }
        } return false;
    }
}