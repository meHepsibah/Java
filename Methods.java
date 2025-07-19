package org.example;
import java.util.*;
public class Oops {

    public static void main(String[] args) {
        Method m=new Method();
        System.out.println(m.add());

    }
}
class Method {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int add() {
        return (a + b);
    }
}