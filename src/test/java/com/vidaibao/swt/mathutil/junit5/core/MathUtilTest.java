/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vidaibao.swt.mathutil.junit5.core;

import static com.vidaibao.swt.mathutil.junit5.core.MathUtil.getFactorial;
//dành riêng cho những hàm static, gọi hàm mà bỏ qua tên class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Owner
 */
public class MathUtilTest {
    //play DDT, split data 
    
    public static Object[][] initData(){
        return new Integer[][] {
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {4, 24},
                                    {5, 120},
                                    {6, 720},
                                    {7, 5040},
                                    {8, 4320},
                                };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")//push data function Name
    public void testGetFactorialGivenRightArgReturnWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
    
    
    
//    @Test
//    public void testGetFactorialGivenRightArgReturnWell(){
//        assertEquals(120, getFactorial(5));
//    }
    
    //Catch exception
    @Test
    public void testGetFactorialGivenWrongArgReturnException(){
        //Lambda
        //hàm nhận arg2 là 1 cái obj có code implement cái
        //functional interface tên là Executable tên execute()
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };

//        Executable exObject = () ->  getFactorial(-5); 
        assertThrows(IllegalArgumentException.class,
                () ->  getFactorial(-5));
        
        
        
    }
    
    
    
    
    
    
}
