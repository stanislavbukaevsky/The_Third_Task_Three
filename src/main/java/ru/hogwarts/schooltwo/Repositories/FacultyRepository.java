package ru.hogwarts.schooltwo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.schooltwo.Model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
