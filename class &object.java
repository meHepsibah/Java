package org.example;
import java.util.*;
class Car{
    String s="Hi";
    int i=10;
    void Message()
    {
        System.out.println("Hepsibah");
    }
}
public class Oops {

    public static void main(String[] args)
    {
        Car myCar=new Car();
        System.out.println(myCar.s);
        System.out.println(myCar.i);
        myCar.Message();
    }

}