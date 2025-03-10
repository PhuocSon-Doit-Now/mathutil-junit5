/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuocson.mathutiljunit5.core;

/**
 *
 * @author phuocson
 */
public class MathUtil {
    public static long getFactory(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Sai");
        
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactory(n - 1);
    }
}
