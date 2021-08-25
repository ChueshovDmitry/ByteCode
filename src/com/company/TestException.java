package com.company;

/**
 * @author Dmitry Chueshov 25.08.2021 0:46
 * @project Shk
 */

public class TestException {
    
    public void creteTestTryCath(){
        try{
            System.out.println("try");
            while(true){
                break;
            }
        } catch(Exception e){
            System.out.println("catch");
        } finally{
            System.out.println("finally");
            while(true){
                break;
            }
    
        }
    }
}
