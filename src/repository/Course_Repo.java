package repository;

import model.Course;

import java.util.List;

public class Course_Repo extends InMemoryRepository<Course> {

    List<Course> courses;

    @Override
    public Course update(Course obj) {
        Course courseToUpdate = this.repoList.stream()
                .filter(course -> course.getClass() == obj.getClass())
                .findFirst()
                .orElseThrow();

        courseToUpdate.setCredits(obj.getCredits());
        courseToUpdate.setTeacher(obj.getTeacher());
        courseToUpdate.setStudentsEnrolled(obj.getStudentsEnrolled());
        courseToUpdate.setName(obj.getName());
        courseToUpdate.setMaxEnrollment(obj.getMaxEnrollment());

        return courseToUpdate;
    }
}
