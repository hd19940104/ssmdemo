package com.zixue.ssm.test;

public class Demo {

    static  String name;
    int age;
    public  String test(){
        new Demo();
        return null;
    }

    public static void main(String[] args) {

    }


    public Demo(){

    }
    //
    public Demo(String name){
        this.name=name;
    }


}



class Demo2{
    public static void main(String[] args) {
        Demo.name=null;
        new Demo().age=0;
    }
}
