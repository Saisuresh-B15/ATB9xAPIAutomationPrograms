package com.ex_samplecheck;

public class APITesting_03_NoDesignPattern {

    public void step1(){
        System.out.println("Step1");
    }
    public void step2(){
        System.out.println("Step2");
    }
    public void step3(String Param){
        System.out.println("Step3");
    }

    public static void main(String[] args) {
        APITesting_03_NoDesignPattern NP = new APITesting_03_NoDesignPattern();
        NP.step1();
        NP.step2();
        NP.step3("sai");
    }


}

