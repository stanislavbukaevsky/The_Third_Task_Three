package ru.hogwarts.schooltwo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.schooltwo.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
