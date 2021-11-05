package repository;

import model.Course;

import java.util.List;

public class Course_Repo extends InMemoryRepository<Course> {

    List<Course> courses;

    /**
     * updates a certain course in the repo by giving it the attributes of an as parameter given course
     * @param obj
     * @return the updated course
     */
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
