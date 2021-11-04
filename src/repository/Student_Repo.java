package repository;

import model.Student;

public class Student_Repo extends InMemoryRepository<Student> {

    @Override
    public Student update(Student obj) {
        Student studentToUpdate = this.repoList.stream()
                .filter(student -> student.getStudentID() == obj.getStudentID())
                .findFirst()
                .orElseThrow();

        //studentToUpdate.setEnrolledCourses(obj.getEnrolledCourses()); #####ask about this
        //studentToUpdate.setTotalCredits(obj.getTotalCredits()); #####and this
        studentToUpdate.setFirstName(obj.getFirstName());
        studentToUpdate.setLastName(obj.getLastName());

        return studentToUpdate;
    }
}
