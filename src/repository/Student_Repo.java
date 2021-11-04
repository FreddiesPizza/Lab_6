package repository;

import model.Student;

public class Student_Repo extends InMemoryRepository<Student> {

    @Override
    public Student update(Student obj) {
        Student studentToUpdate = this.repoList.stream()
                .filter(dog -> dog.getStudentID() == obj.getStudentID())
                .findFirst()
                .orElseThrow();

        studentToUpdate.setEnrolledCourses(obj.getEnrolledCourses());
        studentToUpdate.setTotalCredits(obj.getTotalCredits());
        studentToUpdate.setFirstName(obj.getFirstName());
        studentToUpdate.setLastName(obj.getLastName());

        return studentToUpdate;
    }
}
