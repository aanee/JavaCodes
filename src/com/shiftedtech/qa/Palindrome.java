package com.shiftedtech.qa;

public class Palindrome {
    public static void main(String[] arg) {
        Palindrome pal = new Palindrome();
        System.out.println(pal.isPalindrome("out"));
        System.out.println(pal.isPalindrome ("hello"));
        System.out.println(pal.isPalindrome ("madam"));
    }
        public static boolean isPalindrome (String word){
            String str = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                str = str + word.charAt(i);
            }
            if (str.equalsIgnoreCase(word)) {
                return true;
            }
             else {
                return false;
            }
        }
    }

