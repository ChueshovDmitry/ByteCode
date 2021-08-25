package com.company;

/**
 * @author Dmitry Chueshov 24.08.2021 23:44
 * @project
 */

public class TestSwitch {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void a(){
        switch(name){
            case "s": name="ss";
            break;
            case "a":name="sds";
            return;
            case "as":name="assssss";
        }
    }
}
