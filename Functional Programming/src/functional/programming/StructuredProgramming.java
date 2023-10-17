package functional.programming;

import java.util.List;

public class StructuredProgramming {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        printAllOddNumber(numbers);
        
        System.out.println();
        
        List<String> courses = List.of("Spring","AWS","Azure","Docker","Spring Boot");
        printAllCourse(courses);
        
        System.out.println();
        
        printCourseWithWordSpring(courses);
        
        System.out.println();
        printCourseWithFourLetter(courses);
        
        System.out.println();
        printSquareNumber(numbers);
        
        System.out.println();
        printQubeOfOddNumber(numbers);
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

    private static void printSquareNumber(List<Integer> numbers) {
        for(int number: numbers) {
            System.out.println(number * number);
        }
    }

    private static void printQubeOfOddNumber(List<Integer> numbers) {
        for(int number: numbers) {
            if(number % 2 != 0) {
                System.out.println((int)Math.pow(number, 3));
            }
        }
    }
}
