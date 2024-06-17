/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngovinhthang.studentmanagement.util.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author gnaht
 * DDT: Data Driven Testing là kĩ thuật test tách tập data
 * test ra 1 bên và hàm test ra 1 rồi sau đó truyền tập data test vào như tham số
 */

public class TestValidInputDDT {
    
    //bộ data để test
    //data for testing
    public static Object[][] initData() {
        return new String[][]{
                                //tự ngầm hiểu
                                //expected    input
                                {"SE999999","SE999999"},
                                {"SE999999","se999999"},
                                {"SE999999","Se999999"},
                                {"SE999999","sE999999"},
                               };
    }
    
    
    @ParameterizedTest
    @MethodSource(value = "initData")//tên hàm cung cấp data
                                        
    public void testGetIdGivenRightArgumentReturnsWell(String expected, String input){
        Assertions.assertEquals(expected, ValidInput.getID(input));
        
    }
}
