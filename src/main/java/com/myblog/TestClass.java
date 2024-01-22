package com.myblog;

public class TestClass {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        int val = test.test();
        System.out.println(val);
    }
    public int test(){
        int val = SampleTest.test1();
        return val;
    }
}
