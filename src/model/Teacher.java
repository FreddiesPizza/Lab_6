package model;

import java.util.List;

public class Teacher extends Person{

    List<Course> courses;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, List<Course> courses) {
        super(firstName, lastName);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * adds a course to the teacher's list of courses
     * @param new_course
     */
    public void addCourse(Course new_course){
        courses.add(new_course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", courses=" +  courses +
                '}';
    }
}
