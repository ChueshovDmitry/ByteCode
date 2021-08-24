package com.company;

public class Main {
    public static void main(String[] args) {
        
        //break(goto) and return test byte code
        TestSwitch testSwitch = new TestSwitch();
        testSwitch.setName("s");
        testSwitch.a();
        System.out.println(testSwitch.getName());
    
        TestException testException = new TestException();
        testException.creteTestTryCath();
        
        S.ss();
    }
}