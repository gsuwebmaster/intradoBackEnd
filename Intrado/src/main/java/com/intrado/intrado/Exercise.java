package com.intrado.intrado;

public class Exercise {
    public static void main(String[] args) {
        int i = 1;
        String name = "";
        while (i <= 1000) {
            if(i%3 == 0 && i%5 == 0){
                name = i + " FizzBuzz";
            }else if(i%5 == 0){
                name = i + " Buzz";
            }else if(i%3 == 0){
                name = i + " Fizz";
            }else{
                name = i + " noise";
            }
            System.out.println(name);
            i++;
        }

        System.out.println("thank you :)");
    }
}
