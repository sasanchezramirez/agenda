package com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Mapper;

import com.agenda.agenda.Domain.Model.Student;
import com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Entity.StudentEntity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AgendaMapper {
    public Student studentEntitytoStudent(StudentEntity studentEntity) {
        return new Student();
    }

    public StudentEntity studentToStudentEntity(Student student) {
        return new StudentEntity();
    }
}
