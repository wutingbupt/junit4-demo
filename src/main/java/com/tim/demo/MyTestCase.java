package com.tim.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Junit4Runner.class)
public class MyTestCase {


    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }
    
    @Before
    public void beforeTest(){

    }
    
    @After
    public void afterTest(){
    }
    
    @Test
    public void testCase1(){
        System.out.println("Test 1");
    }
    
    @Test
    public void testCase2(){
        System.out.println("Test 2");
    }
}
