package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//take a reference variable of InterfaceThree and assign the object of ClassTWo
        interfaceThree obj = new ClassTwo();
//print the object of InterfaceThree (variable of InterfaceThree)
        PrintStream stream
                = new PrintStream(System.out);
        stream.print(obj);

//call the methodOne() methodTwo() and methodThree() on the InterfaceThree variable
        obj.methodOne();
        obj.methodTwo();
        obj.methodThree();
//take a reference variable of InterfaceOne and assign the object of ClassTWo
        interfaceOne obj1 = new ClassTwo();
//call the methodOne() on the InterfaceOne variable.
        obj1.methodOne();
//downcast the InterfaceOne reference variable to the ClassTwo object.

//with the object of ClassTwo class the methodTwo() and methodThree().
        ClassTwo Obj2 = (ClassTwo) obj1;
        Obj2.methodTwo();
        Obj2.methodThree();

    }

}
