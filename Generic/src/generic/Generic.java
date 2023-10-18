/*
A Generic class simply means that the items or functions 
in that class can be generalized with the parameter(example T) 
to specify that we can add any type as a parameter 
in place of T like Integer, Character, String, Double or any other user-defined type.
*/
package generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        MyGenericClass<Integer> myGenereicClass = new MyGenericClass<>(23);
        myGenereicClass.getValue();
        MyGenericClass<String> myGenereicClass1 = new MyGenericClass<>("Aidul");
        myGenereicClass1.getValue();
        MyGenericClass<Double> myGenereicClass2 = new MyGenericClass<>(23.23);
        myGenereicClass2.getValue();
        
        genericMethod("Islam");
        genericMethod(32);
        genericMethod(32.32);
        
        genericMethod1("Aidul","Islam");
        genericMethod1(50,100);
        genericMethod1(32.32,23.23);
        
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        printList(intList);
    }
    
    private static <T> void genericMethod(T value) {
        System.out.println(value+"!!");
    }
    
    private static <T , V> void genericMethod1(T value, V value1) {
        System.out.println(value+"!!"+" "+value1);
    }
    
    //wildcard
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }
    
}
