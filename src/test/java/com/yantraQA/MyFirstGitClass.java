package com.yantraQA;

public class MyFirstGitClass {

    public void MyFirstGitClass(int a , int b){
            int sumVal = a+b;
            System.out.println("sum is :"+sumVal);
    }

    public void tableofNum(int num){
        for(int i= 1; i<= 10 ; i++){
            int prev = num * i;
            System.out.println("val is :"+prev);
        }

    }

    public  static void main(String args[]){
            MyFirstGitClass obj = new MyFirstGitClass();
           // obj.MyFirstGitClass(50,50);
            obj.tableofNum(3);
    }

}
