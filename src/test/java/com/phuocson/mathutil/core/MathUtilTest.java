/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuocson.mathutil.core;

import static com.phuocson.mathutiljunit5.core.MathUtil.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author phuocson
 */
public class MathUtilTest {
    //Chơi DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hóa data này
    //vào trong câu lệnh kiềm thử
    
    //chuẩn bị bộ data
    public static Object[][] initData() {
        return new Integer[][]{
                                {1, 1},
                                {2, 2},
                                {5, 120},
                                {6, 720}
                              };
    }
    @ParameterizedTest
    @MethodSource(value = "initData")//tên hàm cung cấp data, ngầm định thứ tự của 
    //các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightArgReturnWell(int input, long expected){
        assertEquals(expected, getFactory(input));
    }
    
    
    
    @Test
    public void testGetFactorialGivenRightArgReturnsWell(){
        assertEquals(24, getFactory(4));
    }
    
    //Bắt ngoại loại khi đưa data cà chớn 
    @Test
    public void testGetFactorialGivenWrongArgThrowException(){
        //xài biểu thức lambda
        //hàm nhận tham số thứ 2 là 1 cái object/có code implement cái
        //functional interface tên là Executable - có 1 hàm duy nhất không có code
        //tên là excute()
        //chơi chậm
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactory(-5);
//            }
//        };
        
        //assertThrows(IllegalArgumentException.class, exObject);   
         
        Executable exObject = () -> getFactory(-5);

        assertThrows(IllegalArgumentException.class, () -> getFactory(-5));        
        
    }
}
