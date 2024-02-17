package Aggregation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course cs4800 = new Course();
        cs4800.setCourseName("CS4800");

        Instructor instructor = new Instructor();
        instructor.setFirstName("Nima");
        instructor.setLastName("Davarpanah");
        instructor.setOfficeNumber("3-2636");
        cs4800.addInstructor(instructor);

        Textbook textbook = new Textbook();
        textbook.setTitle("Clean Code");
        textbook.setAuthor("Robert C. Martin");
        textbook.setPublisher("Prentice Hall");
        cs4800.addTextbook(textbook);

        System.out.println(cs4800);
        System.out.println("Adding new instructor and textbook:");

        Instructor instructor2 = new Instructor();
        instructor2.setFirstName("John");
        instructor2.setLastName("Doe");
        instructor2.setOfficeNumber("1-2345");
        cs4800.addInstructor(instructor2);

        Textbook textbook2 = new Textbook();
        textbook2.setTitle("CS Book");
        textbook2.setAuthor("Jane Doe");
        textbook2.setPublisher("Book publisher");
        cs4800.addTextbook(textbook2);

        System.out.println(cs4800);
    }
}