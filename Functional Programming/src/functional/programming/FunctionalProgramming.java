package functional.programming;

import java.util.List;

public class FunctionalProgramming {
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
        numbers.stream()
                .filter(number -> number % 2 !=0) //lamda expression
                .forEach(System.out::println); //method reference
    }

    private static void printAllCourse(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printCourseWithWordSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCourseWithFourLetter(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }
    
}
