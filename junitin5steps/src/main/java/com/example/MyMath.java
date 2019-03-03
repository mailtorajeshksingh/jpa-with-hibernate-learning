package com.example;

/**
 * Created by Rajesh Singh 3/3/2019
 **/
public class MyMath {

    int sum(int[] numbers ){
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
