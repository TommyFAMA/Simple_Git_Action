package com.example;

import static org.junit.Assert.*; //this is a class

import java.beans.Transient;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class MathTest 
{
    static Math m; //static field || this field is shared

    @BeforeClass //org.junit.BeforeClass
    public static void setup(){ //static method is created that 
                                //can be called without creating a new object.
        m = new Math();
    }

    @Test
    public void canAdd(){ 
        assertEquals(12, m.add(9, 3));
    }

    @Test
    public void canDivide() { 
        assertEquals(3, m.divide(6, 2), 0.01); //delta=0.01
    }

    @Test
    public void canSubstract() {
        assertEquals(1, m.substract(2, 1));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, m.multiply(2, 3));
    }

   






}
