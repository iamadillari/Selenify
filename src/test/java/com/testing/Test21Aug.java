package com.testing;

public class Test21Aug {
    public static void main(String[] args) {
        int[] a = {20,30,10,6,5,50};
        int largest =Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        //output-> 2nd highest element
        for (int i = 0; i < a.length; i++) {
         if(a[i]>largest) {
             secondLargest = largest;
             largest = a[i];
         }
         else if (a[i]>secondLargest && a[i] !=largest) {
             secondLargest=a[i];
         }
        }
        System.out.println("2nd Highest Number from the array is: "+secondLargest);
        }
    }

