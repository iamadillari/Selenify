package com.testing;

public class NewHelloWorld {
    public static void main (String[] args) {
        int[] numbers = {1,2,3,4,5};




        System.out.println(numbers[0]); //first element of the numbers array
        System.out.println(numbers[4]); //last element of the numbers array


        for (int i = numbers.length-1; i>=0 ; i--)
        {
            System.out.println(numbers[i]);
        }

        System.out.println("Number of elements in the array is: "+numbers.length);
    }
}
