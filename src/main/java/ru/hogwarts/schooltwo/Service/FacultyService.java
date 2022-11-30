package ru.hogwarts.schooltwo.Service;

import org.springframework.stereotype.Service;
import ru.hogwarts.schooltwo.Model.Faculty;
import ru.hogwarts.schooltwo.Repositories.FacultyRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Service
public class FacultyService {
    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> matchingFacultiesByColor(String color) {
        ArrayList<Faculty> resultFaculty = new ArrayList<>();
        for (Faculty faculty : facultyRepository.findAll()) {
            if (Objects.equals(faculty.getColor(), color)) {
                resultFaculty.add(faculty);
            }
        }
        return resultFaculty;
    }
}
