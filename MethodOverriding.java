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
}
// Child class extending MathUtils
class Multiply extends MathUtils{
    // Constructor calling parent constructor
   Multiply(int a, int b){
       super(a,b);
   }


    int add(int a, int b) {

        return a * b ;
    }

}

public class Oops{
    public static void main(String Args[]) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        MathUtils m1 =new MathUtils(a,b);
        System.out.println("add"+m1.add(a,b));
        Multiply m2 =new Multiply(a,b);
        System.out.println("multiply"+m2.add(a,b));
    }
}