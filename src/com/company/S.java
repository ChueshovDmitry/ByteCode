package com.company;

/**
 * @author Dmitry Chueshov 25.08.2021 1:21
 * @project Shk
 */

public class S {
    public static void ss() {
        for (int i = 0; i < 100; i++) {
            if (i == 4) {
                break;  //break завершить цикл, если i = 4
            }
            System.out.println("i: " + i);
        }
        return;
    }
    
}
