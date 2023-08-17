package com.driver;

public class Main {

    public static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        A objA = new A(); // Creating an object of class A
        System.out.println(objA.meth()); // Task 3: Calling method meth of class A

        B objB = new B(); // Creating an object of class B
        System.out.println(objB.meth()); // Task 5: Calling overridden method from obj of class B
    }
}