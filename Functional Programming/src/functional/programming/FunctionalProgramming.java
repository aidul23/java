package functional.programming;

import java.util.List;

public class FunctionalProgramming {
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
        numbers.stream() //convert to stream
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

    private static void printSquareNumber(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number) //mapping
                .forEach(System.out::println);
    }

    private static void printQubeOfOddNumber(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 !=0)
                .map(number -> (int) Math.pow(number, 3))
                .forEach(System.out::println);
    }
    
}
