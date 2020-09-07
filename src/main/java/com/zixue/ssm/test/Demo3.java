package com.zixue.ssm.test;

public class Demo3 {

    final static    String PI="3.14";


    static {
        System.out.println("this is 静态代码块");
    }

    void demo(){
        System.out.println("this is demo()");
    }

    Demo3(){
        System.out.println("this is Demo3()");
    }

    {
        System.out.println("this is 代码块");
    }


    public static void main(String[] args) {
        System.out.println("this is main");
        Demo3 demo3 = new Demo3();
        demo3.demo();
        Demo3 demo33 = new Demo3();
        demo33.demo();
        StringBuffer stringBuffer =new StringBuffer();
        String n =stringBuffer.append("1").append("2").toString();
    }

}
