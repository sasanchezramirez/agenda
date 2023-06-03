package com.agenda.agenda.Domain.Gateway;

import com.agenda.agenda.Domain.Model.Student;
import com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface AgendaGateway {
    Student saveStudent(Student student);
    Optional<Student> findStudent(Integer id);
    List<Student> getStudents();
    Student updateStudent(Student student);
    Boolean deleteStudent(Integer id);
}
