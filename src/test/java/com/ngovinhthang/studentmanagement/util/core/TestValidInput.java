/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ngovinhthang.studentmanagement.util.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gnaht
 */
public class TestValidInput {

    @Test
    public void testGetIdGivenRightArgumentReturnsWell() {
        assertEquals("SE222222", ValidInput.getID("se222222"));
        assertEquals("SE222222", ValidInput.getID("sE222222"));
        assertEquals("SE222222", ValidInput.getID("Se222222"));
        assertEquals("SE002204", ValidInput.getID("SE002204"));
    }
    
    //nếu đưa vô sai thì phải bắt đúng cái Exception
    @Test
    public void testGetIdGivenWrongArgumentThrowsExceptionLambdaExpression() {
        assertThrows(IllegalArgumentException.class, () -> ValidInput.getID("IA222222"));
        assertThrows(IllegalArgumentException.class, () -> ValidInput.getID("SE2222"));
        assertThrows(IllegalArgumentException.class, () -> ValidInput.getID("se222"));
    }
    
    @Test
    public void testGetIdGivenWrongArgumentThrowsException_TryCatch() {
        try {
            ValidInput.getID("IA222222");
        } catch (Exception e) {
            //chủ động kiểm soát ngoại lệ bằng try catch
            //so sánh hai ngoại lệ
            assertEquals("The format of id is SE|XXXXXX (X stands for a digit)", e.getMessage());
        }
    }
    
    
}
