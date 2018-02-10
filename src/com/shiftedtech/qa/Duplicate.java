package com.shiftedtech.qa;

public class Duplicate {


        public boolean containDuplicates (int[] arr){
            for (int i = 0; i < arr.length; i++) {
                int dup = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (dup == arr[j]) {
                        return true;
                    }
                }
            }return false ;
        }


    public static void main(String[] args) {
            Duplicate num = new Duplicate();
            System.out.println(num.containDuplicates(new int[]{1,2,2,3}));
            System.out.println(num.containDuplicates(new int[]{1,5,3,7}));
    }
    }