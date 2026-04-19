package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    // Generic zip method
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();

        int i = 0;

        // alternate elements
        while (i < list1.size() && i < list2.size()) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            i++;
        }

 
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

      
        while (i < list2.size()) {
            result.add(list2.get(i));
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3);
        List<Integer> b = List.of(10, 20, 30, 40);

        List<Integer> result = zip(a, b);
        System.out.println(result); // [1, 10, 2, 20, 3, 30, 40]
    }
}
