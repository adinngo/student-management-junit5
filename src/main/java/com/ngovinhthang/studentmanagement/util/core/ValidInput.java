/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngovinhthang.studentmanagement.util.core;

/**
 *
 * @author gnaht
 */
public class ValidInput {

    //định dạng xài Regular Expression
    public static String getID(String id) {
        boolean match;
        while (true) {
            id = id.trim().toUpperCase();
            match = id.matches("^(?:SE|se)\\d{6}$");//RegularExpression
            if (id.length() == 0 || id.isEmpty() || match == false) {
                throw new IllegalArgumentException("The format of id is SE|XXXXXX (X stands for a digit)");
            } else {
                return id;
            }
        }
    }

}
