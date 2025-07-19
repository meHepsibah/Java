package org.example;
import java.util.*;
class MathUtils{
    int a,b;
    //constructor
    MathUtils(int a,int b){
        this.a=a;
        this.b=b;
    }
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class Oops{
    public static void main(String Args[]) {
        MathUtils m1 =new MathUtils(5,6);
        System.out.println("add"+m1.add(5,6));
        MathUtils m2 =new MathUtils(0,0);
        System.out.println(m2.add(7.5,6.3));
    }
}

