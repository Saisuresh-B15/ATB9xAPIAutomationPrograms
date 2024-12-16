package com.ex_samplecheck;

public class APITesting_04_builderpattern {

    public APITesting_04_builderpattern step1(){
        System.out.println("Step1");
        return this;
    }
    public APITesting_04_builderpattern step2(){
        System.out.println("Step2");
        return this;
    }
    public APITesting_04_builderpattern step3(String Param){
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
        APITesting_04_builderpattern sai = new APITesting_04_builderpattern();
        sai.step1().step2().step3("suresh");
        System.out.println("Suresh");
    }

}
