package repository;

import model.Teacher;

public class Teacher_Repo extends InMemoryRepository<Teacher> {

    @Override
    public Teacher update(Teacher obj) {
        Teacher teacherToUpdate = this.repoList.stream()
                .filter(teacher -> teacher.getClass() == obj.getClass())
                .findFirst()
                .orElseThrow();

        //teacherToUpdate.setCourses(obj.getCourses()); ##### ask about this too
        teacherToUpdate.setFirstName(obj.getFirstName());
        teacherToUpdate.setLastName(obj.getLastName());

        return teacherToUpdate;

    }
}
