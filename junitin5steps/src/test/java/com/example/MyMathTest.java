package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rajesh Singh 3/3/2019
 **/
class MyMathTest {

    @BeforeEach
    void setUp() {
        System.out.println("In Setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after setup");
    }

    @Test
    void sumWith3numbers() {
        System.out.println("In sumWith3numbers");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1,2,3});
        assertEquals(result, 6);
    }

    @Test
    void sumWithnumbers() {
        System.out.println("In sumWithnumbers");

        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});
        assertEquals(result, 3);
    }
}