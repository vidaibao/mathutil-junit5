/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vidaibao.swt.mathutil.junit5.core;

/**
 *
 * @author Owner
 */
public class MathUtil {
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid input. Must be between 1 - 20!");
        if (n == 0 || n == 1)
            return 1;
        return n * getFactorial(n - 1);
    }
}
