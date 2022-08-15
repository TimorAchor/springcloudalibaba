package com.timor.controller;

public class TestController {

    public static void main(String[] args) {
        int a=1;
        switch (a){
            default:
                System.out.println("推送失败：无对应接口");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
        }


    }
}
