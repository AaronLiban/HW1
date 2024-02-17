package Aggregation;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<Textbook> textbooks = new ArrayList<>();

    public Course() {

    }
    public Course(String courseName, ArrayList<Instructor> instructor, ArrayList<Textbook> textbook) {
        this.courseName = courseName;
        instructors = instructor;
        textbooks = textbook;
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void removeInstructor(Instructor instructor) {
        instructors.remove(instructor);
    }

    public void removeTextbook(Textbook textbook) {
        textbooks.remove(textbook);
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Instructor> getInstructor() {
        return instructors;
    }

    public ArrayList<Textbook> getTextbook() {
        return textbooks;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(ArrayList<Instructor> instructor) {
        this.instructors = instructor;
    }

    public void setTextbook(ArrayList<Textbook> textbook) {
        this.textbooks = textbook;
    }

    @Override
    public String toString() {
        return "CourseName='" + courseName + "'" +
                "\nInstructors=" + instructors +
                "\nTextbooks=" + textbooks;
    }
}

