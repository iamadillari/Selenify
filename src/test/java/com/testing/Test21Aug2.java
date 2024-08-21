package com.testing;

public class Test21Aug2 {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,4,4,4,5,5};
        //output-> {1,2,3,4,5}

        int temp =0;
        for (int i = 0; i < a.length; i++) {
            if(i == 0  || a[i] !=a[i-1])
            {
                a[temp] = a[i];
                temp++;
            }
        }

        System.out.println("Only Unique Elements: {");
        for (int i = 0; i < temp; i++) {
            if(i>0)
            {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.println("}");
    }

}
