package repository;

import model.Student;

import java.util.List;

public class Student_Repo extends InMemoryRepository<Student> {

    List<Student> students;

    /**
     * updates a certain student in the repo by giving it the attributes of an as parameter given student
     * @param obj
     * @return the updated student
     */
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
