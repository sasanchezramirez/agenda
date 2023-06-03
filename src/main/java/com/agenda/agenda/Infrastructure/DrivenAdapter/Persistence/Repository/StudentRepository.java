package com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Repository;

import com.agenda.agenda.Infrastructure.DrivenAdapter.Persistence.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
