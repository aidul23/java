package functional.programming;

import java.util.List;

public class StructuredProgramming {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,43,53,3,64,87,32,67,5,98);
        printAllOddNumber(numbers);
        
        System.out.println();
        
        List<String> courses = List.of("Spring","AWS","Azure","Docker","Spring Boot");
        printAllCourse(courses);
        
        System.out.println();
        
        printCourseWithWordSpring(courses);
        
        System.out.println();
        
        printCourseWithFourLetter(courses);
    }

    private static void printAllOddNumber(List<Integer> numbers) {
        for(int number: numbers) {
            if(number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    private static void printAllCourse(List<String> courses) {
        for(String course: courses) {
            System.out.println(course);
        }
    }

    private static void printCourseWithWordSpring(List<String> courses) {
        for(String course: courses) {
            if(course.contains("Spring")) {
                System.out.println(course);
            }
        }
    }

    private static void printCourseWithFourLetter(List<String> courses) {
        for(String course: courses) {
            if(course.length() >= 4 ) {
                System.out.println(course);
            }
        }
    }
}
