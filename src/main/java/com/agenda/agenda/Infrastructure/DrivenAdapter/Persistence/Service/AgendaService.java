package com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Service;

import com.agenda.agenda.Domain.Gateway.AgendaGateway;
import com.agenda.agenda.Domain.Model.Student;
import com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Entity.StudentEntity;
import com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Mapper.AgendaMapper;
import com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AgendaService implements AgendaGateway {
    private final StudentRepository studentRepository;
    private final AgendaMapper agendaMapper;

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Optional<Student> findStudent(Integer id) {
        return studentRepository.findById(id)
                .map(this.agendaMapper::studentEntitytoStudent);
    }

    @Override
    public List<Student> getStudents() {
        return this.studentRepository.findAll()
                .stream().map(this.agendaMapper::studentEntitytoStudent).toList();
    }

    @Override
    public Student updateStudent(Student student) {
        StudentEntity studentEntity = this.agendaMapper.studentToStudentEntity(student);
        StudentEntity studentEntityUpdated = this.studentRepository.save(studentEntity);
        return this.agendaMapper.studentEntitytoStudent(studentEntityUpdated);
    }

    @Override
    public Boolean deleteStudent(Integer id) {
        return null;
    }
}
