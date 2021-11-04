package model;

import java.util.List;

public class Student extends Person {

    long studentID;
    int totalCredits;
    List<Course> enrolledCourses;

    public Student() {
    }

    public Student(long studentID, int totalCredits, List<Course> enrolledCourses) {
        this.studentID = studentID;
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }

    public Student(String firstName, String lastName, long studentID, int totalCredits, List<Course> enrolledCourses) {
        super(firstName, lastName);
        this.studentID = studentID;
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
