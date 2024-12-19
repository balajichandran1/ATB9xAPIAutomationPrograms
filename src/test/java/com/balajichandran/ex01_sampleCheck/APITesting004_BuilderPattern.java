package com.balajichandran.ex01_sampleCheck;

public class APITesting004_BuilderPattern {


    public APITesting004_BuilderPattern step1(){
        System.out.println("Step 1");
        return this;
    }

    public APITesting004_BuilderPattern step2(){
        System.out.println("Step 2");
        return this;
    }

    public APITesting004_BuilderPattern step3(String param){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting004_BuilderPattern bp = new APITesting004_BuilderPattern();

        bp.step1().step2().step3("hello! good morning");
    }

}
