package com.java.MyFirstPackage;
public class JavaPackage {
    public static void printStatement(){
        System.out.println("Hello");
    }
    public static  void printStatementWithName(String name){
        System.out.println("Hello "+name);
    }
    public static void printArray(int array[],int size){
        System.out.println("Printing Single Dimension Array");
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}
