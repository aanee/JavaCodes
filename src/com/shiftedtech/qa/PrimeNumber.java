package com.shiftedtech.qa;

public class PrimeNumber {


        public boolean isPrimeNumber(int number){

            for(int i=2; i<=number/2; i++){
                if(number % i == 0){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] arg) {
        PrimeNumber prime= new PrimeNumber();
        System.out.println("15 is a prime number. " + prime.isPrimeNumber(15));
    }
}
